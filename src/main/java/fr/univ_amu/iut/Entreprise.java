package fr.univ_amu.iut;

import java.io.*;
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
        //Map<Long, Employe> ListAnciennete = new HashMap<>();
        for(Employe employe: liste){
            long nbMois = ChronoUnit.MONTHS.between(employe.getDate_embauche(), LocalDate.now());
            System.out.println(employe + "Prime :" + nbMois*10);
        }
    }


    public void sauvegarder() {
        try {
            FileOutputStream fos = new FileOutputStream("sauv.data");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.liste);
            System.out.println("Données sauvegardées..");
            oos.close();
            fos.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void charger() throws ClassNotFoundException{
        try{
            FileInputStream fis = new FileInputStream("sauv.data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Employe> liste = (List<Employe>) ois.readObject();
            System.out.println(liste);
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
