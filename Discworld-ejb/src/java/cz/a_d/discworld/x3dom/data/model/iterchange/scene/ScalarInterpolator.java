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
public class ScalarInterpolator extends X3DObject {

    /**
     * The key field contains the list of key times, the keyValue field contains values for the target field, one complete set of values for
     * each key. Interpolator nodes containing no keys in the key field shall not produce any events. However, an input event that replaces
     * an empty key field with one that contains keys will cause the interpolator node to produce events the next time that a set_fraction
     * event is received.
     */
    @XmlAttribute
    protected List<Float> key;

    /**
     * Defines the set of data points, that are used for interpolation.
     */
    @XmlAttribute
    protected List<Float> keyValue;

    /**
     * Field to add metadata information.
     */
    protected List<X3DMetadata> metadata;

    /**
     * The set_fraction inputOnly field receives an SFFloat event and causes the interpolator node function to evaluate, resulting in a
     * value_changed output event of the specified type with the same timestamp as the set_fraction event.
     */
    @XmlAttribute(name = "set_fraction")
    protected Float setFraction;

    /**
     * Get the value of setFraction
     *
     * @return the value of setFraction
     */
    public Float getSetFraction() {
        return setFraction;
    }

    /**
     * Set the value of setFraction
     *
     * @param setFraction new value of setFraction
     */
    public void setSetFraction(Float setFraction) {
        this.setFraction = setFraction;
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
     * Get the value of keyValue
     *
     * @return the value of keyValue
     */
    public List<Float> getKeyValue() {
        return keyValue;
    }

    /**
     * Set the value of keyValue
     *
     * @param keyValue new value of keyValue
     */
    public void setKeyValue(List<Float> keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * Get the value of key
     *
     * @return the value of key
     */
    public List<Float> getKey() {
        return key;
    }

    /**
     * Set the value of key
     *
     * @param key new value of key
     */
    public void setKey(List<Float> key) {
        this.key = key;
    }

}
