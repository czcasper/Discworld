/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.facades;

import cz.a_d.discworld.datamodel.universe.World;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author casper
 */
@Stateless
public class WorldFacade extends AbstractFacade<World> {
    @PersistenceContext(unitName = "Discworld-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WorldFacade() {
        super(World.class);
    }
    
}
