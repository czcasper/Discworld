/*
 */
package cz.a_d.discworld.x3dom.data.apprance;

import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.data.X3DColor;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Material node specifies surface material properties for associated geometry nodes and is used by the X3D lighting equations during
 * rendering. All of the fields in the Material node range from 0.0 to 1.0.
 *
 * @author casper
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
public class X3DMaterial extends X3DObject {

    /**
     * The ambientIntensity field specifies how much ambient light from light sources this surface shall reflect. Ambient light is
     * omnidirectional and depends only on the number of light sources, not their positions with respect to the surface. Ambient colour is
     * calculated as ambientIntensity × diffuseColor.
     */
    @XmlAttribute
    protected Double ambientIntensity;

    /**
     * The diffuseColor field reflects all X3D light sources depending on the angle of the surface with respect to the light source. The
     * more directly the surface faces the light, the more diffuse light reflects. The emissiveColor field models "glowing" objects. This
     * can be useful for displaying pre-lit models (where the light energy of the room is computed explicitly), or for displaying scientific
     * data.
     */
    protected X3DColor diffuseColor;

    /**
     * The emissiveColor field models "glowing" objects. This can be useful for displaying pre-lit models (where the light energy of the
     * room is computed explicitly), or for displaying scientific data.
     */
    protected X3DColor emissiveColor;

    /**
     * Field to add metadata information.
     */
    @XmlElement
    protected List<X3DMetadata> metadata;

    /**
     * The specularColor and shininess fields determine the specular highlights (e.g., the shiny spots on an apple). When the angle from the
     * light to the surface is close to the angle from the surface to the viewer, the specularColor is added to the diffuse and ambient
     * colour calculations. Lower shininess values produce soft glows, while higher values result in sharper, smaller highlights.
     */
    @XmlAttribute
    protected Double shininess;

    /**
     * The specularColor and shininess fields determine the specular highlights (e.g., the shiny spots on an apple). When the angle from the
     * light to the surface is close to the angle from the surface to the viewer, the specularColor is added to the diffuse and ambient
     * colour calculations. Lower shininess values produce soft glows, while higher values result in sharper, smaller highlights.
     */
    protected X3DColor specularColor;

    /**
     * The transparency field specifies how "clear" an object is, with 1.0 being completely transparent, and 0.0 completely opaque.
     */
    @XmlAttribute
    protected Double transparency;

    /**
     * Get the value of transparency
     *
     * @return the value of transparency
     */
    public Double getTransparency() {
        return transparency;
    }

    /**
     * Set the value of transparency
     *
     * @param transparency new value of transparency
     */
    public void setTransparency(Double transparency) {
        this.transparency = transparency;
    }

    /**
     * Get the value of specularColor
     *
     * @return the value of specularColor
     */
    @XmlAttribute
    public String getSpecularColor() {
        String retValue = null;
        if (specularColor != null) {
            retValue = specularColor.toString();
        }
        return retValue;
    }

    /**
     * Get specular color of material in form of instance of RGB vector.
     *
     * @return null in case when default configuraion is used, otherwise instance of RGB vecotr.
     */
    public X3DColor getSpecularColorObj() {
        return specularColor;
    }

    /**
     * Set the value of specularColor
     *
     * @param specularColor new value of specularColor
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setSpecularColor(String specularColor) throws X3DException {
        if (specularColor != null && (!specularColor.isEmpty())) {
            if (this.specularColor == null) {
                this.specularColor = new X3DColor(specularColor);
            } else {
                this.specularColor.fromString(specularColor);
            }
        }
    }

    /**
     * Set specular part of material color by using instance of RGB vector.
     *
     * @param specularColor null in case when default configuration should be used, otherwise valid instance of RGB vector.
     */
    public void setSpecularColor(X3DColor specularColor) {
        this.specularColor = specularColor;
    }

    /**
     * Get the value of shininess
     *
     * @return the value of shininess
     */
    public Double getShininess() {
        return shininess;
    }

    /**
     * Set the value of shininess
     *
     * @param shininess new value of shininess
     */
    public void setShininess(Double shininess) {
        this.shininess = shininess;
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
     * Get the value of emissiveColor
     *
     * @return the value of emissiveColor
     */
    @XmlAttribute
    public String getEmissiveColor() {
        String retValue = null;
        if (emissiveColor != null) {
            retValue = emissiveColor.toString();
        }
        return retValue;
    }

    /**
     * Get emmisive part of material color in from of instance of RGB vector.
     *
     * @return null in case when default configuration is used, otherwise instance of RGB vector.
     */
    public X3DColor getEmissiveColorObj() {
        return emissiveColor;
    }

    /**
     * Set the value of emissiveColor
     *
     * @param emissiveColor new value of emissiveColor
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setEmissiveColor(String emissiveColor) throws X3DException {
        if (emissiveColor != null && (!emissiveColor.isEmpty())) {
            if (this.emissiveColor == null) {
                this.emissiveColor = new X3DColor(emissiveColor);
            } else {
                this.emissiveColor.fromString(emissiveColor);
            }
        }
    }

    /**
     * Set emmisive part of material collor by using instance of RGB vector.
     *
     * @param emissiveColor null in case when default configuration should be used, otherwise valid instance of RGB vector is expected.
     */
    public void setEmissiveColor(X3DColor emissiveColor) {
        this.emissiveColor = emissiveColor;
    }

    /**
     * Get the value of diffuseColor
     *
     * @return the value of diffuseColor
     */
    @XmlAttribute
    public String getDiffuseColor() {
        String retValue = null;
        if (diffuseColor != null) {
            retValue = diffuseColor.toString();
        }
        return retValue;
    }

    /**
     * Get material diffuse color in form of instance or RGB vector.
     *
     * @return null in case when default configuration is used, otherwise valid instance with configuration.
     */
    public X3DColor getDiffuseColorObj() {
        return diffuseColor;
    }

    /**
     * Set the value of diffuse Color.
     *
     * @param diffuseColor new value of diffuseColor
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setDiffuseColor(String diffuseColor) throws X3DException {
        if (diffuseColor != null && (!diffuseColor.isEmpty())) {
            if (this.diffuseColor == null) {
                this.diffuseColor = new X3DColor(diffuseColor);
            } else {
                this.diffuseColor.fromString(diffuseColor);
            }
        }
    }

    /**
     * Set value of diffuse color used by material in form of instance of RGB vector.
     *
     * @param diffuseColor null in case when default configuration should be used, otherwise instance of RGB vector with valid configuration
     *                     is expected.
     */
    public void setDiffuseColor(X3DColor diffuseColor) {
        this.diffuseColor = diffuseColor;
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
