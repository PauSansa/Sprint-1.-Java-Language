package n3exercici1;

public class Smartphone implements Telefon{
    @Override
    public void trucar() {
        System.out.println("Estic Trucant");
    }

    public void ferFotos() {
        System.out.println("Estic fent una foto");
    }
}
