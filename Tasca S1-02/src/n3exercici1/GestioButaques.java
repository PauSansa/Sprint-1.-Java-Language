package n3exercici1;

import java.util.ArrayList;

public class GestioButaques {
    ArrayList<Butaca> butacas;

    public GestioButaques() {
        butacas = new ArrayList<>();
    }

    public void eliminarButaques(int fila, int seient) {
        Butaca butaca;
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

    public int cercaButaques(int fila, int seient){
        int result = -1;

        for (Butaca b : this.butacas) {
            if (b.getFila() == fila && b.getSeient() == seient) {
                result = this.butacas.indexOf(b);
            }
        }

        return result;
    }

    public ArrayList<Butaca> getButaques() {
        return butacas;
    }
}
