package n2exercici2;

import java.util.Comparator;

public class ComparadorRestaurant implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Restaurant r1 = (Restaurant) o1;
        Restaurant r2 = (Restaurant) o2;

        int compNom = r1.getNom().compareTo(r2.getNom());

        if (compNom == 0) {
            return Integer.compare(r1.getPuntuacio(), r2.getPuntuacio());
        } else {
            return compNom;
        }
    }
}