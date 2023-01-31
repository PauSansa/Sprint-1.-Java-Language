package n1exercici1;

import java.util.Arrays;
import java.util.List;


public class n1exercici1M {

    public static void main(String[] args) {
        List<String> llista = creaLlistaO();
        llista.forEach(System.out::println);
    }

    private static List<String> creaLlistaO() {
        List<String> llista = Arrays.asList("to", "ta", "o", "a", "pa", "po");

        return llista.stream().filter(item -> item.contains("o")).toList();
    }
}
