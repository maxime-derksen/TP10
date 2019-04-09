package fr.umontpellier.iut;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Entreprise {
    private Collection<Employe> lePersonnel;


    public Entreprise() {
        this.lePersonnel = new ArrayList<>();
    }


    void embaucher(Employe e, LocalDate dateEmbauche){
        e.setDateEmbauche(dateEmbauche);
        lePersonnel.add(e);
    }


    void licencier(Employe e){
        lePersonnel.remove(e);
    }


    public Collection<Employe> getEmployes() {

        /*TreeSet<Employe> t = new TreeSet();
        for (Employe e : lePersonnel) {
        t.add(e);
        }
        return t;*/

        return new TreeSet<>(lePersonnel);

    }


    @Override
    public String toString() {
        return "Entreprise{" +
                "lePersonnel=" + lePersonnel +
                '}';
    }

}

