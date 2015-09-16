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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
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

    @PostConstruct
    public void initCriteriaBuilder() {
        criteriaBuilder = em.getCriteriaBuilder();
    }

    public WorldFacade() {
        super(World.class);
    }

    public void deleteWord(World world) throws EJBException {
        CriteriaDelete<Cube> delete = criteriaBuilder.createCriteriaDelete(Cube.class);
        Root<Cube> from = delete.from(Cube.class);
        delete.where(criteriaBuilder.equal(from.get(Cube_.world), world));
        em.createQuery(delete).executeUpdate();
        remove(world);
        em.flush();
    }

    public World getFirstWorld() {
        World retValue = null;
        CriteriaQuery<World> query = criteriaBuilder.createQuery(World.class);
        query.select(query.from(World.class));
        try {
            List<World> resultList = em.createQuery(query).setMaxResults(1).getResultList();
            if(resultList!=null &&(!resultList.isEmpty())){
                retValue = resultList.get(0);
            }
        } catch (NoResultException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "No record in World data found", ex);
        }
        return retValue;
    }
}
