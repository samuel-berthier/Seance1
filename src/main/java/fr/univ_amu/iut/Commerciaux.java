package fr.univ_amu.iut;

import java.time.LocalDate;

public class Commerciaux extends Employe {

    protected double chiffreAffaires;
    protected double tauxComission;

    public Commerciaux(int num, String num_Secu, String nom, String prenom, int echelon, LocalDate date_naiss, LocalDate date_embauche, double nombre_heure, double base, double chiffreAffaires, double tauxComission) {
        super(num, num_Secu, nom, prenom, echelon, date_naiss, date_embauche, nombre_heure, base);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxComission = tauxComission;
    }


    public void negocierTransaction(){
        System.out.println(">> Je négocie une transaction");
    }

    @Override
    public double getSalaireBrut() {
       return base+ chiffreAffaires*tauxComission;
    }
}
