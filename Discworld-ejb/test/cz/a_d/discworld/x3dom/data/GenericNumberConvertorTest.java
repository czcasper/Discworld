/*
 */
package cz.a_d.discworld.x3dom.data;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maslu02
 */
public class GenericNumberConvertorTest {
    
    public GenericNumberConvertorTest() {
    }

    /**
     * Test of values method, of class GenericNumberConvertor.
     */
    @Test
    public void testValues() {
        GenericNumberConvertor[] expResult = new GenericNumberConvertor[]{GenericNumberConvertor.BYTE,GenericNumberConvertor.SHORT,GenericNumberConvertor.INT,GenericNumberConvertor.LONG,GenericNumberConvertor.FLOAT,GenericNumberConvertor.DOUBLE};
        GenericNumberConvertor[] result = GenericNumberConvertor.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getFromClass method, of class GenericNumberConvertor.
     */
    @Test
    public void testGetFromClass() {
        System.out.println("getFromClass");
        Class<? extends Number> cl = null;
        GenericNumberConvertor expResult = null;
        GenericNumberConvertor result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.BYTE;
        cl = byte.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.BYTE;
        cl = Byte.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.SHORT;
        cl = short.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.SHORT;
        cl = Short.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.INT;
        cl = int.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.INT;
        cl = Integer.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.LONG;
        cl = long.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.LONG;
        cl = Long.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.FLOAT;
        cl = float.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.FLOAT;
        cl = Float.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.DOUBLE;
        cl = double.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);

        expResult = GenericNumberConvertor.DOUBLE;
        cl = Double.class;
        result = GenericNumberConvertor.getFromClass(cl);
        assertEquals(expResult, result);
    }

    /**
     * Test of convert method, of class GenericNumberConvertor.
     */
    @Test
    public void testConvert() {
        String text = "";
        Class<? extends Number> cl = byte.class;
        GenericNumberConvertor instance = GenericNumberConvertor.getFromClass(cl);
        Number expResult = null;
        Number result = instance.convert(text);
        assertEquals(expResult, result);
        
        text = "0";
        Byte byteResult = 0;
        result = instance.convert(text);
        assertEquals(byteResult, result);
        
        Short shortResult = 0;
        cl = short.class;
        instance = GenericNumberConvertor.getFromClass(cl);        
        result = instance.convert(text);
        assertEquals(shortResult, result);
        
        Integer intResult = 0;
        cl = int.class;
        instance = GenericNumberConvertor.getFromClass(cl);        
        result = instance.convert(text);
        assertEquals(intResult, result);
        
        Long longResult = 0l;
        cl = long.class;
        instance = GenericNumberConvertor.getFromClass(cl);        
        result = instance.convert(text);
        assertEquals(longResult, result);
        
        Float floatResult = 0.0f;
        cl = float.class;
        instance = GenericNumberConvertor.getFromClass(cl);        
        result = instance.convert(text);
        assertEquals(floatResult, result);
        
        Double doubleResult = 0.0;
        cl = double.class;
        instance = GenericNumberConvertor.getFromClass(cl);        
        result = instance.convert(text);
        assertEquals(doubleResult, result); 
        
    }
    
}
