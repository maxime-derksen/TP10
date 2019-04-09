package fr.umontpellier.iut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EntrepriseTest {

    private Entreprise SG;
    private Employe toto, titi, tata;

    @BeforeEach
    void setUp(){
        Entreprise SG = new Entreprise();

        Employe toto = new Employe("N665", "Derksen", "Maxime", 23, 100, 35);
        Employe titi = new Employe("N675", "Derksen", "Maxime", 23, 100, 35);
        Employe tata = new Employe("N685", "Arcksen", "Maxime", 23, 100, 35);

    }

    @Test
    void getEmployes() {
        SG.embaucher(toto, LocalDate.now());
        SG.embaucher(tata, LocalDate.of(2018, 1, 21));
        SG.embaucher(titi, LocalDate.of(2015, 4, 18));
        ArrayList<Employe> employes = new ArrayList<>(SG.getEmployes());
        assertEquals(4, employes.size());
        assertEquals(toto, employes.get(0));
        assertEquals(tata, employes.get(1));
        assertEquals(titi, employes.get(2));


    }
}