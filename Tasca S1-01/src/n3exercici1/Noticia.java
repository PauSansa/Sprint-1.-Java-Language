package n3exercici1;

public abstract class Noticia {
     String titular;
     String text;
     int score;
     int price;
     Redactor redactor;



    public abstract int calcularPreu();
    public abstract int calcularPuntuacio();
}
