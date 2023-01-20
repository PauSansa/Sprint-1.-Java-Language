package n1exercici3;

import java.util.Scanner;

public class entryJoc {
    public static String llegirString(String missatge){
        Scanner sc = new Scanner(System.in);
        boolean correcte = false;
        String valor = null;
        while (!correcte) {
            try {
                System.out.println();
                System.out.println(missatge);
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
