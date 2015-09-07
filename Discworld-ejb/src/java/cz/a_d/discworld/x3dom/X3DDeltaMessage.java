/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.x3dom;

import cz.a_d.discworld.x3dom.data.model.iterchange.scene.X3DTransform;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 *
 * @author casper
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "x3dDelta")
@XmlSeeAlso({X3DTransform.class})
public class X3DDeltaMessage {

    @XmlAttribute
    protected String operationType;

    protected List<X3DObject> data;

    @XmlAttribute
    protected String parentID;

    public X3DDeltaMessage() {
    }

    public X3DDeltaMessage(String operationType, X3DObject data, String parentID) {
        this(operationType, new ArrayList<X3DObject>(), parentID);
        this.data.add(data);
    }

    public X3DDeltaMessage(String operationType, List<X3DObject> data, String parentID) {
        this.operationType = operationType;
        this.data = data;
        this.parentID = parentID;
    }

    @XmlAnyElement
    public List<JAXBElement<? extends X3DObject>> getElementData() {
        List<JAXBElement<? extends X3DObject>> retValue = new ArrayList<>();
        if (data != null && (!data.isEmpty())) {
            for (X3DObject obj : data) {
                Class<? extends X3DObject> objClass = obj.getClass();
                String elementName = objClass.getSimpleName();
                if(objClass.isAnnotationPresent(XmlType.class)){
                    XmlType typeAnnot = objClass.getAnnotation(XmlType.class);
                    elementName = typeAnnot.name();
                }else if (objClass.isAnnotationPresent(XmlRootElement.class)){
                    XmlRootElement rootType = objClass.getAnnotation(XmlRootElement.class);
                    elementName  = rootType.name();
                }
                
                JAXBElement dataElement = new JAXBElement(new QName(elementName),objClass, obj);
                retValue.add(dataElement);
            }
        }
        return retValue;
    }

    /**
     * Get the value of parentID
     *
     * @return the value of parentID
     */
    public String getParentID() {
        return parentID;
    }

    /**
     * Set the value of parentID
     *
     * @param parentID new value of parentID
     */
    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    /**
     * Get the value of data
     *
     * @return the value of data
     */
    public List<X3DObject> getData() {
        return data;
    }

    public boolean addData(X3DObject data) {
        if (data == null) {
            this.data = new ArrayList<>();
        }
        return this.data.add(data);
    }

    /**
     * Set the value of data
     *
     * @param data new value of data
     */
    public void setData(List<X3DObject> data) {
        this.data = data;
    }

    /**
     * Get the value of operationType
     *
     * @return the value of operationType
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Set the value of operationType
     *
     * @param operationType new value of operationType
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

}
