package n1exercici1;

public class InstrumentPercussio extends Instrument{

    public InstrumentPercussio(String name, double price) {
        super(name, price);
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
