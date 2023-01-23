package n2exercici1;

import java.util.HashMap;

public class CalculoDni {
    private String lletraDni;
    private HashMap<Integer, String> tablaConversio;

     public CalculoDni(int numero){
        creaTabla();
        int resto = numero % 23;
        lletraDni = tablaConversio.get(resto);;
     }

     private void creaTabla() {
         tablaConversio = new HashMap<>();
         tablaConversio.put(0, "T");
         tablaConversio.put(1, "R");
         tablaConversio.put(2, "W");
         tablaConversio.put(3, "A");
         tablaConversio.put(4, "G");
         tablaConversio.put(5, "M");
         tablaConversio.put(6, "Y");
         tablaConversio.put(7, "F");
         tablaConversio.put(8, "P");
         tablaConversio.put(9, "D");
         tablaConversio.put(10, "X");
         tablaConversio.put(11, "B");
         tablaConversio.put(12, "N");
         tablaConversio.put(13, "J");
         tablaConversio.put(14, "Z");
         tablaConversio.put(15, "S");
         tablaConversio.put(16, "Q");
         tablaConversio.put(17, "V");
         tablaConversio.put(18, "H");
         tablaConversio.put(19, "L");
         tablaConversio.put(20, "C");
         tablaConversio.put(21, "K");
         tablaConversio.put(22, "E");
     }

    public String getLletraDni() {
        return lletraDni;
    }

    public HashMap<Integer, String> getTablaConversio() {
        return tablaConversio;
    }
}
