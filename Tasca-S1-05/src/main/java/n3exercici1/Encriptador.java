package n3exercici1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encriptador {
    private final String ALGORITHM = "AES/ECB/PKCS5Padding";
    private final byte[] keyValue;

    public Encriptador(String keyDe32Caracters) {
        this.keyValue = keyDe32Caracters.getBytes();
    }

    public  void encripta(String fileInput, String fileOutput) {
        try {
            Key key = new SecretKeySpec(keyValue, "AES");
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);

            FileInputStream fis = new FileInputStream(fileInput);
            byte[] inputBytes = new byte[(int) fis.available()];
            fis.read(inputBytes);

            byte[] outputBytes = cipher.doFinal(inputBytes);

            FileOutputStream fos = new FileOutputStream(fileOutput);
            fos.write(outputBytes);

            fis.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void desencripta(String fileInput, String fileOutput) {
        try {
            Key key = new SecretKeySpec(keyValue, "AES");
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);

            FileInputStream fis = new FileInputStream(fileInput);
            byte[] inputBytes = new byte[(int) fis.available()];
            fis.read(inputBytes);

            byte[] outputBytes = cipher.doFinal(inputBytes);

            FileOutputStream fos = new FileOutputStream(fileOutput);
            fos.write(outputBytes);

            fis.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

