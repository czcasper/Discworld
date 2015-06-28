/*
 */
package cz.a_d.discworld.x3dom;

import cz.a_d.discworld.x3dom.data.model.Geometry;
import cz.a_d.discworld.x3dom.data.model.X3DScene;
import cz.a_d.discworld.x3dom.data.model.iterchange.geometry.Box;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.Shape;
import cz.a_d.discworld.x3dom.data.model.modelType.scene.Interchange;
import java.io.StringWriter;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maslu02
 */
public class X3dTest {
    
    protected JAXBContext context;
    protected Unmarshaller unMarshaller;
    protected Marshaller marshaller;
    
    public X3dTest() throws JAXBException {
        context = JAXBContext.newInstance(X3d.class);
        unMarshaller = context.createUnmarshaller();
        marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
    }
    
    @Test
    public void testEmptyElement() throws JAXBException {
        X3d instance = new X3d();
        String expectedResult = "<x3d/>";
        StringWriter result = new StringWriter();
        marshaller.marshal(instance, result);
        assertEquals(expectedResult, result.toString());
    }
    
    @Test
    public void testSceneInside() throws JAXBException {
        X3d instance = new X3d();
        instance.addScene(new X3DScene());
        String expectedResult = "<x3d><scene/></x3d>";
        StringWriter result = new StringWriter();
        marshaller.marshal(instance, result);
        assertEquals(expectedResult, result.toString());
    }
    
    @Test
    public void testSceneWithBoxInside() throws JAXBException {
        X3d instance = new X3d();
        X3DScene scene = new X3DScene();
        instance.addScene(scene);
        
        Interchange interchange = new Interchange();
        scene.setInterchange(interchange);
        
        Shape shape = new Shape();
        interchange.setShape(shape);
        
        Geometry geometry = new Geometry();
        shape.setGeometry(geometry);
        
        cz.a_d.discworld.x3dom.data.model.modelType.geometry.Interchange geoInterChange = new cz.a_d.discworld.x3dom.data.model.modelType.geometry.Interchange();
        geometry.setInterchange(geoInterChange);
        
        geoInterChange.addBox(new Box());
        String expectedResult = "<x3d><scene/></x3d>";
        StringWriter result = new StringWriter();
        marshaller.marshal(instance, result);
        assertEquals(expectedResult, result.toString());
        
    }

    /**
     * Test of getPrimitiveQuality method, of class X3d.
     */
    @Test
    public void testGetPrimitiveQuality() {
        System.out.println("getPrimitiveQuality");
        X3d instance = new X3d();
        PrimitiveQuality expResult = null;
        PrimitiveQuality result = instance.getPrimitiveQuality();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrimitiveQuality method, of class X3d.
     */
    @Test
    public void testSetPrimitiveQuality() {
        System.out.println("setPrimitiveQuality");
        PrimitiveQuality primitiveQuality = null;
        X3d instance = new X3d();
        instance.setPrimitiveQuality(primitiveQuality);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowProgress method, of class X3d.
     */
    @Test
    public void testIsShowProgress() {
        System.out.println("isShowProgress");
        X3d instance = new X3d();
        Boolean expResult = null;
        Boolean result = instance.isShowProgress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowProgress method, of class X3d.
     */
    @Test
    public void testSetShowProgress() {
        System.out.println("setShowProgress");
        Boolean showProgress = null;
        X3d instance = new X3d();
        instance.setShowProgress(showProgress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowStat method, of class X3d.
     */
    @Test
    public void testIsShowStat() {
        System.out.println("isShowStat");
        X3d instance = new X3d();
        Boolean expResult = null;
        Boolean result = instance.isShowStat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowStat method, of class X3d.
     */
    @Test
    public void testSetShowStat() {
        System.out.println("setShowStat");
        Boolean showStat = null;
        X3d instance = new X3d();
        instance.setShowStat(showStat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowLog method, of class X3d.
     */
    @Test
    public void testIsShowLog() {
        System.out.println("isShowLog");
        X3d instance = new X3d();
        Boolean expResult = null;
        Boolean result = instance.isShowLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowLog method, of class X3d.
     */
    @Test
    public void testSetShowLog() {
        System.out.println("setShowLog");
        Boolean showLog = null;
        X3d instance = new X3d();
        instance.setShowLog(showLog);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScene method, of class X3d.
     */
    @Test
    public void testGetScene() {
        System.out.println("getScene");
        X3d instance = new X3d();
        List<X3DScene> expResult = null;
        List<X3DScene> result = instance.getScene();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScene method, of class X3d.
     */
    @Test
    public void testSetScene() {
        System.out.println("setScene");
        List<X3DScene> scene = null;
        X3d instance = new X3d();
        instance.setScene(scene);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
