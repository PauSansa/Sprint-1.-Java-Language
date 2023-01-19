package n3exercici1;

public class Butaca {
    private final int fila;
    private final int seient;
    private final String persona;

    public Butaca(int fila, int seient, String persona) {
        this.fila = fila;
        this.seient = seient;
        this.persona = persona;
    }

    public boolean equals(Butaca b1) {

        if (this.fila == b1.getFila() && this.seient == b1.getSeient()) {
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

    public String persona() {
        return persona;
    }
}
