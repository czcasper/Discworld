/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.x3dom.handler;

import cz.a_d.discworld.x3dom.X3DObject;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author casper
 */
@Stateless
@LocalBean
public class X3DElementIDGenerator {

    public boolean generateID(X3DObject parent, X3DObject destination) {
        boolean retValue = false;
        if (parent != null && destination != null) {
            String id = parent.getId();
            if (id != null && (!id.isEmpty())) {
                Class<? extends X3DObject> destClass = destination.getClass();
                if (destClass != null) {
                    destination.setId(id + "_" + destClass.getName() + "_" + System.currentTimeMillis() + "_" + Math.random());
                    retValue = true;
                }
            }
        }
        return retValue;
    }
}
