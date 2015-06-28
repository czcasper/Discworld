/*
 */
package cz.a_d.discworld.x3dom.data;

import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maslu02
 * @param <N>
 */
public class X3DVector<N extends Number> {

    protected static final String DATA_SEPARATOR = ",";
    protected List<N> data;
    protected int dimension;
    protected GenericNumberConvertor convertor;

    public X3DVector(Class<N> cl, int dimension) throws X3DException {
        this(cl, dimension, null);
    }

    public X3DVector(Class<N> cl, int dimension, String definition) throws X3DException {
        if (dimension > 0) {
            data = new ArrayList<>(dimension);
            this.dimension = dimension;
            if (cl != null) {
                convertor = GenericNumberConvertor.getFromClass(cl);
                if (definition != null && (!definition.isEmpty())) {
                    fromString(definition);
                } else {
                    N zero = convertor.convert("0");
                    for (int i = 0; i < dimension; i++) {
                        data.add(zero);
                    }
                }
            } else {
                throw new X3DException("Invalid numeric class definition");
            }
        } else {
            throw new X3DException("Invalid vector dimension");
        }
    }

    public final void fromString(String definition) throws X3DException {
        if (definition != null && (!definition.isEmpty())) {
            String[] split = definition.split(DATA_SEPARATOR);
            if (split.length == dimension) {
                data.clear();
                for (String s : split) {
                    N number = convertor.convert(s);
                    if (number != null) {
                        data.add(number);
                    } else {
                        throw new X3DException("Invalid vector data definition:" + definition);
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        String retValue = "";
        if (!data.isEmpty()) {
            boolean first = true;
            for (N number : data) {
                if (first) {
                    first = false;
                } else {
                    retValue += DATA_SEPARATOR;
                }
                retValue += number.toString();
            }
        }
        return retValue;
    }

}
