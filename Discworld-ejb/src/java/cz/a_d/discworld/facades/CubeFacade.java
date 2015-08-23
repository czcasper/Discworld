/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.facades;

import cz.a_d.discworld.datamodel.universe.World;
import cz.a_d.discworld.datamodel.universe.geodata.Cube;
import cz.a_d.discworld.datamodel.universe.geodata.Cube_;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author maslu02
 */
@Stateless
public class CubeFacade extends AbstractFacade<Cube> {

    @PersistenceContext(unitName = "Discworld-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CubeFacade() {
        super(Cube.class);
    }

    public List<Cube> findCubes(World world) {
        List<Cube> retValue = null;
        if (world != null) {
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<Cube> findAllInWorld = criteriaBuilder.createQuery(Cube.class);
            Root<Cube> from = findAllInWorld.from(Cube.class);
            CriteriaQuery<Cube> where = findAllInWorld.where(criteriaBuilder.equal(from.get(Cube_.world), world));
            TypedQuery<Cube> cubeQuery = em.createQuery(where);
            retValue = cubeQuery.getResultList();
        }
        return retValue;
    }
}
