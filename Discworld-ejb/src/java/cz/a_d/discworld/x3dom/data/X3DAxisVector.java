/*
 */
package cz.a_d.discworld.x3dom.data;

import cz.a_d.discworld.x3dom.exceptions.X3DException;

/**
 *
 * @author maslu02
 */
public class X3DAxisVector extends X3DVector<Double>{

    public X3DAxisVector() throws X3DException {
        this(null);
    }
    
    public X3DAxisVector(String definition) throws X3DException {
        super(Double.class, 3, definition);
    }
    
    public double getX(){
        return data.get(0);
    }
    
    public void setX(double x){
        data.set(0, x);
    }
    
    public double getY(){
        return data.get(1);
    }
    
    public void setY(double y){
        data.set(1, y);
    }
    
    public double getZ(){
        return data.get(2);
    }
    
    public void setZ(double z){
        data.set(2, z);
    }
}
