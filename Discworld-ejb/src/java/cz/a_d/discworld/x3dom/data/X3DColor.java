/*
 */
package cz.a_d.discworld.x3dom.data;

import cz.a_d.discworld.x3dom.exceptions.X3DException;

/**
 *
 * @author maslu02
 */
public class X3DColor extends X3DVector<Float>{

    public X3DColor() throws X3DException {
        this(null);
    }

    public X3DColor(String definition) throws X3DException {
        super(Float.class, 3, definition);
    }

    /**
     * Get the value of B
     *
     * @return the value of B
     */
    public Float getB() {
        return data.get(2);
    }

    /**
     * Set the value of B
     *
     * @param B new value of B
     */
    public void setB(Float B) {
        this.data.set(2, B);
    }

    /**
     * Get the value of G
     *
     * @return the value of G
     */
    public Float getG() {
        return data.get(1);
    }

    /**
     * Set the value of G
     *
     * @param G new value of G
     */
    public void setG(Float G) {
        this.data.set(1, G);
    }

    /**
     * Get the value of R
     *
     * @return the value of R
     */
    public Float getR() {
        return data.get(0);
    }

    /**
     * Set the value of R
     *
     * @param R new value of R
     */
    public void setR(Float R) {
        this.data.set(0, R);
    }
    
}
