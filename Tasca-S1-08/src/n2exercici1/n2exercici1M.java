package n2exercici1;

import java.util.Arrays;
import java.util.List;

public class n2exercici1M {
    public static void main(String[] args) {
        List<String> noms = Arrays.asList("Pau", "Sergio", "Vera", "PalmVera", "Miguel", "Edgar","Ana");
        List<String> rslt = noms.stream().filter((p) -> p.length() == 3 && p.startsWith("A")).toList();
        rslt.forEach(System.out::println);

    }
}
