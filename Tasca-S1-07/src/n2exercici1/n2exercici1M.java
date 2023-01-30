package n2exercici1;

public class n2exercici1M {
    public static void main(String[] args) {
        Cotxe cotxe = new Cotxe("Audi", "a3");
        Serializador ser = new Serializador();
        try {
            ser.guardarAJson(cotxe);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

