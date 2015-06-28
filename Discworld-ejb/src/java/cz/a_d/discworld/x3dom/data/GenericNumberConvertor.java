/*
 */
package cz.a_d.discworld.x3dom.data;

/**
 *
 * @author maslu02
 */
public enum GenericNumberConvertor {

    BYTE, SHORT, INT, LONG, FLOAT, DOUBLE;

    public static GenericNumberConvertor getFromClass(Class<? extends Number> cl) {
        GenericNumberConvertor retValue = null;
        if (cl != null) {
            if (cl.equals(Byte.TYPE) || cl.equals(Byte.class)) {
                retValue = BYTE;
            } else if (cl.equals(Short.TYPE) || cl.equals(Short.class)) {
                retValue = SHORT;
            } else if (cl.equals(Integer.TYPE) || cl.equals(Integer.class)) {
                retValue = INT;
            } else if (cl.equals(Long.TYPE) || cl.equals(Long.class)) {
                retValue = LONG;
            } else if (cl.equals(Float.TYPE) || cl.equals(Float.class)) {
                retValue = FLOAT;
            } else if (cl.equals(Double.TYPE) || cl.equals(Double.class)) {
                retValue = DOUBLE;
            }
        }
        return retValue;
    }

    public <N extends Number> N convert(String text) {
        N retValue = null;
        if (text != null && (!text.isEmpty())) {
            switch (this) {
                case BYTE:
                    retValue = (N) Byte.valueOf(text);
                    break;
                case SHORT:
                    retValue = (N) Short.valueOf(text);
                    break;
                case INT:
                    retValue = (N) Integer.valueOf(text);
                    break;
                case LONG:
                    retValue = (N) Long.valueOf(text);
                    break;
                case FLOAT:
                    retValue = (N) Float.valueOf(text);
                    break;
                case DOUBLE:
                    retValue = (N) Double.valueOf(text);
                    break;
            }
        }
        return retValue;
    }
}
