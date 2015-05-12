/*
 */
package cz.a_d.discworld.x3dom;

import cz.a_d.discworld.geodata.Cube;
import cz.a_d.discworld.geodata.CubeID;
import java.io.StringWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author casper
 */
@Stateless
@LocalBean
public class CubeToX3dom {

    protected Document doc;
    protected Transformer transformer;

    public CubeToX3dom() {
        try {
            doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
        } catch (ParserConfigurationException | TransformerConfigurationException ex) {
            Logger.getLogger(CubeToX3dom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String convert(Cube c) {
        String retValue = null;
        if (c != null) {
            Node cube = createX3DomCube(c);
            retValue = printDocToString(cube);
        }
        return retValue;
    }

    public String convert(List<Cube> cubes) {
        String retValue = "";
        if (cubes != null && (!cubes.isEmpty())) {
            Element transforms = doc.createElement("transforms");
            for (Cube cube : cubes) {
                transforms.appendChild(createX3DomCube(cube));
            }
            retValue=printDocToString(transforms);
        }
        return retValue;
    }

    protected Node createX3DomCube(Cube c) {
        Node retValue;
        Element transform = doc.createElement("transform");
        CubeID id = c.getId();
        transform.setAttribute("translation", String.format("%d %d %d", id.getxAxis(), id.getyAxis(), id.getzAxis()));
        
        Element shape = doc.createElement("shape");
        Element appearance = doc.createElement("appearance");
        Element material = doc.createElement("material");
        material.setAttribute("diffuseColor", "0 0 1");
        appearance.appendChild(material);
        Element box = doc.createElement("box");
        box.setAttribute("size", "1,1,1");

        shape.appendChild(appearance);
        shape.appendChild(box);
        transform.appendChild(shape);

        retValue = transform;
        return retValue;
    }

    protected String printDocToString(Node node) {
        String retValue = null;
        try {
            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(node);
            transformer.transform(source, result);

            retValue = result.getWriter().toString();

        } catch (TransformerException ex) {
            Logger.getLogger(CubeToX3dom.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retValue;
    }
}
