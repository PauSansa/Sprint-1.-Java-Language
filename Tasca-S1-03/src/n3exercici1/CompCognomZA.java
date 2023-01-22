package n3exercici1;

import java.util.Comparator;

public class CompCognomZA implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o2.getCognom().compareTo(o1.getCognom());
    }
}
