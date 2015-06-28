/*
 */
package cz.a_d.discworld.x3dom.data.model;

import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.DIS;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.Full;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.GeoSpatial;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.HumanoidAnimation;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.Immersive;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.Interactive;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.Interchange;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.Nurbs;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.ProtoInstance;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.SceneGraphStructure;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.net.URL;
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
public class X3DScene {

    /**
     * Center of the bounding box.
     */
    protected X3DAxisVector bboxCenter;

    /**
     * Flag to enable/disable pick pass.
     */
    @XmlAttribute
    protected Boolean doPickPass;

    /**
     * The picking mode for the scene.
     */
    @XmlAttribute
    protected String pickMode;

    /**
     * Flag to enable/disable rendering.
     */
    @XmlAttribute
    protected Boolean render;

    /**
     * The url of the shadow object id mapping.
     */
    @XmlElement
    protected URL shadowObjectIdMapping;

    /**
     * Field to add metadata information.
     */
    @XmlElement
    protected List<X3DMetadata> metadata;

    @XmlElement
    protected DIS dis;

    @XmlElement
    protected Full full;

    @XmlElement
    protected GeoSpatial geo;

    @XmlElement
    protected HumanoidAnimation humanoidAnimation;

    @XmlElement
    protected Immersive immersive;

    @XmlElement
    protected Interactive interactive;

    @XmlElement
    protected Interchange interchange;

    @XmlElement
    protected Nurbs nurbs;

    @XmlElement
    protected ProtoInstance protoInstance;

    @XmlElement
    protected SceneGraphStructure sceneGraphStructure;

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
     * Get the value of interchange
     *
     * @return the value of interchange
     */
    public Interchange getInterchange() {
        return interchange;
    }

    /**
     * Set the value of interchange
     *
     * @param interchange new value of interchange
     */
    public void setInterchange(Interchange interchange) {
        this.interchange = interchange;
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
     * Get the value of shadowObjectIdMapping
     *
     * @return the value of shadowObjectIdMapping
     */
    public URL getShadowObjectIdMapping() {
        return shadowObjectIdMapping;
    }

    /**
     * Set the value of shadowObjectIdMapping
     *
     * @param shadowObjectIdMapping new value of shadowObjectIdMapping
     */
    public void setShadowObjectIdMapping(URL shadowObjectIdMapping) {
        this.shadowObjectIdMapping = shadowObjectIdMapping;
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
     * Get the value of pickMode
     *
     * @return the value of pickMode
     */
    public String getPickMode() {
        return pickMode;
    }

    /**
     * Set the value of pickMode
     *
     * @param pickMode new value of pickMode
     */
    public void setPickMode(String pickMode) {
        this.pickMode = pickMode;
    }

    /**
     * Get the value of doPickPass
     *
     * @return the value of doPickPass
     */
    public Boolean isDoPickPass() {
        return doPickPass;
    }

    /**
     * Set the value of doPickPass
     *
     * @param doPickPass new value of doPickPass
     */
    public void setDoPickPass(Boolean doPickPass) {
        this.doPickPass = doPickPass;
    }

    /**
     * Get the value of bboxCenter
     *
     * @return the value of bboxCenter
     */
    @XmlAttribute
    public String getBboxCenter() {
        String retValue =null;
        if(bboxCenter!=null){
            retValue = bboxCenter.toString();
        }
        return retValue;
    }

    /**
     * Set the value of bboxCenter
     *
     * @param bboxCenter new value of bboxCenter
     */
    public void setBboxCenter(String bboxCenter) throws X3DException {
        if(this.bboxCenter==null){
            this.bboxCenter = new X3DAxisVector(bboxCenter);
        }else{
            this.bboxCenter.fromString(bboxCenter);
        }
    }
    
    public void setBboxCenter(X3DAxisVector bboxCenter){
        this.bboxCenter = bboxCenter;
    }
    
    public X3DAxisVector getBboxCenterObj(){
        return bboxCenter;
    }

}
