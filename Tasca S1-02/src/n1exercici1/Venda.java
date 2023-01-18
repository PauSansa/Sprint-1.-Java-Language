package n1exercici1;

import java.util.ArrayList;

public class Venda {
    ArrayList<Producte> productes = new ArrayList<>();

    public Venda(ArrayList<Producte> productes){
        this.productes = productes;
    }

    public void calcularTotal() throws VendaBuidaException {
        double total = 0;
        for (Producte p : productes) {
            total = total + p.preu;
        }
    }
}
