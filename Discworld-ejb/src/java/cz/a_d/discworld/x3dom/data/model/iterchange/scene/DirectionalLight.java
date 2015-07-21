/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.scene;

import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.X3DColor;
import cz.a_d.discworld.x3dom.data.X3DVec3f;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
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
public class DirectionalLight extends X3DObject {

    /**
     * The ambientIntensity specifies the intensity of the ambient emission from the light. Light intensity may range from 0.0 (no light
     * emission) to 1.0 (full intensity).
     */
    @XmlAttribute
    protected Double ambientIntensity;

    /**
     * The color field specifies the spectral colour properties of both the direct and ambient light emission as an RGB value.
     */
    protected X3DColor color;

    /**
     * The direction field specifies the direction vector of the illumination emanating from the light source in the local coordinate
     * system.
     */
    protected X3DAxisVector direction;

    /**
     * Specifies whether the light is global or scoped. Global lights illuminate all objects that fall within their volume of lighting
     * influence. Scoped lights only illuminate objects that are in the same transformation hierarchy as the light; i.e., only the children
     * and descendants of its enclosing parent group are illuminated.
     */
    @XmlAttribute
    protected Boolean global;

    /**
     * The intensity field specifies the brightness of the direct emission from the light. Light intensity may range from 0.0 (no light
     * emission) to 1.0 (full intensity).
     */
    @XmlAttribute
    protected Double intensity;

    /**
     * Field to add metadata information.
     */
    @XmlElement
    protected List<X3DMetadata> metadata;

    /**
     * The on field specifies whether the light is enabled or disabled.
     */
    @XmlAttribute
    protected Boolean on;

    @XmlAttribute
    protected Integer shadowCascades;

    /**
     * Sets the smoothness of the shadow umbra.
     */
    @XmlAttribute
    protected Integer shadowFilterSize;

    /**
     * Defines the attenuation of the shadows.
     */
    @XmlAttribute
    protected Double shadowIntensity;

    /**
     * Specifies the resolution of the used shadow map.
     */
    @XmlAttribute
    protected Integer shadowMapSize;

    /**
     * Defines the shadow offset for the back projection of the shadow map.
     */
    @XmlAttribute
    protected Double shadowOffset;

    @XmlAttribute
    protected Double shadowSplitFactor;

    @XmlAttribute
    protected Double shadowSplitOffset;

    /**
     * Specifies the placement of the far plane of the light projection. Objects that are farther away from the light source than the far
     * plane do not cast shadows. If the zFar value is not set, the far plane is placed automatically.
     */
    @XmlAttribute
    protected Double zFar;

    /**
     * Specifies the placement of the near plane of the light projection. Objects that are closer to the light source than the near plane do
     * not cast shadows. If the zNear value is not set, the near plane is placed automatically.
     */
    @XmlAttribute
    protected Double zNear;

    /**
     * Get the value of zNear
     *
     * @return the value of zNear
     */
    public Double getzNear() {
        return zNear;
    }

    /**
     * Set the value of zNear
     *
     * @param zNear new value of zNear
     */
    public void setzNear(Double zNear) {
        this.zNear = zNear;
    }

    /**
     * Get the value of zFar
     *
     * @return the value of zFar
     */
    public Double getzFar() {
        return zFar;
    }

    /**
     * Set the value of zFar
     *
     * @param zFar new value of zFar
     */
    public void setzFar(Double zFar) {
        this.zFar = zFar;
    }

    /**
     * Get the value of shadowSplitOffset
     *
     * @return the value of shadowSplitOffset
     */
    public Double getShadowSplitOffset() {
        return shadowSplitOffset;
    }

    /**
     * Set the value of shadowSplitOffset
     *
     * @param shadowSplitOffset new value of shadowSplitOffset
     */
    public void setShadowSplitOffset(Double shadowSplitOffset) {
        this.shadowSplitOffset = shadowSplitOffset;
    }

    /**
     * Get the value of shadowSplitFactor
     *
     * @return the value of shadowSplitFactor
     */
    public Double getShadowSplitFactor() {
        return shadowSplitFactor;
    }

    /**
     * Set the value of shadowSplitFactor
     *
     * @param shadowSplitFactor new value of shadowSplitFactor
     */
    public void setShadowSplitFactor(Double shadowSplitFactor) {
        this.shadowSplitFactor = shadowSplitFactor;
    }

    /**
     * Get the value of shadowOffset
     *
     * @return the value of shadowOffset
     */
    public Double getShadowOffset() {
        return shadowOffset;
    }

    /**
     * Set the value of shadowOffset
     *
     * @param shadowOffset new value of shadowOffset
     */
    public void setShadowOffset(Double shadowOffset) {
        this.shadowOffset = shadowOffset;
    }

