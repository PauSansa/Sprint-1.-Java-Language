package n2exercici2;

public class n2exercici2M {


    public static void main(String[] args) {
        Persona p1 = new Persona("Pau", "Sansa", 19);
        Persona p2 = new Persona("Yung", "Beef", 30);
        Persona p3 = new Persona("Lopes", "Lopes", 28);

        GenericMethods.generic(p1,p2,p3);
        GenericMethods.generic(12,10);
        GenericMethods.generic("Pot", "tindre", "infinits", "parametres", "del", "mateix", "tipus");

    }
}
