package n1exercici3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodoFallar {
    private String[] listaAFallar;

    public MetodoFallar(int num) {
        if (num > 5) {
            throw new IndexOutOfBoundsException();
        }
    }
}
