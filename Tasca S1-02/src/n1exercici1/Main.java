package n1exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Venda> vendes = new ArrayList<>();
    static ArrayList<Producte> productes = new ArrayList<>();

    public static void main(String[] args) throws VendaBuidaException {
        //Testing, no final s'ha de cambiar y crear menu
        Producte producte1 = new Producte("Rellotge", 28.9);
        Producte producte2 = new Producte("Play", 400);
        productes.add(producte1);
        productes.add(producte2);

        creaVenda();
        Venda prueba = vendes.get(0);
        prueba.calcularTotal();
    }

    public static void creaVenda(){
        ArrayList<Producte> productesVenda = new ArrayList<>();
        boolean foundP = false;
        do {




            Scanner sc = new Scanner(System.in);

            System.out.println("\n \n");
            System.out.println("###--MENU VENDA--###");
            System.out.println("1.-Afegir producte a la venda");
            System.out.println("2.-Eliminar producte a la venda");
            System.out.println("3.-Veure productes a la venda");
            System.out.println("4.-Finalitzar venda");
            int opt = sc.nextInt();

            switch (opt){
                case 1:
                    Scanner sc1 = new Scanner(System.in);

                    System.out.println("Introdueix nom del producte a afegir");
                    String nomProducteC = sc1.nextLine();

                    for (Producte p : productes) {
                        if (p.nom.equals(nomProducteC)) {
                            productesVenda.add(p);
                            foundP = true;
                        }
                    }
                    if (!foundP) {
                        System.out.println("Producte no trobat \n \n");
                        return;
                    }
                    break;
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Introdueix nom del producte a eliminar");
                    String nomProducteD = sc2.nextLine();

                    for (Producte p : productes) {
                        if (p.nom.equals(nomProducteD)) {
                            productesVenda.remove(p);
                            foundP = true;
                        }
                    }
                    if (!foundP) {
                        System.out.println("Producte no trobat \n \n");
                        return;
                    }
                    break;
                case 3:
                    System.out.println("############");
                    for (Producte p : productesVenda) {
                        System.out.println("\n");
                        System.out.printf("Producte: %s, Preu: %s", p.nom,p.preu);
                        System.out.println("\n");
                        System.out.println("############");
                    }
                    break;
                case 4:
                    Venda venda = new Venda(productesVenda);
                    vendes.add(venda);
                    return;

        }


        } while (true);
    }
}
