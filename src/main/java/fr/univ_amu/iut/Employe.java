package fr.univ_amu.iut;

import java.time.Duration;
import java.time.LocalDate;

public class Employe {

    private int num;
    private String num_Secu;
    private String nom;
    private String prenom;
    private int echelon;
    private LocalDate date_naiss;
    private LocalDate date_embauche;
    private String salaire_net;
    private String salaire_brut;
    private double nombre_heure;
    private double base;


    public Employe(int num, String num_Secu, String nom, String prenom, int echelon, LocalDate date_naiss, LocalDate date_embauche, double nombre_heure, double base) {
        this.num = num;
        this.num_Secu = num_Secu;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.date_naiss = date_naiss;
        this.date_embauche = date_embauche;
        this.nombre_heure = nombre_heure;
        this.base = base;
    }


    @Override
    public String toString() {
        return "Employe{" +
                "num=" + num +
                ", num_Secu='" + num_Secu + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", echelon=" + echelon +
                ", date_naiss=" + date_naiss +
                ", date_embauche=" + date_embauche +
                ", salaire_net='" + salaire_net + '\'' +
                ", salaire_brut='" + salaire_brut + '\'' +
                ", nombre_heure=" + nombre_heure +
                ", base=" + base +
                '}';
    }

    public double getSalaireNet(){
        return getSalaireBrut()*0.8;
    }

    public double getSalaireBrut(){
        Duration duration = Duration.between(LocalDate.now(), date_embauche);
        return (double)(duration.toHours() * base);
    }
}//Employe

