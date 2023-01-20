package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> mesos = new ArrayList<>();
        mesos.add(new Month("Gener"));
        mesos.add(new Month("Febrer"));
        mesos.add(new Month("Març"));
        mesos.add(new Month("Abril"));
        mesos.add(new Month("Maig"));
        mesos.add(new Month("Juny"));
        mesos.add(new Month("Juliol"));
        mesos.add(new Month("Septembre"));
        mesos.add(new Month("Octubre"));
        mesos.add(new Month("Novembre"));
        mesos.add(new Month("Desembre"));

        mesos.add(7, new Month("Agost"));

        HashSet<Month> hashMesos = new LinkedHashSet<>(mesos);
        Iterator<Month> iteratorMesos = mesos.iterator();

        for (Month m : hashMesos) {
            System.out.printf("\n %s amb HashSet \n", m.getName());
        }

        while(iteratorMesos.hasNext()) {
            Month m = iteratorMesos.next();
            System.out.printf("\n %s amb Iterator \n", m.getName());
        }


    }

}
