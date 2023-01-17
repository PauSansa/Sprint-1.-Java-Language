package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Redactor> redactors = new ArrayList<>();
    static ArrayList<Noticia> noticies = new ArrayList<>();
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
                    creaRedactor();
                    break;
                case 2:
                    eliminaRedactor();
                    break;
                case 3:
                    introduirNoticia();
                    break;
            }
        }
    }

    public static void creaRedactor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Nombre: \n");
        String nombre = sc.nextLine();

        System.out.println("Introduzca Dni: \n");
        String dni = sc.nextLine();

        Redactor redactor = new Redactor(nombre, dni);
        redactors.add(redactor);
    }

    public static void eliminaRedactor(){
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        System.out.println("Introduzca Dni del Redactor a borrar: \n");
        String dni = sc.nextLine();

        for (Redactor r : redactors) {
            if (r.dni.equals(dni)) {
                redactors.remove(r);
                found = true;
                System.out.println("Redactor borrado con exito");
            }
        }
        if (!found) {
            System.out.println("No se ha encontrado el redactor");
        }
    }

    public static void introduirNoticia(){
        //Inicialitzo les variables
        String competicio;
        String club;
        String jugador;
        String tenista;
        String escuderia;
        String equip;


        Scanner sc = new Scanner(System.in);
        boolean found = false;
        Redactor redactor = null;

        System.out.println("Introduzca Dni del Redactor de la Noticia: \n");
        String dni = sc.nextLine();
        for (Redactor r : redactors) {
            if (r.dni.equals(dni)) {
                redactor = r;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No se ha encontrado el redactor");
            return;
        }


        System.out.println("\n \n \n");
        System.out.println("Introduzca titular");
        String titular = sc.nextLine();

        System.out.println("\n \n \n");
        System.out.println("Introduzca texto");
        String text = sc.nextLine();

        System.out.println("\n \n \n");
        System.out.println("Elija el tipo de noticia:");
        System.out.println("1.-Noticia de Futbol");
        System.out.println("2.-Noticia de Basquet");
        System.out.println("3.-Noticia de Tenis");
        System.out.println("4.-Noticia de F1");
        System.out.println("5.-Noticia de Motociclismo");

        int tipus = sc.nextInt();

        switch (tipus) {
            case 1:
                //Case Noticia Futbol
                //Parametros Noticia: String titular, String text, Redactor redactor
                //Parametros Futbol: String competicio, String club, String jugador
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Introdueix la competicio:");
                competicio = sc1.nextLine();

                System.out.println("Introdueix el club:");
                club = sc1.nextLine();

                System.out.println("Introdueix el jugador:");
                jugador = sc1.nextLine();

                NoticiaFutbol noticiaF = new NoticiaFutbol(titular,text,redactor,competicio,club,jugador);
                noticies.add(noticiaF);
                sc1.close();
                break;
            case 2:
                //Case Noticia Basquet
                //Parametros Noticia: String titular, String text, Redactor redactor
                //Parametros Basquet: String competicio, String club
                Scanner sc2 = new Scanner(System.in);

                System.out.println("Introdueix la competicio");
                competicio = sc2.nextLine();

                System.out.println("Introdueix el club");
                club = sc2.nextLine();

                NoticiaBasquet noticiaB = new NoticiaBasquet(titular, text, redactor, competicio, club);
                noticies.add(noticiaB);
                sc2.close();
                break;
            case 3:
                //Case Noticia Tenis
                //Parametros Noticia: String titular, String text, Redactor redactor
                //Parametros Tenis: String competicio, String tenista
                Scanner sc3 = new Scanner(System.in);

                System.out.println("Introdueix la competicio");
                competicio = sc3.nextLine();

                System.out.println("Introdueix el tenista");
                tenista = sc3.nextLine();

                NoticiaTenis noticiaT = new NoticiaTenis(titular, text, redactor, competicio, tenista);
                noticies.add(noticiaT);
                sc3.close();
                break;
            case 4:
                //Case Noticia F1
                //Parametros Noticia: String titular, String text, Redactor redactor
                //Parametros F1: String escuderia

                Scanner sc4 = new Scanner(System.in);

                System.out.println("Introdueix l'escuderia");
                escuderia = sc4.nextLine();

                NoticiaF1 noticia1F = new NoticiaF1(titular, text, redactor, escuderia);
                noticies.add(noticia1F);
                sc4.close();
                break;
            case 5:
                //Case Motociclisme
                //Parametros Noticia: String titular, String text, Redactor redactor
                //Parametros Motociclisme: String equip

                Scanner sc5 = new Scanner(System.in);

                System.out.println("Introdueix l'equip:");
                equip = sc5.nextLine();

                NoticiaMotociclisme noticiaM = new NoticiaMotociclisme(titular, text, redactor, equip);
                noticies.add(noticiaM);
                sc5.close();
                break;

        }


    }
}
