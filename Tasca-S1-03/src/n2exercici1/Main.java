package n2exercici1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant restaurant1 = new Restaurant("Uno", 5);
        Restaurant restaurant2 = new Restaurant("Uno", 5);

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);

        System.out.println(restaurants);
    }
}
