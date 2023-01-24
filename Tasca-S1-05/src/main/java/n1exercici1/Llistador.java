package n1exercici1;

import java.io.File;
import java.util.ArrayList;

import java.util.List;

public class Llistador {

    private int iteracions;

    public Llistador(){}

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

    public void llistarDirectoriArbre(File directori) {
        for (File df : directori.listFiles()) {
            if (df.isDirectory()){
                this.iteracions = iteracions + 1;
                llistarDirectoriArbre(df);
            } else if (df.isFile()) //Aqui

        }
    }
}
