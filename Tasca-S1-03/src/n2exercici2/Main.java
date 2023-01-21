package n2exercici2;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Restaurant[] restaurants = new Restaurant[] {
                new Restaurant("b", 1),
                new Restaurant("a", 2),
                new Restaurant("b", 2),
                new Restaurant("a", 1),
        };

        Arrays.sort(restaurants, new ComparadorRestaurant());

        for (Restaurant r : restaurants) {
            System.out.println(r.getNom() + r.getPuntuacio());
        }
    }
}
