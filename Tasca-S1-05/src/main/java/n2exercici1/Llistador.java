package n2exercici1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

public class Llistador {
    private final File file;
    private final String path;
    private final String guardarPath;
    private final String guardarNom;
    private final SimpleDateFormat sdf;

    public Llistador(String path, String guardarPath, String guardarNom) {
        this.file = new File(path);
        this.path = file.getAbsolutePath();
        this.sdf = new SimpleDateFormat();
        this.guardarPath = guardarPath;
        this.guardarNom = guardarNom;
    }

    public void guardarArbre() {
        File pathGuardat = new File(guardarPath.concat(File.separator + guardarNom));
        PrintWriter pw = null;
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

    private void guardarRecursiu(File nodo, String espai, PrintWriter pw) {
        if(nodo.isDirectory()){
            pw.println("D: "+espai.concat(nodo.getName()) + " -- Ultima modf:  " +  sdf.format(nodo.lastModified()));
            pw.flush();
            String[] subNote = nodo.list();
            for(String filename : subNote){
                guardarRecursiu(new File(nodo, filename), espai.concat("  "), pw);
            }
        } else {
            pw.println("F: "+espai.concat(nodo.getName()+ " -- Ultima modf:  " +  sdf.format(nodo.lastModified())));
            pw.flush();
        }
    }
}
