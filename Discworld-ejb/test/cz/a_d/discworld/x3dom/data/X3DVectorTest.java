/*
 */
package cz.a_d.discworld.x3dom.data;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maslu02
 */
public class X3DVectorTest {
    
    public X3DVectorTest() {
    }

    /**
     * Test of fromString method, of class X3DVector.
     */
    @Test
    public void testFromAndToString() throws Exception {
        String definition = "";
        X3DVector instance = new X3DVector(Byte.class, 3);
        String expectedResult = instance.toString();
        instance.fromString(definition);
        assertEquals(expectedResult, instance.toString());

        definition="1,2,3";
        instance.fromString(definition);
        assertEquals(definition, instance.toString());      
        
    }

}
