package n1exercici6;

import java.util.Arrays;
import java.util.List;

public class n1exercici6M {
    public static void main(String[] args) {
        //lista objects
        List<String> llista = Arrays.asList("un", "2", "48", "tete", "paraiguas", "gorra", "90348", "o");
        llista.sort((i,o) -> i.length() - o.length());
        llista.forEach(System.out::println);
    }
}
