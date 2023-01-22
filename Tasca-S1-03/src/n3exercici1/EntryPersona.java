package n3exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntryPersona {
    public static int llegirInt(String msg){
        Scanner sc = new Scanner(System.in);
        boolean correcte = false;
        int valor = 0;
        while (!correcte) {
            try {
                System.out.println();
                System.out.println(msg);
                valor = sc.nextInt();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("\n Valor incorrecte, s'ha demanat un Int \n");
            }
        }
        return valor;
    }

    public static String llegirString(String msg) {
        Scanner sc = new Scanner(System.in);
        boolean correcte = false;
        String valor = null;
        while (!correcte) {
            try {
                System.out.println();
                System.out.println(msg);
                valor = sc.nextLine();
                correcte = true;
            } catch (Exception e) {
                System.out.println("Format incorrecte, introdueix un String");
                sc.next();
            }
        }
        return valor;
    }
}
