package n3exercici1;

import java.util.Scanner;

public class Cine {
    private int files;
    private int seientsF;
    private GestioButaques gestioButaques;

    public Cine(){
        gestioButaques = new GestioButaques();
        demanarDadesInicials();
    }

    public void iniciar() {
        menu();
    }

    private void demanarDadesInicials(){
        Scanner sc = new Scanner(System.in);

        int files = entrysCine.llegirInt("\n Introdueixi el nombre de files \n");

        int seientsF = entrysCine.llegirInt("\n Introdueixi el nombre de seients per fila \n");

        this.files = files;
        this.seientsF = seientsF;
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

    //Despres de proves cambiar reservarButaca a private
    public void reservarButaca() {
        boolean correcteF = false;
        boolean correcteB = false;
        int fila;
        int butaca;

        while(!correcteF) {
            try {
                fila = entrysCine.llegirInt("Introdueix fila: \n");
                correcteF = true;
            }
        }


    }
}
