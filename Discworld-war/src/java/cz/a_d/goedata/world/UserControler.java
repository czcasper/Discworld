/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.goedata.world;

import cz.a_d.discworld.datamodel.users.User;
import cz.a_d.discworld.facades.UserFascade;
import java.io.Serializable;
import java.security.Principal;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author casper
 */
@ManagedBean
@SessionScoped
public class UserControler implements Serializable {

    @EJB
    protected UserFascade em;

    protected User user;

    /**
     * Get the value of user
     *
     * @return the value of user
     */
    public User getUser() {
        if (user == null) {
            HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().
                    getExternalContext().getRequest();
            if (request != null) {
                Principal userPrincipal = request.getUserPrincipal();
                if (userPrincipal != null) {
                    user = em.getUserbyName(userPrincipal.getName());
                    if (user == null) {
                        user = new User();
                        user.setId(userPrincipal.getName());
                        em.create(user);
                        em.flush();
                    }
                }
            }
        }
        return user;
    }

    /**
     * Creates a new instance of UserControler
     */
    public UserControler() {
    }

}
