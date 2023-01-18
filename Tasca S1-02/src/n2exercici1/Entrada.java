package n2exercici1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Entrada {
    static Scanner sc = new Scanner(System.in);

    public static byte llegirByte(String missatge) {
        boolean correcte = false;
        byte valor = 0;
        while (!correcte) {
            try {
                System.out.println();
                System.out.println(missatge);
                valor = sc.nextByte();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("\n Error de format, introdueix un byte(numero del -128 al 127)");
                sc.next();
            }
        }
        return valor;
    }

    public static int llegirInt(String missatge) {
        boolean correcte = false;
        int valor = 0;

        while (!correcte) {
            try {
                System.out.println();
                System.out.println(missatge);
                valor = sc.nextInt();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("\n Format incorrecte, has d'introduir un Integer(Numero Enter)");
                sc.next();
            }
        }

        return valor;
    }

    public static float llegirFloat(String missatge) {
        boolean correcte = false;
        float valor = 0;

        while (!correcte) {
            try {
                System.out.println();
                System.out.println(missatge);
                valor = sc.nextFloat();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("\n Format incorrecte, has d'introduir un Float");
                sc.next();
            }
        }
        return valor;
    }

    public static double llegirDouble(String missatge) {
        boolean correcte = false;
        float valor = 0;
         while (!correcte) {
             try {
                 System.out.println();
                 System.out.println(missatge);
                 valor = sc.nextFloat();
                 correcte = true;
             } catch (InputMismatchException e) {
                 System.out.println("\n Format incorrecte, has d'introduir un Double");
                 sc.next();
             }
         }
         return valor;
    }

    public static char llegirChar(String missatge) {
        boolean correcte = false;
        char valor = 0;
        String entrada;
        while (!correcte) {
            try {
                System.out.println();
                System.out.println(missatge);
                entrada = sc.next();

                if (entrada.length() > 1) {
                    throw new Exception();
                }
                valor = entrada.charAt(0);
                correcte = true;

            } catch (Exception e) {
                System.out.println("\n Format incorrecte, introdueix un caracter");

            }
        }
        return valor;
    }

    public static String llegirString(String missatge){
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

    public static boolean llegirSiNo(String missatge){
        boolean correcte = false;
        boolean valor = false;
        String entrada;

        while(!correcte) {
            try {
                System.out.println();
                System.out.println(missatge);
                entrada = sc.next();

                if (entrada.toLowerCase().equals("s")) {
                    valor = true;
                    correcte = true;
                } else if (entrada.toLowerCase().equals("n")) {
                    valor = false;
                    correcte = true;
                } else {

                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("\n Valor incorrecto");
            }
        }
        return valor;
    }
}


