package n3exercici1;

import java.util.List;

public class App {
    GestioPersona gestioPersona;

    public App(){
        gestioPersona = new GestioPersona();
    }

    public void iniciar() {
        while (true) {
            int opt = menu();
            switch (opt) {
                case 1:
                    this.gestioPersona.afegirPersona();
                    break;
                case 2:
                    nomAZ();
                    break;
                case 3:
                    nomZA();
                    break;



            }
        }
    }

    public void nomZA() {
        List<Persona> ZASorted = gestioPersona.getPersonas();
        ZASorted.sort(new CompNomZA());

        System.out.println("\n ___Nom___ ____Cognoms___ __NIF__ ");

        for (Persona p : ZASorted) {
            System.out.println(p.getNom() + "  " + p.getCognom() + "  " + p.getDni());
        }
    }


    public void nomAZ() {
        List<Persona> AZSorted = gestioPersona.getPersonas();
        AZSorted.sort(new CompNomAZ());

        System.out.println("\n ___Nom___ ____Cognoms___ __NIF__ ");

        for (Persona p : AZSorted) {
            System.out.println(p.getNom() + "  " + p.getCognom() + "  " + p.getDni());
        }
    }

    public int menu(){
        System.out.println("\n #-#-#- MENU GESTIO -#-#-#");
        System.out.println("1.- Introduir persona.");
        System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
        System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
        System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
        System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
        System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
        System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");

        int opt = EntryPersona.llegirInt("Introdueixi Opcio");

        return opt;

    }
}
