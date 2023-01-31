package n1exercici8;

public class n1exercici8M {
    public static void main(String[] args) {
        Inversor inv = (str) -> {
           String invertida = "";
           for (int i = str.length() - 1; i >= 0; i-- ){
               invertida += str.charAt(i);
           }
           return invertida;
        };
        System.out.println(inv.reverse("Hola"));
    }
}
