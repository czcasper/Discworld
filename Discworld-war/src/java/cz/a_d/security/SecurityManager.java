/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.security;

import javax.inject.Named;
import java.io.Serializable;
import java.security.Principal;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author maslu02
 */
@Named(value = "securityManager")
@SessionScoped
public class SecurityManager implements Serializable {

    /**
     * Creates a new instance of SecurityManager
     */
    public SecurityManager() {
    }

    /**
     * @return Principal of the logged-in user
     */
    private Principal getLoggedInUser() {
        HttpServletRequest request
                = (HttpServletRequest) FacesContext.getCurrentInstance().
                getExternalContext().getRequest();
        return request.getUserPrincipal();
    }

    /**
     * Property
     *
     * @return Username of the logged-in user
     */
    public String getLoginUserName() {
        Principal loginUser = getLoggedInUser();
        if (loginUser != null) {
            return loginUser.getName();
        }
        return "Not logged in";
    }

}
