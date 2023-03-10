package n3exercici1;

import java.util.Iterator;
import java.util.Scanner;

public class Cine {
    private int nFiles;
    private int nSeients;
    private final GestioButaques gestioButaques;

    public Cine(){
        gestioButaques = new GestioButaques();
        demanarDadesInicials();
    }

    public void iniciar() {
        while (true) {
            int opt = menu();
            switch (opt) {
                case 1:
                    mostrarButaques();
                    break;
                case 2:
                    mostrarButaquesPersona();
                    break;
                case 3:
                    reservarButaca();
                    break;
                case 4:
                    anularReserva();
                    break;
                case 5:
                    anularReservaPersona();
                    break;
                case 0:
                    return;
            }
        }

    }

    private void demanarDadesInicials(){
        Scanner sc = new Scanner(System.in);

        int files = entrysCine.llegirInt("\n Introdueixi el nombre de files \n");

        int seientsF = entrysCine.llegirInt("\n Introdueixi el nombre de seients per fila \n");

        this.nFiles = files;
        this.nSeients = seientsF;
    }

    private int menu() {
        System.out.println("\n \n");
        System.out.println("###### MENU CINEMA ######");
        System.out.println("\n 1.- Mostrar totes les butaques reservades. \n");
        System.out.println(" 2.- Mostrar les butaques reservades per una persona. \n");
        System.out.println(" 3.- Reservar una butaca. \n");
        System.out.println(" 4.- Anul·lar la reserva d’una butaca. \n");
        System.out.println(" 5.- Anul·lar totes les reserves d’una persona. \n");
        System.out.println(" 0.- Sortir. \n");

        int opcio = entrysCine.llegirInt("Introdueix Opció: \n");
        return opcio;

    }

    private void mostrarButaques() {
        for (Butaca b : this.gestioButaques.getButaques()) {
            System.out.printf("\n Fila: %s Seient: %s Ocupat per %s", b.getFila(),b.getSeient(), b.getPersona());
        }
    }

    private void mostrarButaquesPersona() {
        String persona = introduirPersona();
        boolean trobat = false;

        for (Butaca b : this.gestioButaques.getButaques()) {
            if (b.getPersona().equals(persona))
            System.out.printf("\n Fila: %s Seient: %s ", b.getFila(),b.getSeient());
            trobat = true;
        }

        if (!trobat) {
            System.out.println("\n No s'ha trobat cap butaca reservada per a aquesta persona");
        }

    }

    private void reservarButaca() {
        int fila;
        int seient;
        String persona;

        fila = introduirFila();
        seient = introduirSeient();
        persona = introduirPersona();

        Butaca butaca = new Butaca(fila,seient,persona);
        this.gestioButaques.afegirButaques(butaca);
    }

    private void anularReserva() {
        int fila = introduirFila();
        int seient = introduirSeient();

        this.gestioButaques.eliminarButaques(fila, seient);
    }

    private void anularReservaPersona(){
        boolean eliminat = false;
        String persona = introduirPersona();

        Iterator<Butaca> butacaIterator = this.gestioButaques.getButaques().iterator();
        while (butacaIterator.hasNext()) {
            Butaca b = butacaIterator.next();
            if (b.getPersona().equals(persona)) {
                this.gestioButaques.eliminarButaques(b.getFila(), b.getSeient());
                eliminat = true;
            }
        }

        if (!eliminat) {
            System.out.println("No he trobat cap reserva a aquell nom!");
        }

    }

    private int introduirFila() {
        boolean correcte = false;
        int fila = 0;
        while (!correcte) {
            try {
                fila = entrysCine.llegirInt("Introdueixi fila desitjada");

                if (fila > this.nFiles) {
                    throw new ExcepcioFilaIncorrecte();
                } else {
                    correcte = true;
                }
            } catch (ExcepcioFilaIncorrecte e){
                System.out.printf("\n Aquesta fila no existeix, recorda que nomes tenim %s files", this.nFiles);
            }
        }
        return fila;
    }

    private int introduirSeient(){
        boolean correcte =false;
        int seient = 0;
        while (!correcte) {
            try {
                seient = entrysCine.llegirInt("Introdueixi seient desitgat");

                if (seient > this.nSeients) {
                    throw new ExcepcioSeientIncorrecte();
                } else {
                    correcte = true;
                }
            } catch (ExcepcioSeientIncorrecte e) {
                System.out.printf("\n Aquest seient no existeix, recorda que nomes tenim %s seients", this.nSeients);
            }
        }

        return seient;
    }

    private String introduirPersona() {
        String persona = null;
        boolean correcte = false;

        while (!correcte) {
            try {
                persona = entrysCine.llegirString("Introdueix el nom de la Persona: \n").toLowerCase();

                if (persona.matches(".*[0-9].*")) {
                    throw new ExcepcioNomIncorrecte();
                } else {
                    correcte = true;
                }

            } catch (ExcepcioNomIncorrecte e){
                System.out.println("\n El nom es incorrecte, no pots introduir nombres!");
            }
        }

        return persona;
    }
}
