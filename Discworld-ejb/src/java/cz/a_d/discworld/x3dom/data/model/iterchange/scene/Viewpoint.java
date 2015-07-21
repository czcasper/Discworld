/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.scene;

import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.X3DRotation;
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
public class Viewpoint extends X3DObject {

    /**
     * Pushes/pops the node on/from the top of the bindable stack.
     */
    @XmlAttribute
    protected Boolean bind;

    /**
     * The centerOfRotation field specifies a center about which to rotate the user's eyepoint when in EXAMINE mode.
     */
    protected X3DAxisVector centerOfRotation;

    /**
     * Description of the bindable node.
     */
    @XmlAttribute
    protected String description;

    /**
     * Preferred minimum viewing angle from this viewpoint in radians. Small field of view roughly corresponds to a telephoto lens, large
     * field of view roughly corresponds to a wide-angle lens. Hint: modifying Viewpoint distance to object may be better for zooming.
     * Warning: fieldOfView may not be correct for different window sizes and aspect ratios. Interchange profile hint: this field may be
     * ignored.
     */
    @XmlAttribute
    protected Double fieldOfView;

    @XmlAttribute(name = "isActive")
    protected Boolean active;

    /**
     * Field to add metadata information.
     */
    @XmlElement
    protected List<X3DMetadata> metadata;

    /**
     * The orientation fields of the Viewpoint node specifies relative orientation to the default orientation.
     */
    protected X3DRotation orientation;

    /**
     * The position fields of the Viewpoint node specifies a relative location in the local coordinate system. Position is relative to the
     * coordinate system's origin (0,0,0),
     */
    protected X3DAxisVector position;

    /**
     * Specifies the far plane.
     */
    @XmlAttribute
    protected List<Float> zFar;

    /**
     * Specifies the near plane.
     */
    @XmlAttribute
    protected List<Float> zNear;

    /**
     * Get the value of zNear
     *
     * @return the value of zNear
     */
    public List<Float> getzNear() {
        return zNear;
    }

    /**
     * Set the value of zNear
     *
     * @param zNear new value of zNear
     */
    public void setzNear(List<Float> zNear) {
        this.zNear = zNear;
    }

    /**
     * Get the value of zFar
     *
     * @return the value of zFar
     */
    public List<Float> getzFar() {
        return zFar;
    }

    /**
     * Set the value of zFar
     *
     * @param zFar new value of zFar
     */
    public void setzFar(List<Float> zFar) {
        this.zFar = zFar;
    }

    /**
     * Get the value of position
     *
     * @return the value of position
     */
    @XmlAttribute
    public String getPosition() {
        String retValue = null;
        if (position != null) {
            retValue = position.toString();
        }
        return retValue;
    }

    /**
     * Get java vector representation of postion.
     *
     * @return null in case when position is default or instance of vector which defines position.
     */
    public X3DAxisVector getPositionObj() {
        return position;
    }

    /**
     * Set the value of position
     *
     * @param position new value of position
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setPosition(String position) throws X3DException {
        if (position != null && (!position.isEmpty())) {
            if (this.position == null) {
                this.position = new X3DAxisVector(position);
            } else {
                this.position.fromString(position);
            }
        }
    }

    /**
     * Set position from object represetation.
     *
     * @param position instance of object position or null in case when default should be used.
     */
    public void setPosition(X3DAxisVector position) {
        this.position = position;
    }

    /**
     * Get the value of orientation
     *
     * @return the value of orientation
     */
    @XmlAttribute
    public String getOrientation() {
        String retValue = null;
        if (orientation != null) {
            retValue = orientation.toString();
        }
        return retValue;
    }

    /**
     * Get orientation represented by object.
     *
     * @return null in case when default orientation is used, otherwise instance of rotation vector.
     */
    public X3DRotation getOrientationObj() {
        return orientation;
    }

    /**
     * Set the value of orientation
     *
     * @param orientation new value of orientation
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setOrientation(String orientation) throws X3DException {
        if (orientation != null && (!orientation.isEmpty())) {
            if (this.orientation == null) {
                this.orientation = new X3DRotation(orientation);
            } else {
                this.orientation.fromString(orientation);
            }
        }
    }

    /**
     * Set value of rotation for current view point, from object representation.
     *
     * @param orientation can be null in case when you want to switch to default orientation values, otherwise must contain valid instance
     *                    or rotation.
     */
    public void setOrientation(X3DRotation orientation) {
        this.orientation = orientation;
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
     * Get the value of fieldOfView
     *
     * @return the value of fieldOfView
     */
    public Double getFieldOfView() {
        return fieldOfView;
    }

    /**
     * Set the value of fieldOfView
     *
     * @param fieldOfView new value of fieldOfView
     */
    public void setFieldOfView(Double fieldOfView) {
        this.fieldOfView = fieldOfView;
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
     * Get the value of centerOfRotation
     *
     * @return the value of centerOfRotation
     */
    @XmlAttribute
    public String getCenterOfRotation() {
        String retValue = null;
        if (centerOfRotation != null) {
            retValue = centerOfRotation.toString();
        }
        return retValue;
    }

    /**
     * Get position of center for rotation in form of object representation.
     *
     * @return null in case when default center of rotation is used, otherwise instance of vector with position definition.
     */
    public X3DAxisVector getCenterOfRotationObj() {
        return centerOfRotation;
    }

    /**
     * Set the value of centerOfRotation
     *
     * @param centerOfRotation new value of centerOfRotation
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setCenterOfRotation(String centerOfRotation) throws X3DException {
        if (centerOfRotation != null && (!centerOfRotation.isEmpty())) {
            if (this.centerOfRotation == null) {
                this.centerOfRotation = new X3DAxisVector(centerOfRotation);
            } else {
                this.centerOfRotation.fromString(centerOfRotation);
            }
        }
    }

    /**
     * Set center of rotation by using object representation of position.
     *
     * @param centerOfRotation
     */
    public void setCenterOfRotation(X3DAxisVector centerOfRotation) {
        this.centerOfRotation = centerOfRotation;
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

}
