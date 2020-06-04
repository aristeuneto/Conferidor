/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author neto_
 */
public class Smart {

    private String smartNomePaciente;
    private String smartOS;
    private List<String> smartExames;

    public Smart() {
    }

    public Smart(String smartNomePaciente, String smartOS, List<String> smartExames) {
        this.smartNomePaciente = smartNomePaciente;
        this.smartOS = smartOS;
        this.smartExames = smartExames;
    }

    public String getSmartNomePaciente() {
        return smartNomePaciente;
    }

    public void setSmartNomePaciente(String smartNomePaciente) {
        this.smartNomePaciente = smartNomePaciente;
    }

    public String getSmartOS() {
        return smartOS;
    }

    public void setSmartOS(String smartOS) {
        this.smartOS = smartOS;
    }

    public List<String> getSmartExames() {
        return smartExames;
    }

    public void setSmartExames(List<String> apoioExames) {
        this.smartExames = apoioExames;
    }

}
