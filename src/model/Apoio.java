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
public class Apoio {

    private String apoioNomePaciente;
    private String apoioOS;
    private List<String> apoioExames;

    public Apoio() {
    }

    public Apoio(String apoioNomePaciente, String apoioOS, List<String> apoioExames) {
        this.apoioNomePaciente = apoioNomePaciente;
        this.apoioOS = apoioOS;
        this.apoioExames = apoioExames;
    }

    public String getApoioNomePaciente() {
        return apoioNomePaciente;
    }

    public void setApoioNomePaciente(String apoioNomePaciente) {
        this.apoioNomePaciente = apoioNomePaciente;
    }

    public String getApoioOS() {
        return apoioOS;
    }

    public void setApoioOS(String apoioOS) {
        this.apoioOS = apoioOS;
    }

    public List<String> getApoioExames() {
        return apoioExames;
    }

    public void setApoioExames(List<String> apoioExames) {
        this.apoioExames = apoioExames;
    }

}
