/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.List;
import model.Apoio;

/**
 *
 * @author neto_
 */
public class FacadeApoio extends Apoio{
    
    private Apoio apoio;

    public FacadeApoio(List listaApoioExames) {
        super();
        apoio.setApoioExames(listaApoioExames);
    }
       
}
