package n1exercici1;

import java.util.Arrays;
import java.util.List;


public class n1exercici1M {

    public static void main(String[] args) {
        List<String> llista = creaLlistaO();
        llista.forEach(System.out::println);

        System.out.println();

        List<String> llistaO5 = creaLlistaO5();
        llistaO5.forEach(System.out::println);
    }

    private static List<String> creaLlistaO() {
        List<String> llista = Arrays.asList("to", "ta", "o", "a", "pa", "po");

        return llista.stream().filter(item -> item.contains("o")).toList();
    }

    private static List<String> creaLlistaO5() {
        List<String> llista = Arrays.asList("to", "ta", "otopara", "a", "pa", "podearg","o");

        return llista.stream().filter(item -> item.contains("o")).filter(item -> item.length() >= 5).toList();
    }
}
