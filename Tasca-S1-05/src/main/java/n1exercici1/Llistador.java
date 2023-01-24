package n1exercici1;

import java.io.File;

public class Llistador {

    public Llistador(){};

    public void llistarDiretori(File directori) {
        System.out.printf("\n Directori Introduit: %s \n", directori.getAbsolutePath());
        for (File subdirectoris: directori.listFiles()) {
            System.out.println(subdirectoris.getName());
        }
    }
}
