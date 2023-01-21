package n2exercici2;

import java.util.Comparator;
import java.util.Objects;

public class Restaurant {
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio){
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Restaurant) {
            Restaurant otro = (Restaurant) obj;

            if (this.nom.equals(otro.nom) && this.puntuacio == otro.puntuacio) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}