package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> llista1 = new ArrayList<>();
        llista1.add(1);
        llista1.add(2);
        llista1.add(3);
        llista1.add(4);

        List<Integer> llista2 = new ArrayList<>();

        ListIterator<Integer> iterator = llista1.listIterator(llista1.size());
        while (iterator.hasPrevious()) {
            llista2.add(iterator.previous());
        }

        System.out.println(llista1);
        System.out.println(llista2);
    }
}
