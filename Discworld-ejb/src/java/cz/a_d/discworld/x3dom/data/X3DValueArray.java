/*
 */
package cz.a_d.discworld.x3dom.data;

import java.util.List;

/**
 *
 * @author maslu02
 */
public class X3DValueArray<T> {
    
    protected List<T> value;

    /**
     * Get the value of value
     *
     * @return the value of value
     */
    public List<T> getValue() {
        return value;
    }

    /**
     * Set the value of value
     *
     * @param value new value of value
     */
    public void setValue(List<T> value) {
        this.value = value;
    }

}
