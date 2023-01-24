package n1exercici1;

import java.io.File;

public class n1exercici1M {

    public static void main(String[] args) {
        Llistador ll = new Llistador();
        File directori = new File(".");
        ll.llistarDiretoriArbre(directori);
    }
}
