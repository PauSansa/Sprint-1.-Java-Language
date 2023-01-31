package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n2exercici2M {
    public static void main(String[] args) {
        Comprobador com = creaComprobador();
        List<Integer> lista = Arrays.asList(2,3,4,5,6);
        System.out.println(com.creaLlista(lista));
    }

    private static Comprobador creaComprobador(){
        Comprobador com = (p) -> {
            List<String> rslt = new ArrayList<>();
            for (int n : p){
                if ((double)n % 2 == 0){
                    rslt.add("e"+n);
                } else {
                    rslt.add("o"+n);
                }
            }
            return rslt;
        };
        return com;
    }
}
