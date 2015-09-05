/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.facades;

import cz.a_d.discworld.datamodel.users.User;
import cz.a_d.discworld.datamodel.users.User_;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
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
    
    protected CriteriaBuilder criteriaBuilder;
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFascade() {
        super(User.class);
    }
    
    @PostConstruct
    public void initCriteriaBuilder(){
        criteriaBuilder = em.getCriteriaBuilder();
    }

    public User getUserbyName(String name){
        User retValue = null;
        if(name!=null &&(!name.isEmpty())){
            CriteriaQuery<User> findUserByName = criteriaBuilder.createQuery(User.class);
            Root<User> from = findUserByName.from(User.class);
            CriteriaQuery<User> where = findUserByName.where(criteriaBuilder.equal(from.get(User_.id), name));
            TypedQuery<User> find = em.createQuery(where);
            retValue = find.getSingleResult();
        }
        return retValue;
    }
}
