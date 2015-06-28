/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.scene;

import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.X3DVec3f;
import cz.a_d.discworld.x3dom.data.apprance.Appearance;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import cz.a_d.discworld.x3dom.data.model.Geometry;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author maslu02
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
public class Shape {

    /**
     * Holds the appearance node.
     */
    @XmlElement
    protected Appearance appearance;

    /**
     * Center of the bounding box.
     */
    protected X3DAxisVector bboxCenter;

    /**
     * Size of the bounding box.
     */
    protected X3DAxisVector bboxSize;

    /**
     * Holds the geometry node.
     */
    protected Geometry geometry;

    /**
     * Defines whether the shape is pickable.
     */
    @XmlAttribute(name = "isPickable")
    protected Boolean pickable;

    /**
     * Holds the id offset for MultiPart picking.
     */
    @XmlAttribute(name = "isPickable")
    protected Integer pickableOffsetId;

    /**
     * Field to add metadata information.
     */
    @XmlElement
    protected List<X3DMetadata> metadata;

    /**
     * Flag to enable/disable rendering.
     */
    @XmlAttribute
    protected Boolean render;

    /**
     * Get the value of render
     *
     * @return the value of render
     */
    public Boolean isRender() {
        return render;
    }

    /**
     * Set the value of render
     *
     * @param render new value of render
     */
    public void setRender(Boolean render) {
        this.render = render;
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
     * Get the value of pickableOffsetId
     *
     * @return the value of pickableOffsetId
     */
    public Integer getPickableOffsetId() {
        return pickableOffsetId;
    }

    /**
     * Set the value of pickableOffsetId
     *
     * @param pickableOffsetId new value of pickableOffsetId
     */
    public void setPickableOffsetId(Integer pickableOffsetId) {
        this.pickableOffsetId = pickableOffsetId;
    }

    /**
     * Get the value of pickable
     *
     * @return the value of pickable
     */
    public Boolean isPickable() {
        return pickable;
    }

    /**
     * Set the value of pickable
     *
     * @param pickable new value of pickable
     */
    public void setPickable(Boolean pickable) {
        this.pickable = pickable;
    }

    /**
     * Get the value of geometry
     *
     * @return the value of geometry
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Set the value of geometry
     *
     * @param geometry new value of geometry
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * Get the value of bboxSize
     *
     * @return the value of bboxSize
     */
    @XmlAttribute
    public String getBboxSize() {
        String retValue = null;
        if (bboxSize != null) {
            retValue = bboxSize.toString();
        }
        return retValue;
    }

    /**
     * Get current configuration of size in form of instance of vector with values.
     *
     * @return null in case when instance is using default configuration, otherwise instance of vector with valid configuration.
     */
    public X3DAxisVector getBboxSizeObj() {
        return bboxSize;
    }

    /**
     * Set the value of bboxSize
     *
     * @param bboxSize new value of bboxSize
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setBboxSize(String bboxSize) throws X3DException {
        if (bboxSize != null && (!bboxSize.isEmpty())) {
            if (this.bboxSize == null) {
                this.bboxSize = new X3DAxisVector(bboxSize);
            } else {
                this.bboxSize.fromString(bboxSize);
            }
        }
    }

    /**
     * Set size of bbox by using instance of vector.
     *
     * @param bboxSize null in case when current instance should use default configuration, othewise instance of vector with valid values
     *                 for size.
     */
    public void setBboxSize(X3DAxisVector bboxSize) {
        this.bboxSize = bboxSize;
    }

    /**
     * Get the value of bboxCenter
     *
     * @return the value of bboxCenter
     */
    public String getBboxCenter() {
        String retValue = null;
        if (bboxCenter != null) {
            retValue = bboxCenter.toString();
        }
        return retValue;
    }

    /**
     * Get bbox center coordinates in form of instance of vector.
     *
     * @return null in case when default configuration is used, otherwise instance of vector with current configuration.
     */
    public X3DAxisVector getBboxCenterObj() {
        return bboxCenter;
    }

    /**
     * Set the value of bboxCenter
     *
     * @param bboxCenter new value of bboxCenter
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setBboxCenter(String bboxCenter) throws X3DException {
        if (bboxCenter != null && (!bboxCenter.isEmpty())) {
            if (this.bboxSize == null) {
                this.bboxSize = new X3DAxisVector(bboxCenter);
            } else {
                this.bboxCenter.fromString(bboxCenter);
            }
        }
    }

    /**
     * Set coordinates for bbox center by using instance of vector.
     *
     * @param bboxCenter null in case when current instance should use default configuration, otherwise instance of vector with valid
     *                   coordinates.
     */
    public void setBboxCenter(X3DAxisVector bboxCenter) {
        this.bboxCenter = bboxCenter;
    }

    /**
     * Get the value of appearance
     *
     * @return the value of appearance
     */
    public Appearance getAppearance() {
        return appearance;
    }

    /**
     * Set the value of appearance
     *
     * @param appearance new value of appearance
     */
    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

}