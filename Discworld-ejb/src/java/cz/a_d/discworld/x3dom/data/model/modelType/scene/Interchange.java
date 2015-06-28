/*
 */
package cz.a_d.discworld.x3dom.data.model.modelType.scene;

import cz.a_d.discworld.x3dom.data.model.iterchange.scene.Background;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.ColorInterpolator;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.CoordinateInterpolator;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.DirectionalLight;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.Group;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.NavigationInfo;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.NormalInterpolator;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.OrientationInterpolator;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.PositionInterpolator;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.ScalarInterpolator;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.Shape;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.TimeSensor;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.Transform;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.Viewpoint;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.WorldInfo;

/**
 * Content model corresponding to X3DChildNode for Interchange profile.
 *
 * @author maslu02
 */
//@XmlTransient
//@XmlSeeAlso(Box.class)
//@XmlType
//@XmlAccessorType(XmlAccessType.NONE)

public class Interchange {

    protected Background background;

    protected ColorInterpolator colorInterpolator;

    protected CoordinateInterpolator coordinateInterpolator;

    protected DirectionalLight directionalLight;

    protected Group group;

    protected NavigationInfo navigationInfo;

    protected NormalInterpolator normalInterpolator;

    protected OrientationInterpolator orientationInterpolator;

    protected PositionInterpolator positionInterpolator;

    protected ScalarInterpolator scalarInterpolator;

    protected Shape shape;

    protected TimeSensor timeSensor;

    protected Transform transform;

    protected Viewpoint viewpoint;

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
    public Transform getTransform() {
        return transform;
    }

    /**
     * Set the value of transform
     *
     * @param transform new value of transform
     */
    public void setTransform(Transform transform) {
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
    public Shape getShape() {
        return shape;
    }

    /**
     * Set the value of shape
     *
     * @param shape new value of shape
     */
    public void setShape(Shape shape) {
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

}
