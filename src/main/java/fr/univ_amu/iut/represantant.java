package fr.univ_amu.iut;

import java.time.LocalDate;

public class represantant extends Commerciaux {
    public represantant(int num, String num_Secu, String nom, String prenom, int echelon, LocalDate date_naiss, LocalDate date_embauche, double nombre_heure, double base, double chiffreAffaires, double tauxComission) {
        super(num, num_Secu, nom, prenom, echelon, date_naiss, date_embauche, nombre_heure, base, chiffreAffaires, tauxComission);
    }

    @Override
    public double getSalaireBrut(){
        return base * nombre_heure + echelon * 100;
    }
}
