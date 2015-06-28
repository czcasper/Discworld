/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.scene;

import cz.a_d.discworld.x3dom.data.X3DColor;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.net.URI;
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
public class Background {

    @XmlAttribute
    protected URI backUrl;

    /**
     * Pushes/pops the node on/from the top of the bindable stack.
     */
    @XmlAttribute
    protected Boolean bind;

    @XmlAttribute
    protected URI bottomUrl;

    /**
     * Cross Origin Mode.
     */
    @XmlAttribute
    protected String crossOrigin;

    /**
     * Description of the bindable node.
     */
    @XmlAttribute
    protected String description;

    @XmlAttribute
    protected URI frontUrl;

    /**
     * Angle of the ground.
     */
    @XmlAttribute
    protected Double groundAngle;

    /**
     * X3DColor of the ground.
     */
    protected X3DColor groundColor;

    @XmlAttribute(name = "isActive")
    protected Boolean active;

    @XmlAttribute
    protected URI leftUrl;

    /**
     * Field to add metadata information.
     */
    @XmlElement
    protected List<X3DMetadata> metadata;

    @XmlAttribute
    protected URI rightUrl;

    /**
     * Angle of the sky.
     */
    @XmlAttribute
    protected Double skyAngle;

    /**
     * X3DColor of the sky.
     */
    protected X3DColor skyColor;

    @XmlAttribute
    protected URI topUrl;

    /**
     * Transparency of the background.
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
     * Get the value of topUrl
     *
     * @return the value of topUrl
     */
    public URI getTopUrl() {
        return topUrl;
    }

    /**
     * Set the value of topUrl
     *
     * @param topUrl new value of topUrl
     */
    public void setTopUrl(URI topUrl) {
        this.topUrl = topUrl;
    }

    /**
     * Get the value of skyColor
     *
     * @return the value of skyColor
     */
    @XmlAttribute
    public String getSkyColor() {
        String retValue = null;
        if (skyColor != null) {
            retValue = skyColor.toString();
        }
        return retValue;
    }

    /**
     * Get collor of sky in form of instance of RGB vector.
     *
     * @return null in case when default configuration is used, otherwise valid instance of RGB vector with currently used configuration.
     */
    public X3DColor getSkyColorObj() {
        return skyColor;
    }

    /**
     * Set the value of skyColor
     *
     * @param skyColor new value of skyColor
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setSkyColor(String skyColor) throws X3DException {
        if (skyColor != null && (!skyColor.isEmpty())) {
            if (this.skyColor == null) {
                this.skyColor = new X3DColor(skyColor);
            } else {
                this.skyColor.fromString(skyColor);
            }
        }
    }

    public void setSkyColor(X3DColor skyColor) {
        this.skyColor = skyColor;
    }

    /**
     * Get the value of skyAngle
     *
     * @return the value of skyAngle
     */
    public Double getSkyAngle() {
        return skyAngle;
    }

    /**
     * Set the value of skyAngle
     *
     * @param skyAngle new value of skyAngle
     */
    public void setSkyAngle(Double skyAngle) {
        this.skyAngle = skyAngle;
    }

    /**
     * Get the value of rightUrl
     *
     * @return the value of rightUrl
     */
    public URI getRightUrl() {
        return rightUrl;
    }

    /**
     * Set the value of rightUrl
     *
     * @param rightUrl new value of rightUrl
     */
    public void setRightUrl(URI rightUrl) {
        this.rightUrl = rightUrl;
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
     * Get the value of leftUrl
     *
     * @return the value of leftUrl
     */
    public URI getLeftUrl() {
        return leftUrl;
    }

    /**
     * Set the value of leftUrl
     *
     * @param leftUrl new value of leftUrl
     */
    public void setLeftUrl(URI leftUrl) {
        this.leftUrl = leftUrl;
    }

    /**
     * Get the value of active
     *
     * @return the value of active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Set the value of active
     *
     * @param active new value of active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Get the value of groundColor
     *
     * @return the value of groundColor
     */
    @XmlAttribute
    public String getGroundColor() {
        String retValue = null;
        if (groundColor != null) {
            retValue = groundColor.toString();
        }
        return retValue;
    }

    /**
     * Get color of ground in form of instance of RGB vector.
     *
     * @return null in case when default value is currently used, otherwise valid instance of RGB vector.
     */
    public X3DColor getGroundColorObj() {
        return groundColor;
    }

    /**
     * Set the value of groundColor
     *
     * @param groundColor new value of groundColor
     */
    public void setGroundColor(String groundColor) throws X3DException {
        if (groundColor != null && (!groundColor.isEmpty())) {
            if (this.groundColor == null) {
                this.groundColor = new X3DColor(groundColor);
            } else {
                this.groundColor.fromString(groundColor);
            }
        }
    }

    /**
     * Set color of ground by using instance of RGB vector.
     *
     * @param groundColor null in case when default configuration should be used, otherwise valid instance of RGB vector is expected.
     */
    public void setGroundColor(X3DColor groundColor) {
        this.groundColor = groundColor;
    }

    /**
     * Get the value of groundAngle
     *
     * @return the value of groundAngle
     */
    public Double getGroundAngle() {
        return groundAngle;
    }

    /**
     * Set the value of groundAngle
     *
     * @param groundAngle new value of groundAngle
     */
    public void setGroundAngle(Double groundAngle) {
        this.groundAngle = groundAngle;
    }

    /**
     * Get the value of frontUrl
     *
     * @return the value of frontUrl
     */
    public URI getFrontUrl() {
        return frontUrl;
    }

    /**
     * Set the value of frontUrl
     *
     * @param frontUrl new value of frontUrl
     */
    public void setFrontUrl(URI frontUrl) {
        this.frontUrl = frontUrl;
    }

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the value of crossOrigin
     *
     * @return the value of crossOrigin
     */
    public String getCrossOrigin() {
        return crossOrigin;
    }

    /**
     * Set the value of crossOrigin
     *
     * @param crossOrigin new value of crossOrigin
     */
    public void setCrossOrigin(String crossOrigin) {
        this.crossOrigin = crossOrigin;
    }

    /**
     * Get the value of bottomUrl
     *
     * @return the value of bottomUrl
     */
    public URI getBottomUrl() {
        return bottomUrl;
    }

    /**
     * Set the value of bottomUrl
     *
     * @param bottomUrl new value of bottomUrl
     */
    public void setBottomUrl(URI bottomUrl) {
        this.bottomUrl = bottomUrl;
    }

    /**
     * Get the value of bind
     *
     * @return the value of bind
     */
    public Boolean isBind() {
        return bind;
    }

    /**
     * Set the value of bind
     *
     * @param bind new value of bind
     */
    public void setBind(Boolean bind) {
        this.bind = bind;
    }

    /**
     * Get the value of backUrl
     *
     * @return the value of backUrl
     */
    public URI getBackUrl() {
        return backUrl;
    }

    /**
     * Set the value of backUrl
     *
     * @param backUrl new value of backUrl
     */
    public void setBackUrl(URI backUrl) {
        this.backUrl = backUrl;
    }

}
