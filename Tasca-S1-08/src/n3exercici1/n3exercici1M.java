package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class n3exercici1M {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>(){{
            add(new Persona("Adri",19,"Java",8));
            add(new Persona("Sergio",20,"PHP",7));
            add(new Persona("Xavier",21,"PHP",9));
            add(new Persona("Morato",20,"Java",6));
            add(new Persona("Ivan",17,"PHP",4));
            add(new Persona("ElMen",18,"Java",7));
            add(new Persona("Toni",20,"Java",9));
            add(new Persona("Miguel",20,"Java",4));
            add(new Persona("Bauti",19,"PHP",9));
            add(new Persona("Xuxu",20,"Java",7));
        }
        };

        //Printear nom i edat
        System.out.println("\n Printea nom i edat \n");
        //cambiar --------------------------------------------------------------------------
        personas.forEach((p) -> System.out.println(p.getNom() + " " + p.getEdat()));


        //Printear comença x A
        System.out.println("\n Printea nom i edat dels que començen x A \n");
        List<Persona> personasA = personas.stream()
                .filter((p) -> p.getNom().startsWith("A"))
                .toList();
        personasA.forEach(System.out::println);


        //Printear notas > 5
        System.out.println("\n Printea nom i edat dels aprovats \n");
        List<Persona> personasAprovadas = personas.stream()
                .filter((p) -> p.getNota() >= 5)
                .toList();
        personasAprovadas.forEach(System.out::println);

        //Printear notas > 5 no PHP
        System.out.println("\n Printea nom i edat dels aprovats que no fan PHP \n");
        List<Persona> personasAprovadasNoPHP = personas.stream()
                .filter((p) -> p.getNota() >= 5 && !p.getCurs().equals("PHP"))
                .toList();
        personasAprovadasNoPHP.forEach(System.out::println);

        //Printear Alumnes Majors de Java
        System.out.println("\n Printea els estudiants de java majors de edat \n");
        List<Persona> personasMajorsJava = personas.stream()
                .filter((p) -> p.getCurs().equals("Java") && p.getEdat() >= 18)
                .toList();
        personasMajorsJava.forEach(System.out::println);

    }
}
