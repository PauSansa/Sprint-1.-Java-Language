package n3exercici1;

public class Persona {
    private String nom;
    private int edat;
    private String curs;
    private int nota;

    public Persona(String nom, int edat, String curs, int nota) {
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
        this.nota = nota;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public String getCurs() {
        return curs;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        String msg = String.format("Nom: %s, Edat: %s, Curs: %s, Nota: %s",nom,edat,curs,nota);
        return msg;
    }
}
