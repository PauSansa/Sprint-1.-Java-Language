package n1exercici1;

public class VendaBuidaException extends RuntimeException {
    public VendaBuidaException() {
        super("Per fer una venda primer has d’afegir productes");
    }
}
