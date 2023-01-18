package n3exercici1;

public class Butaca {
    private final int fila;
    private final int seient;
    private String nPersona;

    public Butaca(int fila, int seient, String nPersona) {
        this.fila = fila;
        this.seient = seient;
        this.nPersona = nPersona;
    }

    public int getFila() {
        return fila;
    }

    public int getSeient() {
        return seient;
    }

    public String getnPersona() {
        return nPersona;
    }
}
