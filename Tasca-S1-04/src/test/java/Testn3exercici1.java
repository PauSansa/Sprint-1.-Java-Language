import org.junit.jupiter.api.Test;
import n3exercici1.n3exercici1;
import n3exercici1.ObjecteMutable;
import n3exercici1.ObjecteMutable2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

public class Testn3exercici1 {

    //Exercici 1
    @Test
    public void comprobarDosIntsIguals() {
        n3exercici1 obj1 = new n3exercici1(5);
        n3exercici1 obj2 = new n3exercici1(5);
        assertThat(obj1.getNumero()).isEqualTo(obj2.getNumero());
    }

    @Test
    public void comprobarDosIntsDiferents() {
        n3exercici1 obj1 = new n3exercici1(3);
        n3exercici1 obj2 = new n3exercici1(5);
        assertThat(obj1.getNumero()).isNotEqualTo(obj2.getNumero());
    }


    //Exercici 2
    @Test
    public void comprobarReferenciaIgual() {
        n3exercici1 obj1 = new n3exercici1(3);
        n3exercici1 obj2 = obj1;
        assertThat(obj1).isEqualTo(obj2);
    }

    @Test
    public void comprobarReferenciaDiferent() {
        n3exercici1 obj1 = new n3exercici1(3);
        n3exercici1 obj2 = new n3exercici1(3);
        assertThat(obj1).isNotEqualTo(obj2);
    }

    //Exerici 3
    @Test
    public void comprobarArraysIguals() {
        n3exercici1 obj1 = new n3exercici1(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        n3exercici1 obj2 = new n3exercici1(new ArrayList<Integer>(Arrays.asList(1,2,3)));

        assertThat(obj1.getArrayInt()).isEqualTo(obj2.getArrayInt());
    }

    @Test
    public void comprobarArraysDiferents() {
        n3exercici1 obj1 = new n3exercici1(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        n3exercici1 obj2 = new n3exercici1(new ArrayList<Integer>(Arrays.asList(1,6,3)));

        assertThat(obj1.getArrayInt()).isNotEqualTo(obj2.getArrayInt());
    }


    //Exercici 4
    @Test
    public void comprobaLlistaObjetos() {
        n3exercici1 obj = new n3exercici1();
        Object obj1 = new ObjecteMutable(3);
        Object obj2 = new ObjecteMutable2("Texto");

        obj.introdueixLlistaObjectes(obj1);
        obj.introdueixLlistaObjectes(obj2);

        assertThat(obj.getListaObjetos()).containsExactly(obj1, obj2);
        assertThat(obj.getListaObjetos()).contains(obj1, obj2);
    }

    //Exercici 5
    @Test
    public void comprobaKeyHashmap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Un", 1);
        hashMap.put("Dos", 2);

        n3exercici1 obj = new n3exercici1(hashMap);
        assertThat(obj.getHashMap()).containsKey("Un");
    }


    //Exercici 6
    @Test
    public void comprobaExcepcioLLançada() {
        n3exercici1 obj = new n3exercici1();
        try {
            obj.tirarExcepcio(7);
            failBecauseExceptionWasNotThrown(IndexOutOfBoundsException.class);
        } catch (IndexOutOfBoundsException e) {}

    }

    //Exercici 7
    @Test
    public void comprobaObjecteBuit() {
        n3exercici1 obj = null;
        assertThat(obj).isNull();
    }

}
