package n1exercici2;

import java.util.Arrays;
import java.util.List;

public class n2exercici2M {
    public static void main(String[] args) {
        List<String> llistaO5 = creaLlistaO5();
        llistaO5.forEach(System.out::println);
    }

    private static List<String> creaLlistaO5() {
        List<String> llista = Arrays.asList("to", "ta", "otopara", "a", "pa", "podearg","o");

        return llista.stream().filter(item -> item.contains("o") && item.length() >= 5).toList();
    }
}
