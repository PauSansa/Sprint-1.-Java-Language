package n1exercici1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Llistador {
    private final File file;
    private final String path;
    private final SimpleDateFormat sdf;


    private PrintWriter pw = null;

    public Llistador(File file) {
        this.file = file;
        this.path = file.getAbsolutePath();
        this.sdf = new SimpleDateFormat();
    }

    public Llistador() {
        this.file = new File(System.getProperty("user.dir"));
        this.path = file.getAbsolutePath();
        this.sdf = new SimpleDateFormat();
    }

    public void llistar() {
        List<String> llistaFiles = new ArrayList<>();
        for (String nomDirectoris : file.list()) {
            llistaFiles.add(nomDirectoris);
        }

        llistaFiles.sort(String::compareTo);

        for (String nom : llistaFiles) {
            System.out.println(nom);
        }
    }

    public void llistarArbre() {
        llistarRecursiu(file, "");
    }

    private void llistarRecursiu(File nodo, String espai) {
        if(nodo.isDirectory()){
            System.out.println("D: "+espai.concat(nodo.getName()) + " -- Ultima modf:  " +  sdf.format(nodo.lastModified()));
            String[] subNote = nodo.list();
            for(String filename : subNote){
                llistarRecursiu(new File(nodo, filename), espai.concat("  "));
            }
        } else {
            System.out.println("F: "+espai.concat(nodo.getName()+ " -- Ultima modf:  " +  sdf.format(nodo.lastModified())));
        }
    }

    public void guardarArbre() {
        File pathGuardat = new File(path.concat(File.separator+"arbre.txt"));
        try {
            if (!pathGuardat.exists()) {
                pathGuardat.createNewFile();
            }
            pw = new PrintWriter(new FileWriter(pathGuardat));
        } catch (IOException e) {
            System.out.println("S'ha produit un error inesperat");
        }

        guardarRecursiu(file, "", pw);

    }

    private void guardarRecursiu(File nodo, String espai, PrintWriter pwGuardar) {
        if(nodo.isDirectory()){
            pwGuardar.println("D: "+espai.concat(nodo.getName()) + " -- Ultima modf:  " +  sdf.format(nodo.lastModified()));
            pwGuardar.flush();
            String[] subNote = nodo.list();
            for(String filename : subNote){
                guardarRecursiu(new File(nodo, filename), espai.concat("  "), pw);
            }
        } else {
            pwGuardar.println("F: "+espai.concat(nodo.getName()+ " -- Ultima modf:  " +  sdf.format(nodo.lastModified())));
            pw.flush();
        }
    }
}
