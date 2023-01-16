package n1exercici1;

public abstract class Instrument {
    String name;
    double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void tocar();
}
