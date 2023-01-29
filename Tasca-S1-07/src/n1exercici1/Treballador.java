package n1exercici1;

public class Treballador {
    private String nom;
    private String cognom;
    private int preuHora;

    public Treballador(String nom, String cognom, int preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public void calcularSou(int horesTreballades) {
        System.out.println(preuHora * horesTreballades + " €");
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getPreuHora() {
        return preuHora;
    }
}
