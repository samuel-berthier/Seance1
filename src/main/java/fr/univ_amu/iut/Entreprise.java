package fr.univ_amu.iut;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entreprise {

    private String nom_entreprise;
    private List<Employe> liste;

    public Entreprise(String nom_entreprise, List<Employe> liste) {
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


    public void distribuerBonus(){
        Map<Long, Employe> ListAnciennete = new HashMap<>();
        for(Employe employe: liste){
            long nbMois = ChronoUnit.MONTHS.between(employe.getDate_embauche(), LocalDate.now());
            System.out.println(employe + "Prime :" + nbMois*10);
        }
    }
}
