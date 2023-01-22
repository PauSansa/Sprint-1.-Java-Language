package n3exercici1;

import java.util.Comparator;

public class CompDni91 implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o2.getDni().compareTo(o1.getDni());
    }
}
