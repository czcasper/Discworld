/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.geometry;

import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a cone which is centred in the local coordinate system and whose central axis is aligned with the local Y-axis. By default, the
 * cone has a radius of 1.0 at the bottom and a height of 2.0
 *
 * @author maslu02
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Cone extends X3DObject {

    /**
     * The bottom field specifies whether the bottom cap of the cone is created.
     */
    @XmlAttribute
    protected Boolean bottom;

    /**
     * The bottomRadius field specifies the radius of the cone's base.
     */
    @XmlAttribute
    protected Double bottomRadius;

    /**
     * The ccw field defines the ordering of the vertex coordinates of the geometry with respect to user-given or automatically generated
     * normal vectors used in the lighting model equations.
     */
    @XmlAttribute
    protected Boolean ccw;

    /**
     * The height field specifies the height of the cone from the centre of the base to the apex.
     */
    @XmlAttribute
    protected Double height;

    /**
     * Specifies whether this geometry should be rendered with or without lighting.
     */
    @XmlAttribute
    protected Boolean lit;

    /**
     * Field to add metadata information.
     */
    protected List<X3DMetadata> metadata;

    /**
     * The side field specifies whether sides of the cone are created.
     */
    @XmlAttribute
    protected Boolean side;

    /**
     * Specifies whether backface-culling is used. If solid is TRUE only front-faces are drawn.
     */
    @XmlAttribute
    protected Boolean solid;

    /**
     * Specifies the number of faces that are generated to approximate the sides of the cone.
     */
    @XmlAttribute
    protected Double subdivision;

    /**
     * The top field specifies whether the top cap of the cone is created.
     */
    @XmlAttribute
    protected Boolean top;

    /**
     * The topRadius field specifies the radius of the cone at the apex.
     */
    @XmlAttribute
    protected Double topRadius;

    /**
     * Most geo primitives use geo cache and others might later on, but one should be able to disable cache per geometry node.
     */
    @XmlAttribute
    protected Boolean useGeoCache;

    /**
     * Get the value of useGeoCache
     *
     * @return the value of useGeoCache
     */
    public Boolean isUseGeoCache() {
        return useGeoCache;
    }

    /**
     * Set the value of useGeoCache
     *
     * @param useGeoCache new value of useGeoCache
     */
    public void setUseGeoCache(Boolean useGeoCache) {
        this.useGeoCache = useGeoCache;
    }

    /**
     * Get the value of topRadius
     *
     * @return the value of topRadius
     */
    public Double getTopRadius() {
        return topRadius;
    }

    /**
     * Set the value of topRadius
     *
     * @param topRadius new value of topRadius
     */
    public void setTopRadius(Double topRadius) {
        this.topRadius = topRadius;
    }

    /**
     * Get the value of top
     *
     * @return the value of top
     */
    public Boolean isTop() {
        return top;
    }

    /**
     * Set the value of top
     *
     * @param top new value of top
     */
    public void setTop(Boolean top) {
        this.top = top;
    }

    /**
     * Get the value of subdivision
     *
     * @return the value of subdivision
     */
    public Double getSubdivision() {
        return subdivision;
    }

    /**
     * Set the value of subdivision
     *
     * @param subdivision new value of subdivision
     */
    public void setSubdivision(Double subdivision) {
        this.subdivision = subdivision;
    }

    /**
     * Get the value of solid
     *
     * @return the value of solid
     */
    public Boolean isSolid() {
        return solid;
    }

    /**
     * Set the value of solid
     *
     * @param solid new value of solid
     */
    public void setSolid(Boolean solid) {
        this.solid = solid;
    }

    /**
     * Get the value of side
     *
     * @return the value of side
     */
    public Boolean isSide() {
        return side;
    }

    /**
     * Set the value of side
     *
     * @param side new value of side
     */
    public void setSide(Boolean side) {
        this.side = side;
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
     * Get the value of lit
     *
     * @return the value of lit
     */
    public Boolean isLit() {
        return lit;
    }

    /**
     * Set the value of lit
     *
     * @param lit new value of lit
     */
    public void setLit(Boolean lit) {
        this.lit = lit;
    }

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * Get the value of ccw
     *
     * @return the value of ccw
     */
    public Boolean isCcw() {
        return ccw;
    }

    /**
     * Set the value of ccw
     *
     * @param ccw new value of ccw
     */
    public void setCcw(Boolean ccw) {
        this.ccw = ccw;
    }

    /**
     * Get the value of bottomRadius
     *
     * @return the value of bottomRadius
     */
    public Double getBottomRadius() {
        return bottomRadius;
    }

    /**
     * Set the value of bottomRadius
     *
     * @param bottomRadius new value of bottomRadius
     */
    public void setBottomRadius(Double bottomRadius) {
        this.bottomRadius = bottomRadius;
    }

    /**
     * Get the value of bottom
     *
     * @return the value of bottom
     */
    public Boolean isBottom() {
        return bottom;
    }

    /**
     * Set the value of bottom
     *
     * @param bottom new value of bottom
     */
    public void setBottom(Boolean bottom) {
        this.bottom = bottom;
    }

}
