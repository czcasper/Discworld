/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.x3dom;

import cz.a_d.discworld.datamodel.universe.Material;
import cz.a_d.discworld.datamodel.universe.geodata.Cube;
import cz.a_d.discworld.x3dom.data.X3DAxisVector;
import cz.a_d.discworld.x3dom.data.X3DColor;
import cz.a_d.discworld.x3dom.data.apprance.X3DAppearance;
import cz.a_d.discworld.x3dom.data.apprance.X3DMaterial;
import cz.a_d.discworld.x3dom.data.model.X3DScene;
import cz.a_d.discworld.x3dom.data.model.iterchange.geometry.X3DBox;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.X3DShape;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.X3DTransform;
import cz.a_d.discworld.x3dom.exceptions.X3DException;
import cz.a_d.discworld.x3dom.handler.SceneDataTransferHandler;
import cz.a_d.discworld.x3dom.handler.X3DElementIDGenerator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;
import javax.xml.bind.JAXBException;

/**
 *
 * @author casper
 */
@Stateful
@LocalBean
public class X3DSceneManager implements Serializable {

    @EJB
    protected X3DElementIDGenerator generator;

    @EJB
    protected SceneDataTransferHandler transform;

    protected X3d x3dElement;
    protected X3DScene x3dScene;
    protected Map<Cube, X3DTransform> cubeMap;

    protected int width = 1200;
    protected int height = 450;

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Get the value of cubeMap
     *
     * @return the value of cubeMap
     */
    public Map<Cube, X3DTransform> getCubeMap() {
        return cubeMap;
    }

    /**
     * Set the value of cubeMap
     *
     * @param cubeMap new value of cubeMap
     */
    public void setCubeMap(Map<Cube, X3DTransform> cubeMap) {
        this.cubeMap = cubeMap;
    }

    /**
     * Get the value of x3dElement
     *
     * @return the value of x3dElement
     */
    public X3d getX3dElement() {
        return x3dElement;
    }

    /**
     * Set the value of x3dElement
     *
     * @param x3dElement new value of x3dElement
     */
    public void setX3dElement(X3d x3dElement) {
        this.x3dElement = x3dElement;
    }

