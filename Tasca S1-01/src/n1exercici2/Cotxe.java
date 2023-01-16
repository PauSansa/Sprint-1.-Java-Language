package n1exercici2;

public class Cotxe {
    //No es pot modificar en el codi ni inicialitzarlo al constructor
    static final String marca = "Audi";
    //Es pot modificar en el codi pero no inicialitzarlo en el constructor
    static String model = "A3";
    //No es pot modificar en el codi pero es pot inicialitzar en el constructor
    final int potencia;

    public Cotxe(int potencia) {
        this.potencia = potencia;
    }

    //No es pot utilitzar amb una instancia
    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    //Es pot utilitzar amb una instancia
    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

}
