package n2exercici1;

public class GenericMethods {
    public static <T,U> void generic(Persona persona,T t1, U t2) {
        System.out.println(persona);
        System.out.println(t1);
        System.out.println(t2);
    }
}
