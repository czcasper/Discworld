/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.facades;

import cz.a_d.discworld.datamodel.users.Configuration;
import cz.a_d.discworld.datamodel.users.User;
import cz.a_d.discworld.datamodel.users.User_;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author casper
 */
@Stateless
@LocalBean
public class UserFascade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "Discworld-ejbPU")
    private EntityManager em;

    @EJB
    protected WorldFacade worldFascade;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFascade() {
        super(User.class);
    }

    @PostConstruct
    public void initCriteriaBuilder() {
        criteriaBuilder = em.getCriteriaBuilder();
    }

    public User getUserbyName(String name) {
        User retValue = null;
        if (name != null && (!name.isEmpty())) {
            CriteriaQuery<User> findUserByName = criteriaBuilder.createQuery(User.class);
            Root<User> from = findUserByName.from(User.class);
            CriteriaQuery<User> where = findUserByName.where(criteriaBuilder.equal(from.get(User_.id), name));
            TypedQuery<User> find = em.createQuery(where);
            try {
                retValue = find.getSingleResult();
            } catch (NoResultException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "User record for user name:" + name + " not found", ex);
            }
        }
        return retValue;
    }

    public void initializeUserDefaults(User user) {
        boolean changed = validateUserConfigurationObject(user);
        changed = (changed || validateDefaultConfigurationSettings(user));
        if (changed) {
            em.merge(user);
        }
    }
    
    public void validateDefaultConfiguration(User user){
        if(validateDefaultConfigurationSettings(user)){
            em.merge(user);
        }
    }

    protected boolean validateUserConfigurationObject(User user) {
        boolean retValue = false;
        Configuration defaultConfig = user.getDefaultConfiguration();
        if (defaultConfig == null) {
            if (user.getConfigurations() == null || user.getConfigurations().isEmpty()) {
                defaultConfig = new Configuration();
                defaultConfig.setUser(user);
                user.setDefaultConfiguration(defaultConfig);
            } else {
                user.setDefaultConfiguration(user.getConfigurations().get(0));
            }
            retValue = true;
        }
        return retValue;
    }

    protected boolean validateDefaultConfigurationSettings(User user) {
        boolean retValue = false;
        Configuration defaultConfiguration = user.getDefaultConfiguration();
        if (defaultConfiguration.getLastWorld() == null) {
            if (user.getWorlds() == null || user.getWorlds().isEmpty()) {
                defaultConfiguration.setLastWorld(worldFascade.getFirstWorld());
            } else {
                defaultConfiguration.setLastWorld(user.getWorlds().get(0));
            }
            retValue = true;
        }
        return retValue;
    }

}
