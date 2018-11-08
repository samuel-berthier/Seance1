package fr.univ_amu.iut;

import java.time.LocalDate;

public class Technicien extends Employe {

    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Technicien(int num, String num_Secu, String nom, String prenom, int echelon, LocalDate date_naiss, LocalDate date_embauche, double nombre_heure, double base, int nbUnitesProduites, double tauxCommissionUnite) {
        super(num, num_Secu, nom, prenom, echelon, date_naiss, date_embauche, nombre_heure, base);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }


    public void fabriquerProduit(){
        System.out.println(">> Je fabrique des produits");

    }
    @Override
    public double getSalaireBrut(){
        return base* nombre_heure + nbUnitesProduites * tauxCommissionUnite;
    }
}
