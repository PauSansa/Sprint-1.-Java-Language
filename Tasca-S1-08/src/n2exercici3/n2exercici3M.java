package n2exercici3;

public class n2exercici3M {
    public static void main(String[] args) {
        Interfaz suma = (a,b) -> a+b;
        Interfaz resta = (a,b) -> a-b;
        Interfaz multiplica = (a,b) -> a*b;
        Interfaz divide = (a,b) -> a/b;

        System.out.println(suma.operacio(5,10));
        System.out.println(resta.operacio(5,10));
        System.out.println(multiplica.operacio(5,10));
        System.out.println(divide.operacio(5,10));

    }
}
