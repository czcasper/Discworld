/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.facades;

import cz.a_d.discworld.datamodel.universe.World;
import cz.a_d.discworld.datamodel.universe.geodata.Cube;
import cz.a_d.discworld.datamodel.universe.geodata.Cube_;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;

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

    public void deleteWord(World world) throws EJBException {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaDelete<Cube> delete = criteriaBuilder.createCriteriaDelete(Cube.class);
        Root<Cube> from = delete.from(Cube.class);
        delete.where(criteriaBuilder.equal(from.get(Cube_.world), world));
        em.createQuery(delete).executeUpdate();
//        em.flush();
        remove(world);
    }
}
