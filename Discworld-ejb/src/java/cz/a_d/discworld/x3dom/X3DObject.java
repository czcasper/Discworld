/*
 */
package cz.a_d.discworld.x3dom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Class represent properties which are common for all X3DOM objects.
 *
 * @author casper
 */
@XmlAccessorType(XmlAccessType.NONE)
public class X3DObject {

    /**
     * Id used to target updates or deletes of diplayed/loaded object presented by x3d tag.
     */
    @XmlAttribute
    protected String id;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(String id) {
        this.id = id;
    }

}
