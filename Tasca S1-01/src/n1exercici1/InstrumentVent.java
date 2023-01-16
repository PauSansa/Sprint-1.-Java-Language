package n1exercici1;

public class InstrumentVent extends Instrument{
    public InstrumentVent(String name, double price) {
        super(name, price);
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}
