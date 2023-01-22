package n3exercici1;

import java.util.Comparator;

public class CompCognomAZ implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getCognom().compareTo(o2.getCognom());
    }
}