    /**
     * Get the value of shadowMapSize
     *
     * @return the value of shadowMapSize
     */
    public Integer getShadowMapSize() {
        return shadowMapSize;
    }

    /**
     * Set the value of shadowMapSize
     *
     * @param shadowMapSize new value of shadowMapSize
     */
    public void setShadowMapSize(Integer shadowMapSize) {
        this.shadowMapSize = shadowMapSize;
    }

    /**
     * Get the value of shadowIntensity
     *
     * @return the value of shadowIntensity
     */
    public Double getShadowIntensity() {
        return shadowIntensity;
    }

    /**
     * Set the value of shadowIntensity
     *
     * @param shadowIntensity new value of shadowIntensity
     */
    public void setShadowIntensity(Double shadowIntensity) {
        this.shadowIntensity = shadowIntensity;
    }

    /**
     * Get the value of shadowFilterSize
     *
     * @return the value of shadowFilterSize
     */
    public Integer getShadowFilterSize() {
        return shadowFilterSize;
    }

    /**
     * Set the value of shadowFilterSize
     *
     * @param shadowFilterSize new value of shadowFilterSize
     */
    public void setShadowFilterSize(Integer shadowFilterSize) {
        this.shadowFilterSize = shadowFilterSize;
    }

    /**
     * Get the value of shadowCascades
     *
     * @return the value of shadowCascades
     */
    public Integer getShadowCascades() {
        return shadowCascades;
    }

    /**
     * Set the value of shadowCascades
     *
     * @param shadowCascades new value of shadowCascades
     */
    public void setShadowCascades(Integer shadowCascades) {
        this.shadowCascades = shadowCascades;
    }

    /**
     * Get the value of on
     *
     * @return the value of on
     */
    public Boolean isOn() {
        return on;
    }

    /**
     * Set the value of on
     *
     * @param on new value of on
     */
    public void setOn(Boolean on) {
        this.on = on;
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
     * Get the value of intensity
     *
     * @return the value of intensity
     */
    public Double getIntensity() {
        return intensity;
    }

    /**
     * Set the value of intensity
     *
     * @param intensity new value of intensity
     */
    public void setIntensity(Double intensity) {
        this.intensity = intensity;
    }

    /**
     * Get the value of global
     *
     * @return the value of global
     */
    public Boolean isGlobal() {
        return global;
    }

    /**
     * Set the value of global
     *
     * @param global new value of global
     */
    public void setGlobal(Boolean global) {
        this.global = global;
    }

    /**
     * Get the value of direction
     *
     * @return the value of direction
     */
    @XmlAttribute
    public String getDirection() {
        String retValue = null;
        if (direction != null) {
            retValue = direction.toString();
        }
        return retValue;
    }

    /**
     * Get direction configuration in form of instance of vector.
     *
     * @return null in case when default configuration is used, otherwise instance of vector with valid values for direction.
     */
    public X3DAxisVector getDirectionObj() {
        return direction;
    }

    /**
     * Set the value of direction
     *
     * @param direction new value of direction
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setDirection(String direction) throws X3DException {
        if (direction != null && (!direction.isEmpty())) {
            if (this.direction == null) {
                this.direction = new X3DAxisVector(direction);
            } else {
                this.direction.fromString(direction);
            }
        }
    }

    /**
     * Set direction for light in form of instance of vector.
     *
     * @param direction null in case when default configuration should be used, otherwise instance of vector with valid data.
     */
    public void setDirection(X3DAxisVector direction) {
        this.direction = direction;
    }

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    @XmlAttribute
    public String getColor() {
        String retValue = null;
        if (color != null) {
            retValue = color.toString();
        }
        return retValue;
    }

    /**
     * Get color in RGB vector representation.
     *
     * @return null in case when default configuration is used, otherwise instance of vector with valid values for RGB definition.
     */
    public X3DColor getColorObj() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setColor(String color) throws X3DException {
        if (color != null && (!color.isEmpty())) {
            if (this.color == null) {
                this.color = new X3DColor(color);
            } else {
                this.color.fromString(color);
            }
        }
    }

    /**
     * Set color value by using instance of RGB vector.
     *
     * @param color null in case when current instance should use default configuration, otherwise valid instance of RGB vector.
     */
    public void setColor(X3DColor color) {
        this.color = color;
    }

    /**
     * Get the value of ambientIntensity
     *
     * @return the value of ambientIntensity
     */
    public Double getAmbientIntensity() {
        return ambientIntensity;
    }

    /**
     * Set the value of ambientIntensity
     *
     * @param ambientIntensity new value of ambientIntensity
     */
    public void setAmbientIntensity(Double ambientIntensity) {
        this.ambientIntensity = ambientIntensity;
    }

}
