package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Redactor> redactors = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("*.-MENU EXERCICI-.*");
            System.out.println("1.- Introduir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introduir notícia a un redactor.");
            System.out.println("4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).");
            System.out.println("5.- Mostrar totes les notícies per redactor.");
            System.out.println("6.- Calcular puntuació de la notícia.");
            System.out.println("7.- Calcular Preu Noticia.");
            System.out.println();

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    redactors.add(creaRedactor());
                    break;
                case 2:
                    System.out.println("Has escogido la opcion 2");
            }
        }
    }

    public static Redactor creaRedactor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Nombre: \n");
        String nombre = sc.nextLine();

        System.out.println("Introduzca Dni: \n");
        String dni = sc.nextLine();

        Redactor redactor = new Redactor(nombre, dni);
        return redactor;
    }

    public static void eliminaRedactor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Dni del Redactor a borrar: \n");
    }
}
