/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.x3dom.handler;

import cz.a_d.discworld.datamodel.universe.geodata.Cube;
import cz.a_d.discworld.x3dom.X3d;
import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.apprance.X3DAppearance;
import cz.a_d.discworld.x3dom.data.apprance.X3DMaterial;
import cz.a_d.discworld.x3dom.data.apprance.X3DShaderNode;
import cz.a_d.discworld.x3dom.data.model.X3DScene;
import cz.a_d.discworld.x3dom.data.model.iterchange.geometry.X3DBox;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.X3DShape;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.X3DTransform;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author casper
 */
@Stateless
@LocalBean
public class SceneDataTransferHandler implements Serializable {

    @EJB
    protected X3DElementIDGenerator generator;

    protected JAXBContext context;
    protected Marshaller marshaller;

    public SceneDataTransferHandler() throws JAXBException {
        context = JAXBContext.newInstance(X3d.class);
        marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
    }

    public String convert(X3d data) throws JAXBException {
        String retValue = null;
        if (data != null) {
            StringWriter result = new StringWriter();
            marshaller.marshal(data, result);
            retValue = result.toString();
        }
        return retValue;
    }

    public X3d createScene(List<Cube> cubes, String id) {
        X3d retValue = null;
        if (cubes != null) {
            retValue = new X3d();
            retValue.setId(id);
            retValue.setHeight("500px");
            retValue.setWidth("1000px");
            X3DScene scena = new X3DScene();
            retValue.addScene(scena);
            generator.generateID(retValue, scena);
            if (!cubes.isEmpty()) {
                for (Cube cube : cubes) {
                    X3DTransform created = createCube(scena, cube);
                    if (created != null) {
                        scena.addTransform(created);
                    }
                }
            }
        }
        return retValue;
    }

    public X3DTransform createCube(X3DScene parent, Cube cube) {
        X3DTransform retValue = null;
        if (parent != null && cube != null) {
            try {
                retValue = new X3DTransform();
                generator.generateID(parent, retValue);
                X3DAxisVector position = new X3DAxisVector();
                position.setX(cube.getxAxis());
                position.setY(cube.getyAxis());
                position.setZ(cube.getzAxis());
                retValue.setTranslation(position);

                X3DShape shape = new X3DShape();
                generator.generateID(retValue, shape);
                retValue.setShape(shape);

                X3DAppearance appearance = new X3DAppearance();
                generator.generateID(shape, appearance);
                shape.setAppearance(appearance);

                X3DMaterial material = new X3DMaterial();
                generator.generateID(appearance, material);
                material.setDiffuseColor("0,1,0");
                appearance.setMaterial(material);

                X3DBox box = new X3DBox();
                generator.generateID(shape, box);
                box.setSize("1.0,1.0,1.0");
                shape.addBox(box);

            } catch (X3DException ex) {
                Logger.getLogger(SceneDataTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return retValue;
    }
}
