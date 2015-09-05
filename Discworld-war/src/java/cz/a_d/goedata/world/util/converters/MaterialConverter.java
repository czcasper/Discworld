/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.goedata.world.util.converters;

import cz.a_d.discworld.datamodel.universe.Material;
import cz.a_d.discworld.datamodel.universe.World;
import cz.a_d.goedata.world.MaterialController;
import cz.a_d.goedata.world.WorldController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author casper
 */
@FacesConverter("materialConverter")
public class MaterialConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.length() == 0) {
            return null;
        }

        MaterialController controller = (MaterialController) context.getApplication().getELResolver().
                getValue(context.getELContext(), null, "materialController");
        List<Material> materials = controller.getMaterials();
        for (Material mat : materials) {
            if (value.equals(mat.getId().toString())) {
                return mat;
            }
        }

        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Material) {
            Material o = (Material) value;
            return o.getId().toString();
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{value, value.getClass().getName(), Material.class.getName()});
            return null;
        }
    }

}
