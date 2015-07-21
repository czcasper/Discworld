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
public class NavigationInfo extends X3DObject {

    /**
     * avatarSize triplet values are: (a) collision distance between user and geometry (near culling plane of the view frustrum) (b) viewer
     * height above terrain (c) tallest height viewer can WALK over. Hint: keep (avatarSize.CollisionDistance / visibilityLimit) less then;
     * 10,000 to avoid aliasing artifacts (i.e. polygon 'tearing'). Interchange profile hint: this field may be ignored.
     */
    @XmlAttribute
    protected List<Float> avatarSize;

    /**
     * Pushes/pops the node on/from the top of the bindable stack.
     */
    @XmlAttribute
    protected Boolean bind;

    /**
     * Description of the bindable node.
     */
    @XmlAttribute
    protected String description;

    /**
     * Allows restricting examine and turntable navigation, overrides mouse buttons (useful for special viewers).
     */
    @XmlAttribute
    protected ExplorationMode explorationMode;

    /**
     * Enable/disable directional light that always points in the direction the user is looking.
     */
    @XmlAttribute
    protected Boolean headlight;

    @XmlAttribute(name = "isActive")
    protected Boolean active;

    /**
     * Field to add metadata information.
     */
    protected List<X3DMetadata> metadata;

    /**
     * Default rate at which viewer travels through scene, meters/second. Warning: default 1 m/s usually seems slow for ordinary navigation.
     * Interchange profile hint: this field may be ignored.
     */
    @XmlAttribute
    protected Float speed;

    /**
     * The transitionTime field specifies the duration of any viewpoint transition.
     */
    @XmlAttribute
    protected Long transitionTime;

    /**
     * Specifies the transition mode.
     */
    @XmlAttribute
    protected List<TransitionType> transitionType;

    /**
     * Defines the navigation type.
     */
    @XmlAttribute
    protected List<NavigationType> type;

    /**
     * Specifies the view angle and height for helicopter mode and min/max rotation angle for turntable in ]0, PI[, starting from +y (0)
     * down to -y (PI).
     */
    @XmlAttribute
    protected List<Float> typeParams;

    /**
     * Geometry beyond the visibilityLimit may not be rendered (far culling plane of the view frustrum). visibilityLimit=0.0 indicates an
     * infinite visibility limit. Hint: keep visibilityLimit greater than zero. Hint: keep (avatarSize.CollisionDistance / visibilityLimit)
     * less than 10,000 to avoid aliasing artifacts (i.e. polygon 'tearing'). Interchange profile hint: this field may be ignored.
     */
    @XmlAttribute
    protected Float visibilityLimit;

    /**
     * Get the value of visibilityLimit
     *
     * @return the value of visibilityLimit
     */
    public Float getVisibilityLimit() {
        return visibilityLimit;
    }

    /**
     * Set the value of visibilityLimit
     *
     * @param visibilityLimit new value of visibilityLimit
     */
    public void setVisibilityLimit(Float visibilityLimit) {
        this.visibilityLimit = visibilityLimit;
    }

    /**
     * Get the value of typeParams
     *
     * @return the value of typeParams
     */
    public List<Float> getTypeParams() {
        return typeParams;
    }

    /**
     * Set the value of typeParams
     *
     * @param typeParams new value of typeParams
     */
    public void setTypeParams(List<Float> typeParams) {
        this.typeParams = typeParams;
    }

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public List<NavigationType> getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(List<NavigationType> type) {
        this.type = type;
    }

    /**
     * Get the value of transitionType
     *
     * @return the value of transitionType
     */
    public List<TransitionType> getTransitionType() {
        return transitionType;
    }

    /**
     * Set the value of transitionType
     *
     * @param transitionType new value of transitionType
     */
    public void setTransitionType(List<TransitionType> transitionType) {
        this.transitionType = transitionType;
    }

    /**
     * Get the value of transitionTime
     *
     * @return the value of transitionTime
     */
    public Long getTransitionTime() {
        return transitionTime;
    }

    /**
     * Set the value of transitionTime
     *
     * @param transitionTime new value of transitionTime
     */
    public void setTransitionTime(Long transitionTime) {
        this.transitionTime = transitionTime;
    }

    /**
     * Get the value of speed
     *
     * @return the value of speed
     */
    public Float getSpeed() {
        return speed;
    }

    /**
     * Set the value of speed
     *
     * @param speed new value of speed
     */
    public void setSpeed(Float speed) {
        this.speed = speed;
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
     * Get the value of active
     *
     * @return the value of active
     */
    public Boolean isActive() {
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
     * Get the value of headlight
     *
     * @return the value of headlight
     */
    public Boolean isHeadlight() {
        return headlight;
    }

    /**
     * Set the value of headlight
     *
     * @param headlight new value of headlight
     */
    public void setHeadlight(Boolean headlight) {
        this.headlight = headlight;
    }

    /**
     * Get the value of explorationMode
     *
     * @return the value of explorationMode
     */
    public ExplorationMode getExplorationMode() {
        return explorationMode;
    }

    /**
     * Set the value of explorationMode
     *
     * @param explorationMode new value of explorationMode
     */
    public void setExplorationMode(ExplorationMode explorationMode) {
        this.explorationMode = explorationMode;
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
     * Get the value of avatarSize
     *
     * @return the value of avatarSize
     */
    public List<Float> getAvatarSize() {
        return avatarSize;
    }

    /**
     * Set the value of avatarSize
     *
     * @param avatarSize new value of avatarSize
     */
    public void setAvatarSize(List<Float> avatarSize) {
        this.avatarSize = avatarSize;
    }

}
