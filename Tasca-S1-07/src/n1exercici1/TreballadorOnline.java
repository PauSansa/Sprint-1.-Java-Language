package n1exercici1;

public class TreballadorOnline extends Treballador{
    private final int internet = 19;

    public TreballadorOnline(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);
    }

    @Override
    public void calcularSou(int horesTreballades) {
        int salari = this.getPreuHora()*horesTreballades + internet;
        System.out.println(salari + " €");
    }
}
