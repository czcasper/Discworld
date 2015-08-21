/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.scene;

import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.data.X3DAxisVector;
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
public class Group extends X3DObject {

    /**
     * Center of the bounding box.
     */
    protected X3DAxisVector bboxCenter;

    /**
     * Size of the bounding box. [0, inf] or -1
     */
    protected X3DAxisVector bboxSize;

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
}
