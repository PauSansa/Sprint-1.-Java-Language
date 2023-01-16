package n1exercici1;

public class InstrumentCorda extends Instrument{

    public InstrumentCorda(String name, double price) {
        super(name, price);
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
