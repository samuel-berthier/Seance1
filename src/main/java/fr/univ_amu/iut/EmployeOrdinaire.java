package fr.univ_amu.iut;

import java.time.LocalDate;

public class EmployeOrdinaire extends Employe {


    public EmployeOrdinaire(int num, String num_Secu, String nom, String prenom, int echelon, LocalDate date_naiss, LocalDate date_embauche, double nombre_heure, double base) {
        super(num, num_Secu, nom, prenom, echelon, date_naiss, date_embauche, nombre_heure, base);
    }

    public void EffectuerTacheOrdinaire(){
        System.out.println(" >>J'effectue une tache de type normale");
    }
    @Override
    public double getSalaireBrut(){
        return base * nombre_heure + echelon * 100;
    }
}
