/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.scene;

import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.X3DRotation;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.DIS;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.Full;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.GeoSpatial;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.HumanoidAnimation;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.Immersive;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.Interactive;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.Nurbs;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.ProtoInstance;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.SceneGraphStructure;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author maslu02
 */
@XmlType(name = "transform")
@XmlAccessorType(XmlAccessType.NONE)
public class X3DTransform extends X3DObject {

    /**
     * Center of the bounding box.
     */
    protected X3DAxisVector bboxCenter;

    /**
     * Size of the bounding box.
     */
    protected X3DAxisVector bboxSize;

    /**
     * The center field specifies a translation offset from the origin of the
     * local coordinate system (0,0,0).
     */
    protected X3DAxisVector center;

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
     * The rotation field specifies a rotation of the coordinate system.
     */
    protected X3DRotation rotation;

    /**
     * The scale field specifies a non-uniform scale of the coordinate system.
     * Scale values may have any value: positive, negative (indicating a
     * reflection), or zero. A value of zero indicates that any child geometry
     * shall not be displayed. Default value: 1,1,1
     */
    protected X3DAxisVector scale;

    /**
     * The scaleOrientation specifies a rotation of the coordinate system before
     * the scale (to specify scales in arbitrary orientations). The
     * scaleOrientation applies only to the scale operation. Default
     * value:0,0,1,0
     */
    protected X3DRotation scaleOrientation;

    /**
     * The translation field specifies a translation to the coordinate system.
     */
    protected X3DAxisVector translation;

    protected DIS dis;

    protected Full full;

    protected GeoSpatial geo;

    protected HumanoidAnimation humanoidAnimation;

    protected Immersive immersive;

    protected Interactive interactive;

    protected Nurbs nurbs;

    protected ProtoInstance protoInstance;

    protected SceneGraphStructure sceneGraphStructure;

//    protected Interchange interchange;
    @XmlElement
    protected Background background;

    @XmlElement
    protected ColorInterpolator colorInterpolator;

    @XmlElement
    protected CoordinateInterpolator coordinateInterpolator;

    @XmlElement
    protected DirectionalLight directionalLight;

    @XmlElement
    protected Group group;

    @XmlElement
    protected NavigationInfo navigationInfo;

    @XmlElement
    protected NormalInterpolator normalInterpolator;

    @XmlElement
    protected OrientationInterpolator orientationInterpolator;

    @XmlElement
    protected PositionInterpolator positionInterpolator;

    @XmlElement
    protected ScalarInterpolator scalarInterpolator;

    @XmlElement
    protected X3DShape shape;

    @XmlElement
    protected TimeSensor timeSensor;

    @XmlElement
    protected X3DTransform transform;

    @XmlElement
    protected Viewpoint viewpoint;

    @XmlElement
    protected WorldInfo worldInfo;

    /**
     * Get the value of worldInfo
     *
     * @return the value of worldInfo
     */
    public WorldInfo getWorldInfo() {
        return worldInfo;
    }

    /**
     * Set the value of worldInfo
     *
     * @param worldInfo new value of worldInfo
     */
    public void setWorldInfo(WorldInfo worldInfo) {
        this.worldInfo = worldInfo;
    }

    /**
     * Get the value of viewpoint
     *
     * @return the value of viewpoint
     */
    public Viewpoint getViewpoint() {
        return viewpoint;
    }

    /**
     * Set the value of viewpoint
     *
     * @param viewpoint new value of viewpoint
     */
    public void setViewpoint(Viewpoint viewpoint) {
        this.viewpoint = viewpoint;
    }

    /**
     * Get the value of transform
     *
     * @return the value of transform
     */
    public X3DTransform getTransform() {
        return transform;
    }

    /**
     * Set the value of transform
     *
     * @param transform new value of transform
     */
    public void setTransform(X3DTransform transform) {
        this.transform = transform;
    }

    /**
     * Get the value of timeSensor
     *
     * @return the value of timeSensor
     */
    public TimeSensor getTimeSensor() {
        return timeSensor;
    }

    /**
     * Set the value of timeSensor
     *
     * @param timeSensor new value of timeSensor
     */
    public void setTimeSensor(TimeSensor timeSensor) {
        this.timeSensor = timeSensor;
    }

    /**
     * Get the value of shape
     *
     * @return the value of shape
     */
    public X3DShape getShape() {
        return shape;
    }

    /**
     * Set the value of shape
     *
     * @param shape new value of shape
     */
    public void setShape(X3DShape shape) {
        this.shape = shape;
    }

