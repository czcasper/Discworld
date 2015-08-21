/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.geometry;

import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a rectangular parallelepiped box centred at (0, 0, 0) in the local coordinate system and aligned with the local coordinate
 * axes. By default, the box measures 2 units in each dimension, from -1 to +1.
 *
 * @author maslu02
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
public class X3DBox extends X3DObject {

    /**
     * The ccw field defines the ordering of the vertex coordinates of the geometry with respect to user-given or automatically generated
     * normal vectors used in the lighting model equations.
     */
    @XmlAttribute
    protected Boolean ccw;

    /**
     * Specifies whether helper colors should be used, which will color each vertex with a different color. This will overwrite the color of
     * the corresponding appearance node.
     */
    @XmlAttribute
    protected Boolean hasHelperColors;

    /**
     * Specifies whether this geometry should be rendered with or without lighting.
     */
    @XmlAttribute
    protected Boolean lit;

    /**
     * Field to add metadata information.
     */
    @XmlElement
    protected List<X3DMetadata> metadata;

    /**
     * The size field specifies the extents of the box along the X-, Y-, and Z-axes respectively and each component value shall be greater
     * than zero.
     */
    protected X3DAxisVector size;

    /**
     * Specifies whether backface-culling is used. If solid is TRUE only front-faces are drawn.
     */
    @XmlAttribute
    protected Boolean solid;

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
     * Get the value of size
     *
     * @return the value of size
     */
    @XmlAttribute
    public String getSize() {
        String retValue = null;
        if (size != null) {
            retValue = size.toString();
        }
        return retValue;
    }

    public X3DAxisVector getSizeObj() {
        return size;
    }

    /**
     * Set the value of size
     *
     * @param size new value of size
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setSize(String size) throws X3DException {
        if (size != null && (!size.isEmpty())) {
            if (this.size == null) {
                this.size = new X3DAxisVector(size);
            } else {
                this.size.fromString(size);
            }
        }
    }

    /**
     * Set size of box by using vector of sizes.
     *
     * @param size must be vector of positive numbers.
     */
    public void setSize(X3DAxisVector size) {
        this.size = size;
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
     * Get the value of hasHelperColors
     *
     * @return the value of hasHelperColors
     */
    public Boolean isHasHelperColors() {
        return hasHelperColors;
    }

    /**
     * Set the value of hasHelperColors
     *
     * @param hasHelperColors new value of hasHelperColors
     */
    public void setHasHelperColors(Boolean hasHelperColors) {
        this.hasHelperColors = hasHelperColors;
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

}
