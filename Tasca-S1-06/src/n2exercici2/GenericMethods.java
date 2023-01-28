package n2exercici2;

import n2exercici1.Persona;

public class GenericMethods {
    public static <T> void generic(T... items) {
        for(T item : items){
            System.out.println(item);
        }
    }
}
