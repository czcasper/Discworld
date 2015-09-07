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
import javax.annotation.PostConstruct;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
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

    @PostConstruct
    public void initCriteriaBuilder() {
        criteriaBuilder = em.getCriteriaBuilder();
    }

    public List<Cube> findCubes(World world, Long shadowLevel) {
        List<Cube> retValue = null;
        if (world != null && shadowLevel != null) {
            CriteriaQuery<Cube> findAllInWorld = criteriaBuilder.createQuery(Cube.class);
            Root<Cube> from = findAllInWorld.from(Cube.class);
            CriteriaQuery<Cube> where = findAllInWorld.where(
                    criteriaBuilder.and(criteriaBuilder.equal(from.get(Cube_.world), world), criteriaBuilder.equal(from.get(Cube_.shadowLevel), shadowLevel))
            );
            TypedQuery<Cube> cubeQuery = em.createQuery(where);
            retValue = cubeQuery.getResultList();
        }
        return retValue;
    }

    public void deleteCubes(List<Cube> cubes) throws EJBException {
        if (cubes != null && (!cubes.isEmpty())) {
            CriteriaDelete<Cube> deleteAllCubes = criteriaBuilder.createCriteriaDelete(Cube.class);
            Root<Cube> from = deleteAllCubes.from(Cube.class);

            Predicate keyConditions[] = new Predicate[cubes.size()];
            int i = 0;
            for (Cube cube : cubes) {
                Predicate createCubeKey = createCubeKey(cube, from);
                if (createCubeKey != null) {
                    keyConditions[i++] = createCubeKey;
                }
            }
            CriteriaDelete<Cube> where = deleteAllCubes.where(criteriaBuilder.or(keyConditions));
            em.createQuery(where).executeUpdate();
        }
    }

    public void moveCube(Cube oldCube, Cube cube, boolean force) throws EJBException {
        if (cube != null) {
            if (force) {
                
                em.persist(cube);
            } else {
                em.persist(cube);
            }
            CriteriaDelete<Cube> deleteAllCubes = criteriaBuilder.createCriteriaDelete(Cube.class);
            Root<Cube> from = deleteAllCubes.from(Cube.class);
            CriteriaDelete<Cube> where = deleteAllCubes.where(createCubeKey(oldCube, from));
            em.createQuery(where).executeUpdate();
        }
    }
    
    protected Predicate createCubeKey(Cube cube, Root<Cube> from) {
        Predicate retValue = null;
        if (cube != null && from != null) {
            retValue = criteriaBuilder.and(criteriaBuilder.equal(from.get(Cube_.world), cube.getWorld()),
                    criteriaBuilder.equal(from.get(Cube_.shadowLevel), cube.getShadowLevel()),
                    criteriaBuilder.equal(from.get(Cube_.xAxis), cube.getXAxis()),
                    criteriaBuilder.equal(from.get(Cube_.yAxis), cube.getYAxis()),
                    criteriaBuilder.equal(from.get(Cube_.zAxis), cube.getZAxis()));
        }
        return retValue;
    }
}
