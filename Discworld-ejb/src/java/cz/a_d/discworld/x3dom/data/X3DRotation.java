/*
 */
package cz.a_d.discworld.x3dom.data;

import cz.a_d.discworld.x3dom.exceptions.X3DException;

/**
 * SFRotation is an axis-angle 4-tuple, indicating X-Y-Z direction plus angle orientation about that axis. The first three values specify a
 * normalized rotation axis vector about which the rotation takes place. (Thus the first three values must be within the range [-1..+1] in
 * order to represent a normalized unit vector. Problem: scientific notation allows leading digit.) The fourth value specifies the amount of
 * right-handed rotation about that axis in radians.
 *
 * @author casper
 */
public class X3DRotation extends X3DVector<Double> {

    public X3DRotation() throws X3DException {
        this(null);
    }

    public X3DRotation(String definition) throws X3DException {
        super(Double.class, 4, definition);
    }

    /**
     * Get the value of angle
     *
     * @return the value of angle
     */
    public double getAngle() {
        return data.get(3);
    }

    /**
     * Set the value of angle
     *
     * @param angle new value of angle
     */
    public void setAngle(double angle) {
        data.set(3, angle);
    }

    /**
     * Get the value of z
     *
     * @return the value of z
     */
    public double getZ() {
        return data.get(2);
    }

    /**
     * Set the value of z
     *
     * @param z new value of z
     */
    public void setZ(double z) {
        data.set(2, z);
    }

    /**
     * Get the value of y
     *
     * @return the value of y
     */
    public double getY() {
        return data.get(1);
    }

    /**
     * Set the value of y
     *
     * @param y new value of y
     */
    public void setY(double y) {
        data.set(1, y);
    }

    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public double getX() {
        return data.get(0);
    }

    /**
     * Set the value of x
     *
     * @param x new value of x
     */
    public void setX(double x) {
        data.set(0, x);
    }

}
