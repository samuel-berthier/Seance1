package fr.univ_amu.iut.exo1;

import fr.univ_amu.iut.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestionEntreprises {
    public static void main(String[] args) {
        List<Employe> employes = new ArrayList<>();

        employes.add(new EmployeOrdinaire(1,"123456789", "Berthier", "Samuel", 1, LocalDate.of(1975,10,30),LocalDate.of(2000,10,20),14, 3));
        employes.add(new Technicien(1,"123456788", "Berthier", "Nono", 1, LocalDate.of(1975,10,30),LocalDate.of(2000,10,20),42, 4, 45, 2.0));
        employes.add(new Commerciaux(1,"123456787", "Moller", "Roger", 1, LocalDate.of(1975,10,30),LocalDate.of(2000,10,20),42, 4, 2, 30));

        Entreprise entreprise = new Entreprise("ma_boite_info", employes);
        entreprise.distribuerBonus();
        System.out.println(entreprise);


        //throw new RuntimeException("Not yet implemented !");
    }
}