package n3exercici1;

import java.util.ArrayList;

public class GestioButaques {
    private ArrayList<Butaca> butacas;

    public GestioButaques() {
        butacas = new ArrayList<>();
    }

    public int cercaButaques(int fila, int seient){
        int result = -1;

        for (Butaca b : this.butacas) {
            if (b.getFila() == fila && b.getSeient() == seient) {
                result = this.butacas.indexOf(b);
            }
        }

        return result;
    }

    public void eliminarButaques(int fila, int seient) {
        int iButaca;

        iButaca = cercaButaques(fila, seient);
        try {
            if (iButaca == -1) {
                throw new ExcepcioButacaLliure();
            } else {
                this.butacas.remove(iButaca);
            }
        } catch (ExcepcioButacaLliure e) {
            System.out.println("La Butaca introduida no te cap reserva");
        }
    }

    public void afegirButaques(Butaca butaca) {
        boolean ocupat = false;
        try {
            for (Butaca b : this.butacas) {
                if (b.getFila() == butaca.getFila() && b.getSeient() == butaca.getSeient()) {
                    ocupat = true;
                }
            }
            if(ocupat) {
                throw new ExcepcioButacaOcupada();
            } else {
                this.butacas.add(butaca);
            }
        } catch (ExcepcioButacaOcupada e) {
            System.out.println("Aquesta butaca esta ocupada");
        }

    }

    public ArrayList<Butaca> getButaques() {
        return butacas;
    }
}
