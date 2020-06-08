/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author neto_
 */
public class Principal {

    public static void main(String[] args) {

        Apoio apoio = new Apoio();
        Apoio apoio2 = new Apoio();
        Apoio apoio3 = new Apoio();
        List listaApoio = new ArrayList();
        List listaApoio2 = new ArrayList();
        List listaApoio3 = new ArrayList();

        List<Apoio> pacientesApoio = new ArrayList<>();
        List<Smart> pacientesSmart = new ArrayList<>();

        Smart smart = new Smart();
        Smart smart2 = new Smart();
        Smart smart3 = new Smart();
        List listaSmart = new ArrayList();
        List listaSmart2 = new ArrayList();
        List listaSmart3 = new ArrayList();

        apoio.setApoioNomePaciente("Neto");
        apoio.setApoioOS("3");
        listaApoio.add("ferro");
        listaApoio.add("ferritina");
        listaApoio.add("tsh");
        apoio.setApoioExames(listaApoio);

        apoio2.setApoioNomePaciente("Bia");
        apoio2.setApoioOS("2");
        listaApoio2.add("ferro");
        listaApoio2.add("ferritina");
        listaApoio2.add("tsh");
        apoio2.setApoioExames(listaApoio2);

        smart.setSmartNomePaciente("Neto");
        smart.setSmartOS("3");
        listaSmart.add("ferro");
        listaSmart.add("ferritina");
        listaSmart.add("tsh");
        smart.setSmartExames(listaSmart);

        smart2.setSmartNomePaciente("Bia");
        smart2.setSmartOS("2");
        listaSmart2.add("ferro");
        listaSmart2.add("ferritina");
        listaSmart2.add("tsh");
        smart2.setSmartExames(listaSmart2);

        pacientesApoio.add(apoio);
        pacientesApoio.add(apoio2);

        pacientesSmart.add(smart);
        pacientesSmart.add(smart2);

        List<Apoio> excessao = new ArrayList();

        for (int i = 0; i < pacientesApoio.size(); i++) {

            // Começa em zero a cada novo paciente!
            int x = 0;
            for (int cont = 0; cont < pacientesSmart.size(); cont++) {
                if (pacientesApoio.get(i).getApoioOS().equals(pacientesSmart.get(cont).getSmartOS())) {
                   
                    x=1;  // Atribue a 1 a cada paciente encontrado!
                    System.out.println("");
                    System.out.println("Paciente Encontrado:");
                    System.out.println("OS: " + pacientesApoio.get(i).getApoioOS());
                    System.out.println("Nome: " + pacientesApoio.get(i).getApoioNomePaciente());
                    for (int j = 0; j < pacientesApoio.get(i).getApoioExames().size(); j++) {

                        if (pacientesApoio.get(i).getApoioExames().get(j).toString().
                                equals(pacientesSmart.get(cont).getSmartExames().get(j).toString())) {

                            System.out.println(" - " + pacientesApoio.get(i).getApoioExames().get(j).toString());
                        } else {
                            System.out.println(" - " + pacientesApoio.get(i).getApoioExames().get(j).toString() + "(Não Encontrado no Smart)");
                        }

                    }
                } else if (cont == pacientesSmart.size() - 1 && x==0) {
                    System.out.println("");
                    System.out.println("Paciente não encontrado:");
                    System.out.println("OS: " + pacientesApoio.get(i).getApoioOS());
                    System.out.println("Nome: " + pacientesApoio.get(i).getApoioNomePaciente());
                }
            }
        }
    }
}
