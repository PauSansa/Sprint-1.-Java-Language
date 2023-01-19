package n3exercici1;

public class Butaca {
    private final int fila;
    private final int seient;
    private final String nPersona;

    public Butaca(int fila, int seient, String nPersona) {
        this.fila = fila;
        this.seient = seient;
        this.nPersona = nPersona;
    }

    public boolean equals(Butaca b1, Butaca b2) {

        if (b1.getFila() == b2.getFila() && b1.getSeient() == b2.getSeient()) {
            return true;
        } else {
            return false;
        }
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
