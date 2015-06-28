/*
 */
package cz.a_d.discworld.x3dom.data.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author maslu02
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class X3DMetadata<T> {

    /**
     * The specification of a non-empty value for the name field is required.
     */
    @XmlAttribute(required = true)
    protected String name;

    /**
     * The specification of the reference field is optional. If provided, it identifies the metadata standard or other specification that
     * defines the name field. If the reference field is not provided or is empty, the meaning of the name field is considered implicit to
     * the characters in the string.
     */
    @XmlAttribute
    protected String reference;

    /**
     * Get the value of reference
     *
     * @return the value of reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * Set the value of reference
     *
     * @param reference new value of reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    public abstract T getValue();

    public abstract void setValue(T value);
}