    /**
     * Get the value of scalarInterpolator
     *
     * @return the value of scalarInterpolator
     */
    public ScalarInterpolator getScalarInterpolator() {
        return scalarInterpolator;
    }

    /**
     * Set the value of scalarInterpolator
     *
     * @param scalarInterpolator new value of scalarInterpolator
     */
    public void setScalarInterpolator(ScalarInterpolator scalarInterpolator) {
        this.scalarInterpolator = scalarInterpolator;
    }

    /**
     * Get the value of positionInterpolator
     *
     * @return the value of positionInterpolator
     */
    public PositionInterpolator getPositionInterpolator() {
        return positionInterpolator;
    }

    /**
     * Set the value of positionInterpolator
     *
     * @param positionInterpolator new value of positionInterpolator
     */
    public void setPositionInterpolator(PositionInterpolator positionInterpolator) {
        this.positionInterpolator = positionInterpolator;
    }

    /**
     * Get the value of orientationInterpolator
     *
     * @return the value of orientationInterpolator
     */
    public OrientationInterpolator getOrientationInterpolator() {
        return orientationInterpolator;
    }

    /**
     * Set the value of orientationInterpolator
     *
     * @param orientationInterpolator new value of orientationInterpolator
     */
    public void setOrientationInterpolator(OrientationInterpolator orientationInterpolator) {
        this.orientationInterpolator = orientationInterpolator;
    }

    /**
     * Get the value of normalInterpolator
     *
     * @return the value of normalInterpolator
     */
    public NormalInterpolator getNormalInterpolator() {
        return normalInterpolator;
    }

    /**
     * Set the value of normalInterpolator
     *
     * @param normalInterpolator new value of normalInterpolator
     */
    public void setNormalInterpolator(NormalInterpolator normalInterpolator) {
        this.normalInterpolator = normalInterpolator;
    }

    /**
     * Get the value of navigationInfo
     *
     * @return the value of navigationInfo
     */
    public NavigationInfo getNavigationInfo() {
        return navigationInfo;
    }

    /**
     * Set the value of navigationInfo
     *
     * @param navigationInfo new value of navigationInfo
     */
    public void setNavigationInfo(NavigationInfo navigationInfo) {
        this.navigationInfo = navigationInfo;
    }

    /**
     * Get the value of group
     *
     * @return the value of group
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Set the value of group
     *
     * @param group new value of group
     */
    public void setGroup(Group group) {
        this.group = group;
    }

    /**
     * Get the value of directionalLight
     *
     * @return the value of directionalLight
     */
    public DirectionalLight getDirectionalLight() {
        return directionalLight;
    }

    /**
     * Set the value of directionalLight
     *
     * @param directionalLight new value of directionalLight
     */
    public void setDirectionalLight(DirectionalLight directionalLight) {
        this.directionalLight = directionalLight;
    }

    /**
     * Get the value of coordinateInterpolator
     *
     * @return the value of coordinateInterpolator
     */
    public CoordinateInterpolator getCoordinateInterpolator() {
        return coordinateInterpolator;
    }

    /**
     * Set the value of coordinateInterpolator
     *
     * @param coordinateInterpolator new value of coordinateInterpolator
     */
    public void setCoordinateInterpolator(CoordinateInterpolator coordinateInterpolator) {
        this.coordinateInterpolator = coordinateInterpolator;
    }

    /**
     * Get the value of colorInterpolator
     *
     * @return the value of colorInterpolator
     */
    public ColorInterpolator getColorInterpolator() {
        return colorInterpolator;
    }

    /**
     * Set the value of colorInterpolator
     *
     * @param colorInterpolator new value of colorInterpolator
     */
    public void setColorInterpolator(ColorInterpolator colorInterpolator) {
        this.colorInterpolator = colorInterpolator;
    }

    /**
     * Get the value of background
     *
     * @return the value of background
     */
    public Background getBackground() {
        return background;
    }

    /**
     * Set the value of background
     *
     * @param background new value of background
     */
    public void setBackground(Background background) {
        this.background = background;
    }

    /**
     * Get the value of sceneGraphStructure
     *
     * @return the value of sceneGraphStructure
     */
    public SceneGraphStructure getSceneGraphStructure() {
        return sceneGraphStructure;
    }

    /**
     * Set the value of sceneGraphStructure
     *
     * @param sceneGraphStructure new value of sceneGraphStructure
     */
    public void setSceneGraphStructure(SceneGraphStructure sceneGraphStructure) {
        this.sceneGraphStructure = sceneGraphStructure;
    }

    /**
     * Get the value of protoInstance
     *
     * @return the value of protoInstance
     */
    public ProtoInstance getProtoInstance() {
        return protoInstance;
    }

