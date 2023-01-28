package n1exercici1;

public class n1exercici1M {
    public static void main(String[] args) {
        NoGenericMethods ngm = new NoGenericMethods("1", "2", "3");
        for (String valor : ngm.getValors()) {
            System.out.println(valor);
        }
    }
}
