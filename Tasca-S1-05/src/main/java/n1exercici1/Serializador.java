package n1exercici1;

import java.io.*;

public class Serializador {

    public static void serializar(Llistador ll){
        try {
            FileOutputStream fos = new FileOutputStream("llistador.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(ll);
            oos.close();
            fos.close();

        } catch (Exception e ){
            System.out.println("Un error descoengut s'ha produit");
            e.printStackTrace();
        }
    }

    public static Llistador desSerializar(File f){
        Llistador ll = null;
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ll = (Llistador) ois.readObject();
        } catch (Exception e){
            System.out.println("un error desconegut s'ha produit");
            e.printStackTrace();
        }
        return ll;
    }
}
