/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.x3dom.handler;

import cz.a_d.discworld.x3dom.X3d;
import java.io.Serializable;
import java.io.StringWriter;
import javax.annotation.PostConstruct;
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
}
