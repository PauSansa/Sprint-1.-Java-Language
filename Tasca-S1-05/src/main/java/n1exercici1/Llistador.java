package n1exercici1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Llistador {

    private int iteracions;

    public Llistador(){};

    public void llistarDiretori(File directori) {
        List<String> listSubDirectoris = new ArrayList<>();

        if (directori.listFiles() != null){
            for (File subdirectori: directori.listFiles()) {
                if (subdirectori.length() != 0){
                    listSubDirectoris.add(subdirectori.getName());
                }

            }
            listSubDirectoris.sort(String::compareTo);

            for (String nomDirectori: listSubDirectoris) {
                System.out.println("    " + nomDirectori);
            }
        }

    }

    public void llistarFile(File directori, int iteracions) {
        String espai = "";
        for (int i = 0; i < iteracions; i++) {
            espai = espai.concat("  ");
        }
        System.out.println(espai + directori.getName());
    }

    public void llistarDirectory(File directori, int iteracions){

    }

    public void llistarDiretoriArbre(File directori) {


        for (File fd : directori.listFiles()) {
            //Si es un directori torna a executar aquest metode sumantli una iteracio
            if(fd.isDirectory()){
                llistarFile(fd,iteracions);
                this.iteracions = iteracions + 1;
                llistarDiretoriArbre(fd);
            } else {
                llistarFile(fd, this.iteracions);
            }

        }

        iteracions = 0;


    }
}
