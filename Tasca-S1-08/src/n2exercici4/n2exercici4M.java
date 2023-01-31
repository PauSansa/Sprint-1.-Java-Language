package n2exercici4;

import java.util.*;

public class n2exercici4M {
    public static void main(String[] args) {
        List<String> llista = Arrays.asList("24", "e", "Hola", "es", "terete", "189", "4324", "PalmDeVera");

        Comparator primerE = ePrimer();

        System.out.println("\n Alfabetic: \n");

        List<String> lAlfabetic = new ArrayList<>(llista.stream().toList());
        lAlfabetic.sort(String::compareTo);
        lAlfabetic.forEach(System.out::println);

        System.out.println("\n e Primer: \n");

        List<String> lprimerE = new ArrayList<>(llista.stream().toList());
        lprimerE.sort(ePrimer());
        lprimerE.forEach(System.out::println);

        System.out.println("\n Modificar a x 4: \n");
        List<String> lModificada= new ArrayList<>(llista.stream().toList());
        ListIterator<String> lt = lModificada.listIterator();
        modificaA(lt);
        lModificada.forEach(System.out::println);

        System.out.println("\n Mostrar Digits \n");
        List<String> lADigits = new ArrayList<>(llista.stream().toList());
        lADigits.forEach((str) -> {
            if (str.matches("[0-9]*")) {
                System.out.println(str);
            };
        });



    }

    private static void modificaA(ListIterator<String> lt ) {
        while(lt.hasNext()){
            String str = lt.next();
            if (str.contains("a")) {
                lt.set(str.replace('a', '4'));
            }
        }


    }

    private static Comparator<String> ePrimer() {
        Comparator<String> comp = (s1, s2) -> {
            char char1 = s1.charAt(0);
            char char2 = s2.charAt(0);

            if (char1 == 'e' && char2 != 'e') {
                return -10;
            } else if (char1 != 'e' && char2 == 'e') {
                return 10;
            } else {
                return 0;
            }
        };
        return comp;
    }
}
