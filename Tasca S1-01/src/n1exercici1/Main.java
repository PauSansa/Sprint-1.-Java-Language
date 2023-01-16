package n1exercici1;

public class Main {
    static InstrumentVent Trombon = new InstrumentVent("Trombon", 47.99);
    static InstrumentCorda Guitarra = new InstrumentCorda("Guitarra", 93.79);
    static InstrumentPercussio Bateria = new InstrumentPercussio("Bateria", 247.25);

    public static void main(String[] args) {
        Trombon.tocar();
        Guitarra.tocar();
        Bateria.tocar();
    }
}
