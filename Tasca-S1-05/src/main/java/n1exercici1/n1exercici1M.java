package n1exercici1;

import java.io.File;

public class n1exercici1M {

    public static void main(String[] args) {
        Llistador ll = new Llistador();

        File dir = new File(".");
        Llistador llAmbFile = new Llistador(dir);

        ll.llistarArbre();
        ll.guardarArbre();
        llAmbFile.llistar();
    }
}
