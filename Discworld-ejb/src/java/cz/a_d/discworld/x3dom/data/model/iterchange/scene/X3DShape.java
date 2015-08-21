/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.scene;

import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.apprance.X3DAppearance;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import cz.a_d.discworld.x3dom.data.model.iterchange.geometry.X3DBox;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.CAD;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.GeoSpatial;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.Immersive;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.Interactive;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.Nurbs;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.TwoDimension;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.util.ArrayList;
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
@XmlType(name = "shape")
@XmlAccessorType(XmlAccessType.NONE)
public class X3DShape extends X3DObject {

    /**
     * Holds the appearance node.
     */
    @XmlElement
    protected X3DAppearance appearance;

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

//    protected Geometry geometry;
    protected CAD cad;

    protected GeoSpatial geoSpatial;

    protected Immersive immersive;

    protected Interactive interactive;

    protected Nurbs nurbs;

    protected TwoDimension twoDimension;

//    protected Interchange interchange;
    @XmlElement
    protected List<X3DBox> box;

    /**
     * Get the value of box
     *
     * @return the value of box
     */
    public List<X3DBox> getBox() {
        return box;
    }

    /**
     * Set the value of box
     *
     * @param box new value of box
     */
    public void setBox(List<X3DBox> box) {
        this.box = box;
    }

    /**
     * Add box to list, in case when there is no list method will initialize new one.
     *
     * @param box must be non empty valid box definition.
     */
    public void addBox(X3DBox box) {
        if (box != null) {
            if (this.box == null) {
                this.box = new ArrayList<>();
            }
            this.box.add(box);
        }
    }

    // TODO rest of interchange objects.
    /**
     * Get the value of twoDimension
     *
     * @return the value of twoDimension
     */
    public TwoDimension getTwoDimension() {
        return twoDimension;
    }

    /**
     * Set the value of twoDimension
     *
     * @param twoDimension new value of twoDimension
     */
    public void setTwoDimension(TwoDimension twoDimension) {
        this.twoDimension = twoDimension;
    }

    /**
     * Get the value of nurbs
     *
     * @return the value of nurbs
     */
    public Nurbs getNurbs() {
        return nurbs;
    }

    /**
     * Set the value of nurbs
     *
     * @param nurbs new value of nurbs
     */
    public void setNurbs(Nurbs nurbs) {
        this.nurbs = nurbs;
    }

    /**
     * Get the value of interactive
     *
     * @return the value of interactive
     */
    public Interactive getInteractive() {
        return interactive;
    }

    /**
     * Set the value of interactive
     *
     * @param interactive new value of interactive
     */
    public void setInteractive(Interactive interactive) {
        this.interactive = interactive;
    }

    /**
     * Get the value of immersive
     *
     * @return the value of immersive
     */
    public Immersive getImmersive() {
        return immersive;
    }

    /**
     * Set the value of immersive
     *
     * @param immersive new value of immersive
     */
    public void setImmersive(Immersive immersive) {
        this.immersive = immersive;
    }

    /**
     * Get the value of geoSpatial
     *
     * @return the value of geoSpatial
     */
    public GeoSpatial getGeoSpatial() {
        return geoSpatial;
    }

    /**
     * Set the value of geoSpatial
     *
     * @param geoSpatial new value of geoSpatial
     */
    public void setGeoSpatial(GeoSpatial geoSpatial) {
        this.geoSpatial = geoSpatial;
    }

    /**
     * Get the value of cad
     *
     * @return the value of cad
     */
    public CAD getCad() {
        return cad;
    }

    /**
     * Set the value of cad
     *
     * @param cad new value of cad
     */
    public void setCad(CAD cad) {
        this.cad = cad;
    }

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
    public X3DAppearance getAppearance() {
        return appearance;
    }

    /**
     * Set the value of appearance
     *
     * @param appearance new value of appearance
     */
    public void setAppearance(X3DAppearance appearance) {
        this.appearance = appearance;
    }

}
