package n3exercici1;

public class Persona {
    private String nom;
    private String cognom;
    private String dni;

    public Persona(String nom,String cognom, String dni) {
        this.nom = nom;
        this.cognom = cognom;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getDni() {
        return dni;
    }
}
