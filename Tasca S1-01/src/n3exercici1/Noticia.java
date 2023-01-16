package n3exercici1;

public abstract class Noticia {
    private String titular;
    private String text;
    private int score;
    private int price;

    public String getTitular() {
        return titular;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    public int getPrice() {
        return price;
    }
}
