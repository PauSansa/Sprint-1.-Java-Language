package n1exercici1;

import java.util.ArrayList;

public class Venda {
    ArrayList<Producte> productes = new ArrayList<>();

    public Venda(ArrayList<Producte> productes){
        this.productes = productes;
    }

    public void calcularTotal() throws VendaBuidaException {
        double total = 0;
        if (productes.size() == 0){
            throw new VendaBuidaException();
        }
        for (Producte p : productes) {
            total = total + p.preu;
        }
        System.out.println(total);
    }
}
