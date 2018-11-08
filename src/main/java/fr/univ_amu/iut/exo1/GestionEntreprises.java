package fr.univ_amu.iut.exo1;

import fr.univ_amu.iut.Employe;
import fr.univ_amu.iut.Entreprise;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {
        ArrayList<Employe> employes = new ArrayList<>();

        employes.add(new Employe(1,"123456789", "Berthier", "Samuel", 1, LocalDate.of(1975,10,30),LocalDate.of(2000,10,20),14, 3));
        employes.add(new Employe(1,"123456788", "Berthier", "Nono", 1, LocalDate.of(1975,10,30),LocalDate.of(2000,10,20),14, 4));
        employes.add(new Employe(1,"123456787", "Moller", "Roger", 1, LocalDate.of(1975,10,30),LocalDate.of(2000,10,20),14, 4));

        Entreprise entreprise = new Entreprise("ma_boite_info", employes);
        System.out.println(entreprise);


        //throw new RuntimeException("Not yet implemented !");
    }
}