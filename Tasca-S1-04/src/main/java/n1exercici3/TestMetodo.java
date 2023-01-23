package n1exercici3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class TestMetodo {

    @Test
    public void testExcepcion() {
        try {
            MetodoFallar metodoFallar = new MetodoFallar(6);
            fail();
        } catch (IndexOutOfBoundsException e) {

        }


    }
}
