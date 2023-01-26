package n2exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class n2exercici1M {

    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("config.properties"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String path = properties.getProperty("path");
        String guardarPath = properties.getProperty("guardarPath");
        String guardarNom = properties.getProperty("guardarNom");

        Llistador ll = new Llistador(path, guardarPath, guardarNom);
        ll.guardarArbre();
    }
}
