package n2exercici1;

public abstract class Telefon {
    String marca;
    String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void trucar(int numTelf) {
        System.out.printf("Estas trucant al: %f%n", numTelf);
    }

}
