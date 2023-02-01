package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class n1exercici3M {
    public static void main(String[] args) {
        creaLlistamessos();
    }

    private static void creaLlistamessos() {
        List<String> mesos = Arrays.asList("Gener", "Febrer", "Març","Abril", "Maig", "Juny", "Juliol","Agost", "Septembre","Octubre","Novembre","Desembre");
        mesos.forEach((s) -> System.out.println(s));

    }
}
