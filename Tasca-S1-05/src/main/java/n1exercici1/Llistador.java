package n1exercici1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Llistador implements Serializable {
    private final File file;
    private final String path;
    private final SimpleDateFormat sdf;
    private final boolean isDefault;


    public Llistador(File file) {
        this.file = file;
        this.path = file.getAbsolutePath();
        this.sdf = new SimpleDateFormat();
        this.isDefault = false;
    }

    public Llistador() {
        this.file = new File(System.getProperty("user.dir"));
        this.path = file.getAbsolutePath();
        this.sdf = new SimpleDateFormat();
        this.isDefault = true;
    }

    public void llegirArchiu() {
        if (isDefault || this.file.isDirectory()) {
            System.out.println("Has d'introduir un path de archiu, no de directori!");
            return;
        }
        try {
            FileReader fr = new FileReader(this.file);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while((linea= br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception e){
            System.out.println("Ha ocurregut un error desconegut");
            e.printStackTrace();
        }
    }

    public static Llistador cargarLlistador(File f) {
        Llistador ll = Serializador.desSerializar(f);
        return ll;
    }

    public void guardarLlistador(){
        try{
            Serializador.serializar(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void llistar() {
        List<String> llistaFiles = new ArrayList<>();
        try {
            for (String nomDirectoris : file.list()) {
                llistaFiles.add(nomDirectoris);
            }
        } catch (NullPointerException e){
            System.out.println("El path introduit es un Fitxer, no una carpeta!");
            return;
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
        File pathGuardat = new File(path.concat(File.separator + "arbre.txt"));
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

    public File getFile() {
        return file;
    }

    public String getPath() {
        return path;
    }

    public boolean isDefault() {
        return isDefault;
    }
}