    public String createScene(List<Cube> cubes, String id) {
        String retValue = "";
        if (cubes != null) {
            x3dElement = new X3d();
            if (cubeMap == null) {
                cubeMap = new HashMap<>(cubes.size());
            } else {
                cubeMap.clear();
            }
            x3dElement.setId(id);
            x3dElement.setHeight(Integer.toString(height) + "px");
            x3dElement.setWidth(Integer.toString(width) + "px");
            x3dScene = new X3DScene();
            x3dElement.addScene(x3dScene);
            generator.generateID(x3dElement, x3dScene);
            if (!cubes.isEmpty()) {
                for (Cube cube : cubes) {
                    X3DTransform created = createCube(x3dScene, cube);
                    if (created != null) {
                        x3dScene.addTransform(created);
                        cubeMap.put(cube, created);
                    }
                }
            }
            try {
                retValue = transform.convert(x3dElement);
            } catch (JAXBException ex) {
                Logger.getLogger(X3DSceneManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retValue;
    }

    public String createCube(Cube cube) {
        String retValue = null;
        if (cube != null) {
            X3DTransform createCube = createCube(x3dScene, cube);
            if (createCube != null) {
                x3dScene.addTransform(createCube);
                cubeMap.put(cube, createCube);
                retValue = transform.generateDeltaMessage("create", x3dScene, createCube);
            }
        }
        return retValue;
    }

    public String deleteCube(List<Cube> cubes) {
        String retValue = null;
        if (cubes != null && (!cubes.isEmpty())) {
            List<X3DObject> transformedCubes = new ArrayList<>(cubes.size());
            for (Cube select : cubes) {
                X3DObject removeCube = removeCube(select);
                if (removeCube != null) {
                    transformedCubes.add(removeCube);
                }
            }
            retValue = transform.generateDeltaMessage("delete", x3dScene, true, transformedCubes);
        }
        return retValue;
    }

    public String edit(Cube original, Cube cube) {
        String retValue = null;
        if (cube != null && original != null) {
            if (!original.isSameUniverse(cube)) {
                X3DObject removeCube = removeCube(original);
                retValue = transform.generateDeltaMessage("delete", x3dScene, true, removeCube);
            } else if (original.isPositionEqual(cube)) {
                X3DObject material = updateMaterial(original, cube);
                if (material != null) {
                    retValue = transform.generateDeltaMessage("update", x3dScene, material);
                }
            } else {
                X3DObject material = null;
                if (!original.getMaterial().equals(cube.getMaterial())) {
                    material = updateMaterial(original, cube);
                }
                X3DObject updatePosition = updatePosition(original, cube);
                if (updatePosition != null) {
                    if (material != null) {
                        retValue = transform.generateDeltaMessage("update", x3dScene, updatePosition, material);
                    } else {
                        retValue = transform.generateDeltaMessage("update", x3dScene, updatePosition);
                    }
                }
            }

        }
        return retValue;
    }

    protected X3DObject removeCube(Cube cube) {
        X3DObject retValue = null;
        if (cube != null) {
            if (cubeMap.containsKey(cube)) {
                X3DTransform cubeNode = cubeMap.get(cube);
                if (x3dScene.removeTransform(cubeNode)) {
                    cubeMap.remove(cube);
                    retValue = cubeNode;
                }
            }
        }
        return retValue;

    }

    protected X3DObject updateMaterial(Cube original, Cube cube) {
        X3DObject retValue = null;
        if (cube != null) {
            X3DMaterial material = material(cube.getMaterial());
            if (cubeMap.containsKey(original)) {
                X3DTransform get = cubeMap.get(original);
                if ((get.getShape() != null) && (get.getShape().getAppearance() != null) && (get.getShape().getAppearance().getMaterial() != null)) {
                    X3DAppearance appearance = get.getShape().getAppearance();
                    material.setId(appearance.getMaterial().getId());
                    appearance.setMaterial(material);
                }
            }
            retValue = material;
        }
        return retValue;
    }

    protected X3DObject updatePosition(Cube original, Cube cube) {
        X3DObject retValue = null;
        if (cube != null) {
            X3DTransform position;
            if (cubeMap.containsKey(original)) {
                position = position(x3dScene, cube);
                X3DTransform get = cubeMap.get(original);
                position.setId(get.getId());
            } else {
                position = createCube(x3dScene, cube);
            }
            cubeMap.put(cube, position);
            retValue = position;
        }
        return retValue;
    }

    protected X3DTransform createCube(X3DScene parent, Cube cube) {
        X3DTransform retValue = null;
        if (parent != null && cube != null) {
            try {
                retValue = position(parent, cube);

                X3DShape shape = new X3DShape();
                generator.generateID(retValue, shape);
                retValue.setShape(shape);

                X3DAppearance appearance = new X3DAppearance();
                generator.generateID(shape, appearance);
                shape.setAppearance(appearance);

                X3DMaterial material = material(cube.getMaterial());
                generator.generateID(appearance, material);
                appearance.setMaterial(material);

                X3DBox box = new X3DBox();
                generator.generateID(shape, box);
                box.setSize("1.0,1.0,1.0");
                shape.addBox(box);

            } catch (X3DException ex) {
                Logger.getLogger(SceneDataTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return retValue;
    }

    protected X3DTransform position(X3DScene parent, Cube cube) {
        X3DTransform retValue = null;
        if (parent != null && cube != null) {
            try {
                retValue = new X3DTransform();
                generator.generateID(parent, retValue);
                X3DAxisVector position = new X3DAxisVector();
                position.setX(cube.getXAxis());
                position.setY(cube.getYAxis());
                position.setZ(cube.getZAxis());
                retValue.setTranslation(position);
            } catch (X3DException ex) {
                Logger.getLogger(X3DSceneManager.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return retValue;
    }

    protected X3DMaterial material(Material material) {
        X3DMaterial retValue = null;
        if (material != null && (material.getColor() != null)) {
            try {
                float color[] = new float[3];
                color = material.getColor().getColorComponents(color);
                retValue = new X3DMaterial();
                X3DColor diffuseColor = new X3DColor();
                diffuseColor.setR(color[0]);
                diffuseColor.setG(color[1]);
                diffuseColor.setB(color[2]);
                retValue.setDiffuseColor(diffuseColor);
            } catch (X3DException ex) {
                Logger.getLogger(X3DSceneManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retValue;

    }

}
