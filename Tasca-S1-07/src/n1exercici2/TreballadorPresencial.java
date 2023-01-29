package n1exercici2;

public class TreballadorPresencial extends Treballador {

    private static int benzina = 40;
    public TreballadorPresencial(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);
    }

    @Override
    public void calcularSou(int horesTreballades) {
        int salari = (this.getPreuHora() * horesTreballades) + benzina;
        System.out.println(salari + " €");
    }
}
