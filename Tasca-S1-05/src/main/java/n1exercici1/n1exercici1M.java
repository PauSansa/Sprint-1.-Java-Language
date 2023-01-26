package n1exercici1;

import java.io.File;

public class n1exercici1M {

    public static void main(String[] args) {
        Llistador ll = new Llistador();

        File dir = new File(".\\arbre.txt");
        File obj = new File(".\\llistador.ser");




        Llistador llDesS = Llistador.cargarLlistador(obj);
        System.out.println(llDesS.getFile() + " " + llDesS.getPath() + " " + llDesS.isDefault());
    }

}
