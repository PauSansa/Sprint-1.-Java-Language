package n1exercici7;

import java.util.Arrays;
import java.util.List;

public class n1exercici7M {
    public static void main(String[] args) {
        List<String> llista = Arrays.asList("un", "2", "48", "tete", "paraiguas", "gorra", "90348", "o");
        llista.sort((i,o) -> o.length() - i.length());
        llista.forEach(System.out::println);
    }
}
