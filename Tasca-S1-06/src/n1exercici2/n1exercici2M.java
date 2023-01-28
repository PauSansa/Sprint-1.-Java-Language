package n1exercici2;

import n1exercici2.GenericMethods;
import n1exercici2.Persona;

public class n1exercici2M {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pau", "Sansa", 19);
        GenericMethods.generic(p1, 997, "String");
    }
}