    /**
     * Set the value of protoInstance
     *
     * @param protoInstance new value of protoInstance
     */
    public void setProtoInstance(ProtoInstance protoInstance) {
        this.protoInstance = protoInstance;
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
     * Get the value of humanoidAnimation
     *
     * @return the value of humanoidAnimation
     */
    public HumanoidAnimation getHumanoidAnimation() {
        return humanoidAnimation;
    }

    /**
     * Set the value of humanoidAnimation
     *
     * @param humanoidAnimation new value of humanoidAnimation
     */
    public void setHumanoidAnimation(HumanoidAnimation humanoidAnimation) {
        this.humanoidAnimation = humanoidAnimation;
    }

    /**
     * Get the value of geo
     *
     * @return the value of geo
     */
    public GeoSpatial getGeo() {
        return geo;
    }

    /**
     * Set the value of geo
     *
     * @param geo new value of geo
     */
    public void setGeo(GeoSpatial geo) {
        this.geo = geo;
    }

    /**
     * Get the value of full
     *
     * @return the value of full
     */
    public Full getFull() {
        return full;
    }

    /**
     * Set the value of full
     *
     * @param full new value of full
     */
    public void setFull(Full full) {
        this.full = full;
    }

    /**
     * Get the value of dis
     *
     * @return the value of dis
     */
    public DIS getDis() {
        return dis;
    }

    /**
     * Set the value of dis
     *
     * @param dis new value of dis
     */
    public void setDis(DIS dis) {
        this.dis = dis;
    }

    /**
     * Get the value of translation
     *
     * @return the value of translation
     */
    @XmlAttribute
    public String getTranslation() {
        String retValue = null;
        if (translation != null) {
            retValue = translation.toString();
        }
        return retValue;
    }

    /**
     * Get translation definition if form of instance of object.
     *
     * @return null in case when default translation is used, otherwise instance
     * of vector with axis of translation values.
     */
    public X3DAxisVector getTranslationObj() {
        return translation;
    }

    /**
     * Set the value of translation
     *
     * @param translation new value of translation
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setTranslation(String translation) throws X3DException {
        if (translation != null && (!translation.isEmpty())) {
            if (this.translation == null) {
                this.translation = new X3DAxisVector(translation);
            } else {
                this.translation.fromString(translation);
            }
        }
    }

    /**
     * Set translation value by using instance of vector with axes.
     *
     * @param translation can be null to set default translation value, or
     * instnce of valid vector definition.
     */
    public void setTranslation(X3DAxisVector translation) {
        this.translation = translation;
    }

    /**
     * Get the value of scaleOrientation
     *
     * @return the value of scaleOrientation
     */
    @XmlAttribute
    public String getScaleOrientation() {
        String retValue = null;
        if (scaleOrientation != null) {
            retValue = scaleOrientation.toString();
        }
        return retValue;
    }

    /**
     * Get scale orientation if object representation.
     *
     * @return null in case when default representation is used, otherwise valid
     * instance of rotation vector.
     */
    public X3DRotation getScaleOrientationObj() {
        return scaleOrientation;
    }

    /**
     * Set the value of scaleOrientation
     *
     * @param scaleOrientation new value of scaleOrientation
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setScaleOrientation(String scaleOrientation) throws X3DException {
        if (scaleOrientation != null && (!scaleOrientation.isEmpty())) {
            if (this.scaleOrientation == null) {
                this.scaleOrientation = new X3DRotation(scaleOrientation);
            } else {
                this.scaleOrientation.fromString(scaleOrientation);
            }
        }
    }

    /**
     * Set scale orientation by using instance of rotation vector.
     *
     * @param scaleOrientation null in case when instance should be swith to use
     * default defintion, otherwise valid instance with definition of scale
     * orientation
     */
    public void setScaleOrientation(X3DRotation scaleOrientation) {
        this.scaleOrientation = scaleOrientation;
    }

    /**
     * Get the value of scale
     *
     * @return the value of scale
     */
    @XmlAttribute
    public String getScale() {
        String retValue = null;
        if (scale != null) {
            retValue = scale.toString();
        }
        return retValue;
    }

    /**
     * Get scale in form of instance of vector of values.
     *
     * @return null in case when default value is used, otherwise initializes
     * instance of vactor with current scale configuration.
     */
    public X3DAxisVector getScaleObj() {
        return scale;
    }

    /**
     * Set the value of scale
     *
     * @param scale new value of scale
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setScale(String scale) throws X3DException {
        if (scale != null && (!scale.isEmpty())) {
            if (this.scale == null) {
                this.scale = new X3DAxisVector(scale);
            } else {
                this.scale.fromString(scale);
            }
        }
    }

    /**
     * Set scale value by using instance of vector.
     *
     * @param scale can by null in case when this instance should use default
     * value, otherwise valid scale vector configuration is required.
     */
    public void setScale(X3DAxisVector scale) {
        this.scale = scale;
    }

    /**
     * Get the value of rotation
     *
     * @return the value of rotation
     */
    @XmlAttribute
    public String getRotation() {
        String retValue = null;
        if (rotation != null) {
            retValue = rotation.toString();
        }
        return retValue;
    }

    /**
     * Get rotation configuration values in form of instance of rotation vector.
     *
     * @return null in case when default rotation value is used, otherwise
     * intialized instance with current configuration.
     */
    public X3DRotation getRotationObj() {
        return rotation;
    }

    /**
     * Set the value of rotation
     *
     * @param rotation new value of rotation
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setRotation(String rotation) throws X3DException {
        if (rotation != null && (!rotation.isEmpty())) {
            if (this.rotation == null) {
                this.rotation = new X3DRotation(rotation);
            } else {
                this.rotation.fromString(rotation);
            }
        }
    }

    /**
     * Set rotation by using instance of rotation vector.
     *
     * @param rotation null in case when default rotation configuration should
     * be used, otherwise valid rotation vector configuration.
     */
    public void setRotation(X3DRotation rotation) {
        this.rotation = rotation;
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
     * Get the value of center
     *
     * @return the value of center
     */
    @XmlAttribute
    public String getCenter() {
        String retValue = null;
        if (center != null) {
            retValue = center.toString();
        }
        return retValue;
    }

    /**
     * Get center coordinated in instance of vector with axes.
     *
     * @return null in case when default configuration is used, otherwise
     * instance with valid configuration.
     */
    public X3DAxisVector getCenterObj() {
        return center;
    }

    /**
     * Set the value of center
     *
     * @param center new value of center
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setCenter(String center) throws X3DException {
        if (center != null && (!center.isEmpty())) {
            if (this.center == null) {
                this.center = new X3DAxisVector(center);
            } else {
                this.center.fromString(center);
            }
        }
    }

    /**
     * Set center configuration by using instnce of vector with coordinates.
     *
     * @param center null in case when current instance should use default
     * values, otherwise valid instance of vector with coordinates.
     */
    public void setCenter(X3DAxisVector center) {
        this.center = center;
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
     * Get size of bbox in form of instance of vector with values.
     *
     * @return null in case when default values of bbox size is used, otherwise
     * valid instance of vector with values.
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
     * Set size of bbox by using vector of values.
     *
     * @param bboxSize null in case when current instance should use default
     * configuration, otherwise vector with valid values for size.
     */
    public void setBboxSize(X3DAxisVector bboxSize) {
        this.bboxSize = bboxSize;
    }

    /**
     * Get the value of bboxCenter
     *
     * @return the value of bboxCenter
     */
    @XmlAttribute
    public String getBboxCenter() {
        String retValue = null;
        if (bboxCenter != null) {
            retValue = bboxCenter.toString();
        }
        return retValue;
    }

    /**
     * Get center of bbox coordinates in form of instance of vector.
     *
     * @return null in case when default configuration is used, otherwise
     * instance of vector with valid configuration.
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
            if (this.bboxCenter == null) {
                this.bboxCenter = new X3DAxisVector(bboxCenter);
            } else {
                this.bboxCenter.fromString(bboxCenter);
            }
        }
    }

    /**
     * Set center of bbox by using instnce of vecotor with coordinates.
     *
     * @param bboxCenter null in case when current instance should use default
     * configuration, otherwise valid instance of vector with coordinates.
     */
    public void setBboxCenter(X3DAxisVector bboxCenter) {
        this.bboxCenter = bboxCenter;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.bboxCenter);
        hash = 29 * hash + Objects.hashCode(this.bboxSize);
        hash = 29 * hash + Objects.hashCode(this.center);
        hash = 29 * hash + Objects.hashCode(this.metadata);
        hash = 29 * hash + Objects.hashCode(this.render);
        hash = 29 * hash + Objects.hashCode(this.rotation);
        hash = 29 * hash + Objects.hashCode(this.scale);
        hash = 29 * hash + Objects.hashCode(this.scaleOrientation);
        hash = 29 * hash + Objects.hashCode(this.translation);
        hash = 29 * hash + Objects.hashCode(this.dis);
        hash = 29 * hash + Objects.hashCode(this.full);
        hash = 29 * hash + Objects.hashCode(this.geo);
        hash = 29 * hash + Objects.hashCode(this.humanoidAnimation);
        hash = 29 * hash + Objects.hashCode(this.immersive);
        hash = 29 * hash + Objects.hashCode(this.interactive);
        hash = 29 * hash + Objects.hashCode(this.nurbs);
        hash = 29 * hash + Objects.hashCode(this.protoInstance);
        hash = 29 * hash + Objects.hashCode(this.sceneGraphStructure);
        hash = 29 * hash + Objects.hashCode(this.background);
        hash = 29 * hash + Objects.hashCode(this.colorInterpolator);
        hash = 29 * hash + Objects.hashCode(this.coordinateInterpolator);
        hash = 29 * hash + Objects.hashCode(this.directionalLight);
        hash = 29 * hash + Objects.hashCode(this.group);
        hash = 29 * hash + Objects.hashCode(this.navigationInfo);
        hash = 29 * hash + Objects.hashCode(this.normalInterpolator);
        hash = 29 * hash + Objects.hashCode(this.orientationInterpolator);
        hash = 29 * hash + Objects.hashCode(this.positionInterpolator);
        hash = 29 * hash + Objects.hashCode(this.scalarInterpolator);
        hash = 29 * hash + Objects.hashCode(this.shape);
        hash = 29 * hash + Objects.hashCode(this.timeSensor);
        hash = 29 * hash + Objects.hashCode(this.transform);
        hash = 29 * hash + Objects.hashCode(this.viewpoint);
        hash = 29 * hash + Objects.hashCode(this.worldInfo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final X3DTransform other = (X3DTransform) obj;
        if (!Objects.equals(this.bboxCenter, other.bboxCenter)) {
            return false;
        }
        if (!Objects.equals(this.bboxSize, other.bboxSize)) {
            return false;
        }
        if (!Objects.equals(this.center, other.center)) {
            return false;
        }
        if (!Objects.equals(this.metadata, other.metadata)) {
            return false;
        }
        if (!Objects.equals(this.render, other.render)) {
            return false;
        }
        if (!Objects.equals(this.rotation, other.rotation)) {
            return false;
        }
        if (!Objects.equals(this.scale, other.scale)) {
            return false;
        }
        if (!Objects.equals(this.scaleOrientation, other.scaleOrientation)) {
            return false;
        }
        if (!Objects.equals(this.translation, other.translation)) {
            return false;
        }
        if (!Objects.equals(this.dis, other.dis)) {
            return false;
        }
        if (!Objects.equals(this.full, other.full)) {
            return false;
        }
        if (!Objects.equals(this.geo, other.geo)) {
            return false;
        }
        if (!Objects.equals(this.humanoidAnimation, other.humanoidAnimation)) {
            return false;
        }
        if (!Objects.equals(this.immersive, other.immersive)) {
            return false;
        }
        if (!Objects.equals(this.interactive, other.interactive)) {
            return false;
        }
        if (!Objects.equals(this.nurbs, other.nurbs)) {
            return false;
        }
        if (!Objects.equals(this.protoInstance, other.protoInstance)) {
            return false;
        }
        if (!Objects.equals(this.sceneGraphStructure, other.sceneGraphStructure)) {
            return false;
        }
        if (!Objects.equals(this.background, other.background)) {
            return false;
        }
        if (!Objects.equals(this.colorInterpolator, other.colorInterpolator)) {
            return false;
        }
        if (!Objects.equals(this.coordinateInterpolator, other.coordinateInterpolator)) {
            return false;
        }
        if (!Objects.equals(this.directionalLight, other.directionalLight)) {
            return false;
        }
        if (!Objects.equals(this.group, other.group)) {
            return false;
        }
        if (!Objects.equals(this.navigationInfo, other.navigationInfo)) {
            return false;
        }
        if (!Objects.equals(this.normalInterpolator, other.normalInterpolator)) {
            return false;
        }
        if (!Objects.equals(this.orientationInterpolator, other.orientationInterpolator)) {
            return false;
        }
        if (!Objects.equals(this.positionInterpolator, other.positionInterpolator)) {
            return false;
        }
        if (!Objects.equals(this.scalarInterpolator, other.scalarInterpolator)) {
            return false;
        }
        if (!Objects.equals(this.shape, other.shape)) {
            return false;
        }
        if (!Objects.equals(this.timeSensor, other.timeSensor)) {
            return false;
        }
        if (!Objects.equals(this.transform, other.transform)) {
            return false;
        }
        if (!Objects.equals(this.viewpoint, other.viewpoint)) {
            return false;
        }
        if (!Objects.equals(this.worldInfo, other.worldInfo)) {
            return false;
        }
        return true;
    }

}
