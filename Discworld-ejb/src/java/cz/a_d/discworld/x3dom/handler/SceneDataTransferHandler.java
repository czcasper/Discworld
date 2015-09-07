/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.x3dom.handler;

import cz.a_d.discworld.datamodel.universe.Material;
import cz.a_d.discworld.datamodel.universe.geodata.Cube;
import cz.a_d.discworld.x3dom.X3DDeltaMessage;
import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.X3d;
import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.X3DColor;
import cz.a_d.discworld.x3dom.data.apprance.X3DAppearance;
import cz.a_d.discworld.x3dom.data.apprance.X3DMaterial;
import cz.a_d.discworld.x3dom.data.model.X3DScene;
import cz.a_d.discworld.x3dom.data.model.iterchange.geometry.X3DBox;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.X3DShape;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.X3DTransform;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.awt.Color;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;

/**
 *
 * @author casper
 */
@Stateless
@LocalBean
public class SceneDataTransferHandler implements Serializable {

    protected Marshaller marshaller;
    protected Marshaller shapeMarchaller;
    protected JAXBIntrospector introspector;

    public SceneDataTransferHandler() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(X3d.class);
        marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);

        context = JAXBContext.newInstance(X3DDeltaMessage.class);
        introspector = context.createJAXBIntrospector();
        shapeMarchaller = context.createMarshaller();
        shapeMarchaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
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

    public String generateDelta(X3DScene parent, X3DTransform cube) {
        String retValue = null;
        if (parent != null && cube != null) {

            X3DDeltaMessage message = new X3DDeltaMessage("create", cube, parent.getId());
            try {
                StringWriter result = new StringWriter();
                shapeMarchaller.marshal(message, result);
                retValue = result.toString();
            } catch (JAXBException ex) {
                Logger.getLogger(SceneDataTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retValue;
    }
    
    public String generateDeltaMessage(String operationType, X3DObject parent,X3DObject ... objects){
        return generateDeltaMessage(operationType, parent, false, Arrays.asList(objects));
    }

    public String generateDeltaMessage(String operationType, X3DObject parent,boolean justId,X3DObject ... objects){
        return generateDeltaMessage(operationType, parent, justId, Arrays.asList(objects));
    }

    public <T extends X3DObject> String generateDeltaMessage(String operationType, T parent, boolean justId, List<X3DObject> objects) {
        String retValue = null;
        if (parent != null && objects != null && (!objects.isEmpty())) {
            List<X3DObject> toProcess = objects;
            if (justId) {
                toProcess = new ArrayList<>(objects.size());
                for (X3DObject original : objects) {
                    try {
                        X3DObject tmp = original.getClass().newInstance();
                        tmp.setId(original.getId());
                        toProcess.add(tmp);
                    } catch (InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(SceneDataTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            X3DDeltaMessage message = new X3DDeltaMessage(operationType, toProcess, parent.getId());
            try {
                StringWriter result = new StringWriter();
                shapeMarchaller.marshal(message, result);
                retValue = result.toString();
            } catch (JAXBException ex) {
                Logger.getLogger(SceneDataTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retValue;
    }
}
