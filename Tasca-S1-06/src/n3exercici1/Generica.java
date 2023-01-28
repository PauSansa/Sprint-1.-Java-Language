package n3exercici1;

public class Generica {
    //nomes te acces als metodes de Telefon
    public static  <T extends Telefon> void metode1(T obj1){
        obj1.trucar();
    }


    //Te acces als metodes de Smartphone
    public static <T extends Smartphone> void metode2(T obj1){
        obj1.trucar();
        obj1.ferFotos();
    }
}
