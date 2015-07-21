/*
 */
package cz.a_d.discworld.x3dom;

import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.apprance.Appearance;
import cz.a_d.discworld.x3dom.data.apprance.X3DMaterial;
import cz.a_d.discworld.x3dom.data.model.X3DScene;
import cz.a_d.discworld.x3dom.data.model.iterchange.geometry.Box;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.Shape;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.Transform;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import java.io.StringWriter;
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
    public void testSceneWithBoxInside() throws JAXBException, X3DException {
        X3d instance = new X3d();
        X3DScene scene = new X3DScene();
        instance.addScene(scene);

        Shape shape = new Shape();
        scene.setShape(shape);

        shape.addBox(new Box());
        String expectedResult = "<x3d><scene><shape><box/></shape></scene></x3d>";
        StringWriter result = new StringWriter();
        marshaller.marshal(instance, result);
        assertEquals(expectedResult, result.toString());

        Appearance ap = new Appearance();
        shape.setAppearance(ap);
        
        X3DMaterial mat = new X3DMaterial();
        ap.setMaterial(mat);
        mat.setDiffuseColor("0,0,1");
        expectedResult = "<x3d><scene><shape><appearance><material diffuseColor=\"0.0,0.0,1.0\"/></appearance><box/></shape></scene></x3d>";
        result = new StringWriter();
        marshaller.marshal(instance, result);
        assertEquals(expectedResult, result.toString());

    }

    @Test
    public void testSceneWithTransformAndBoxInside() throws JAXBException, X3DException {
        X3d instance = new X3d();
        X3DScene scene = new X3DScene();
        instance.addScene(scene);

        Transform tr = new Transform();
        scene.addTransform(tr);

        Shape shape = new Shape();
        tr.setShape(shape);
        shape.addBox(new Box());
        String expectedResult = "<x3d><scene><transform><shape><box/></shape></transform></scene></x3d>";
        StringWriter result = new StringWriter();
        marshaller.marshal(instance, result);
        assertEquals(expectedResult, result.toString());

        X3DAxisVector vector = new X3DAxisVector("10,1,-2");
        tr.setTranslation(vector);
        expectedResult = "<x3d><scene><transform translation=\"10.0,1.0,-2.0\"><shape><box/></shape></transform></scene></x3d>";
        result = new StringWriter();
        marshaller.marshal(instance, result);
        assertEquals(expectedResult, result.toString());
    }

    /**
     * Test of setPrimitiveQuality method, of class X3d.
     * @throws javax.xml.bind.JAXBException
     */
    @Test
    public void testID() throws JAXBException {
        X3d instance = new X3d();
        instance.setId("testid");
        String expectedResult = "<x3d id=\"testid\"/>";
        StringWriter result = new StringWriter();
        marshaller.marshal(instance, result);
        assertEquals(expectedResult, result.toString());
    }

}
