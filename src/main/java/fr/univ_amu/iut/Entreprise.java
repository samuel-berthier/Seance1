package fr.univ_amu.iut;

import java.util.ArrayList;

public class Entreprise {

    private String nom_entreprise;
    private ArrayList<Employe> liste;

    public Entreprise(String nom_entreprise, ArrayList<Employe> liste) {
        this.nom_entreprise = nom_entreprise;
        this.liste = liste;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "nom_entreprise='" + nom_entreprise + '\'' +
                ", liste=" + liste +
                '}';
    }
}
