package n3exercici1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class n3exercici1 {
    private int numero;
    private ArrayList<Integer> arrayInt;
    private List<Object> listaObjetos = new ArrayList<>();
    private HashMap<String, Integer> hashMap = new HashMap<>();

    public n3exercici1() {

    }

    public n3exercici1(HashMap<String, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    public n3exercici1(int numero) {
        this.numero = numero;

    }

    public n3exercici1(ArrayList<Integer> arrayInt) {
        this.arrayInt = arrayInt;
    }

    public void tirarExcepcio(int num) throws ArrayIndexOutOfBoundsException{
        if (num > 2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void introdueixLlistaObjectes(Object objeto) {
        listaObjetos.add(objeto);
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Integer> getArrayInt() {
        return arrayInt;
    }

    public List<Object> getListaObjetos() {
        return listaObjetos;
    }

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }
}
