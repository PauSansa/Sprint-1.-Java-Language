package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;




public class TestMesos {

    @Test
    public void testMesosSize() {
        InserirMesos inserirMesos = new InserirMesos();
        int r = inserirMesos.getMesos().size();
        assertEquals(r, 12);
    }

    @Test
    public void testMesosNotNull() {
        InserirMesos inserirMesos = new InserirMesos();
        assertNotNull(inserirMesos.getMesos());
    }

    @Test
    public void testMesos(){
        InserirMesos inserirMesos = new InserirMesos();
        String r = inserirMesos.getMesos().get(7);
        assertEquals(r, "Agost");
    }

}
