package fr.umontpellier.iut;

import java.time.LocalDate;
import java.util.Objects;

public class Employe implements Comparable<Employe> {
    private String numSecuriteSociale;
    private String nom;
    private String prenom;
    private int echelon;
    private double base;
    private double nbHeures;
    private LocalDate dateEmbauche;



    public Employe(String numSecuriteSociale, String nom, String prenom, int echelon, double base, double nbHeures) {
        this.numSecuriteSociale = numSecuriteSociale;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.base = base;
        this.nbHeures = nbHeures;
    }


    public double calculerSalaireBrut(){
        return this.base * this.nbHeures + 100;
    }


    public double calculerSalaireNet(){
        return this.calculerSalaireBrut()*0.80;
    }


    @Override
    public String toString() {
        return "Employe{" +
                "numSecuriteSociale='" + numSecuriteSociale + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", echelon=" + echelon +
                ", salaire brut=" + calculerSalaireBrut() +
                ", salaire net=" + calculerSalaireNet() +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return numSecuriteSociale.equals(employe.numSecuriteSociale);
    }

    @Override
    public int hashCode() {
        return numSecuriteSociale.hashCode();
    }


    @Override
    public int compareTo(Employe o) {
        int x = nom.compareTo(o.nom);
        if (x == 0){
            return -(numSecuriteSociale.compareTo(o.numSecuriteSociale));
        }
        return x;
    }




    public int getEchelon() {
        return echelon;
    }

    public double getBase() {
        return base;
    }

    public double getNbHeures() {
        return nbHeures;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
}
