/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.scene;

import cz.a_d.discworld.x3dom.X3DObject;
import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.X3DColor;
import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.util.ArrayList;
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
public class ColorInterpolator extends X3DObject {

    /**
     * The key field contains the list of key times, the keyValue field contains values for the target field, one complete set of values for
     * each key. Interpolator nodes containing no keys in the key field shall not produce any events. However, an input event that replaces
     * an empty key field with one that contains keys will cause the interpolator node to produce events the next time that a set_fraction
     * event is received.
     */
    @XmlAttribute
    protected List<Float> key;

    /**
     * Defines the set of data points, that are used for interpolation.The number of colours in the keyValue field shall be equal to the
     * number of key frames in the key field. A linear interpolation using the value of set_fraction as input is performed in HSV space. The
     * results are undefined when interpolating between two consecutive keys with complementary hues.
     */
    protected List<X3DColor> keyValue;

    /**
     * Field to add metadata information.
     */
    @XmlElement
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
     * Get the value of key
     *
     * @return the value of key
     */
    public List<Float> getKey() {
        return key;
    }

    /**
     * Get the value of keyValue
     *
     * @return the value of keyValue
     */
    @XmlAttribute
    public List<String> getKeyValue() {
        List<String> retValue = null;
        if (keyValue != null && (!keyValue.isEmpty())) {
            retValue = new ArrayList<>(keyValue.size());
            for (X3DColor value : keyValue) {
                retValue.add(value.toString());
            }
        }
        return retValue;
    }

    /**
     * Get list of key value with RGB vectors used by color interpolation
     *
     * @return null in case when there is no list of vectors defined, otherwise list with minimaly one vector.
     */
    public List<X3DColor> getKeyValueObj() {
        return keyValue;
    }

    /**
     * Set the value of keyValue
     *
     * @param keyValue new value of keyValue
     * @throws cz.a_d.discworld.x3dom.exceptions.X3DException
     */
    public void setKeyValue(List<String> keyValue) throws X3DException {
        if (keyValue != null && (!keyValue.isEmpty())) {
            if (this.keyValue == null) {
                this.keyValue = new ArrayList<>(keyValue.size());
            }

            int index = this.keyValue.size();
            for (String keyVal : keyValue) {
                if (index > 0) {
                    index -= 1;
                    this.keyValue.get(index).fromString(keyVal);
                } else {
                    this.keyValue.add(new X3DColor(keyVal));
                }
            }
        }
    }

    /**
     * Set list of key values used by curent instance for color interpolation.
     *
     * @param keyValue null in case when there should be no key values defined otherwise list with at least one vector of values.
     */
    public void setKeyValueObj(List<X3DColor> keyValue) {
        this.keyValue = keyValue;
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
