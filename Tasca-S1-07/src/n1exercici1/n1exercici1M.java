package n1exercici1;

public class n1exercici1M {
    public static void main(String[] args) {
        Treballador t  = new Treballador("T1", "C1", 3);
        TreballadorOnline tO = new TreballadorOnline("TO", "CO", 4);
        TreballadorPresencial tP = new TreballadorPresencial("TP", "CP", 5);

        t.calcularSou(10);
        tO.calcularSou(11);
        tP.calcularSou(12);
    }
}
