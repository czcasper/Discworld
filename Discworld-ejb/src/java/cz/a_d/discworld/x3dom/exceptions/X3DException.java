/*
 */
package cz.a_d.discworld.x3dom.exceptions;

/**
 *
 * @author maslu02
 */
public class X3DException extends Exception {

    /**
     * Creates a new instance of <code>X3DException</code> without detail message.
     */
    public X3DException() {
    }

    /**
     * Constructs an instance of <code>X3DException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public X3DException(String msg) {
        super(msg);
    }
}
