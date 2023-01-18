package n1exercici2;

public class Cotxe {
    //No es pot modificar en el codi ni inicialitzarlo al constructor
    private static final String marca = "Audi";
    //Es pot modificar en el codi pero no inicialitzarlo en el constructor
    private static String model = "A3";
    //No es pot modificar en el codi pero es pot inicialitzar en el constructor
    private final int potencia;

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
