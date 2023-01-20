package n1exercici3;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Joc {
    private String nom;
    private int score;
    private HashMap<String, String> hashValors = new HashMap<>();
    private String path;

    public void iniciar() {
        crearValors();
        demanarDadesInicials();
        joc();

    }

    private void joc() {
        Scanner sc = new Scanner(System.in);

        //Joc corre amb iterator de set per evitar repetir països
        HashSet<String> paisos = new HashSet<>(10);
        while (!(paisos.size() >= 10)) {
            int iPais = (int) (Math.floor(Math.random() * this.hashValors.size()));
            paisos.add((String) this.hashValors.keySet().toArray()[iPais]);
        }
        Iterator<String> iterator = paisos.iterator();

        while (iterator.hasNext()) {
            String pais = iterator.next();
            String resposta = entryJoc.llegirString(String.format("Quina es la capital de: %s?", pais));

            if (resposta.equals(this.hashValors.get(pais))) {
                this.score = this.score + 1;
            }
        }


        System.out.printf("\n %s, has tret %s punts! \n", this.nom, this.score);
        guardarPartida();
    }

    private void guardarPartida() {
        FileWriter fw = null;

        try {
            fw = new FileWriter(this.path.concat("classificacio.txt"), true);
            fw.write(String.format("%s ha tret %s punts \n", this.nom, this.score));
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

    }

    private void demanarDadesInicials() {
        Scanner sc = new Scanner(System.in);
        this.nom = entryJoc.llegirString("Introdueixi el seu nom");
    }

    private Scanner obtenirScanner(){
        Scanner sc = null;
        File doc;

        doc = new File("src\\n1exercici3\\countries.txt");
        if (!doc.exists()) {
            System.out.println("\n No s'ha trobat el fitxer");
            doc = seleccionadorArchiu();
        }

        this.path = doc.getAbsolutePath().replaceAll("countries.txt", "");

        try {
            sc = new Scanner(doc);
        } catch (FileNotFoundException e) {
                System.out.println("Error Desconegut");
            }
        return sc;
    }

    private void crearValors() {
        Scanner sc = obtenirScanner();
        while (sc.hasNext()){
            String[] combo = sc.nextLine().split(" ");

            combo[0] = combo[0].replace("_", " ");
            combo[1] = combo[1].replace("_", " ");


            this.hashValors.put(combo[0], combo[1]);
        }
        sc.close();
    }
    private File seleccionadorArchiu() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return null;
    }
}
