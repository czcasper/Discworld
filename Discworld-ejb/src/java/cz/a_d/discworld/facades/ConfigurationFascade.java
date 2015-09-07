/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.facades;

import cz.a_d.discworld.datamodel.users.Configuration;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author casper
 */
@Stateless
@LocalBean
public class ConfigurationFascade extends AbstractFacade<Configuration> {

    @PersistenceContext(unitName = "Discworld-ejbPU")
    private EntityManager em;

    public ConfigurationFascade() {
        super(Configuration.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @PostConstruct
    public void initCriteriaBuilder() {
        criteriaBuilder = em.getCriteriaBuilder();
    }


}
