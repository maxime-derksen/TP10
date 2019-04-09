package fr.umontpellier.iut;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class GestionEmployes {

    public static void main(String[] args) {

        Entreprise SG = new Entreprise();

        Employe toto = new Employe("N665", "Derksen", "Maxime", 23, 100, 35);
        Employe titi = new Employe("N675", "Derksen", "Maxime", 23, 100, 35);
        Employe tata = new Employe("N685", "Arcksen", "Maxime", 23, 100, 35);

        System.out.println(SG);
        SG.embaucher(toto, LocalDate.now());
        SG.embaucher(tata, LocalDate.of(2018, 1, 21));
        SG.embaucher(titi, LocalDate.of(2015, 4, 18));

        System.out.println(SG);
    }
}
