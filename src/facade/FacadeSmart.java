/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.List;
import model.Smart;

/**
 *
 * @author neto_
 */
public class FacadeSmart extends Smart {

    private Smart smart;

    public FacadeSmart(List listaSmartExames) {
        super();
        smart.setSmartExames(listaSmartExames);
    }

}
