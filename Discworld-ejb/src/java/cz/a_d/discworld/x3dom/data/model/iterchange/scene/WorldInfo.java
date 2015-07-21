/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.scene;

import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import java.util.List;
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
public class WorldInfo extends X3DObject {

    /**
     * The title field is intended to store the name or title of the world so that browsers can present this to the user (perhaps in the
     * window border).
     */
    @XmlAttribute
    protected String info;

    /**
     * Field to add metadata information.
     */
    protected List<X3DMetadata> metadata;

    /**
     * Information about the world can be stored in the info field, such as author information, copyright, and usage instructions.
     */
    @XmlAttribute
    protected String title;

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the value of metadata
     *
     * @return the value of metadata
     */
    public List<X3DMetadata> getMetadata() {
        return metadata;
    }

    /**
     * Set the value of metadata
     *
     * @param metadata new value of metadata
     */
    public void setMetadata(List<X3DMetadata> metadata) {
        this.metadata = metadata;
    }

    /**
     * Get the value of info
     *
     * @return the value of info
     */
    public String getInfo() {
        return info;
    }

    /**
     * Set the value of info
     *
     * @param info new value of info
     */
    public void setInfo(String info) {
        this.info = info;
    }

}
