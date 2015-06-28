/*
 */
package cz.a_d.discworld.x3dom.data.model.modelType.geometry;

import cz.a_d.discworld.x3dom.data.model.iterchange.geometry.Box;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author maslu02
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Interchange {

    @XmlElement
    protected List<Box> box;

    /**
     * Get the value of box
     *
     * @return the value of box
     */
    public List<Box> getBox() {
        return box;
    }

    /**
     * Set the value of box
     *
     * @param box new value of box
     */
    public void setBox(List<Box> box) {
        this.box = box;
    }

    /**
     * Add box to list, in case when there is no list method will initialize new one.
     *
     * @param box must be non empty valid box definition.
     */
    public void addBox(Box box) {
        if (box != null) {
            if (this.box == null) {
                this.box = new ArrayList<>();
            }
            this.box.add(box);
        }
    }
}
