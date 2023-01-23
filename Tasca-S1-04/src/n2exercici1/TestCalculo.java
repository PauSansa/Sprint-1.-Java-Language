package n2exercici1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class TestCalculo {

    @ParameterizedTest
    @DisplayName("Test letra generada correctamente")
    @CsvSource({
            "41026611, Q ",
            "83946294, C",
            "80538312, V",
            "39068625, C",
            "76025583, A",
            "60266323, K",
            "46299762, A",
            "84527752, S"
    })
    public void testCalculos(int numero, String letra) {
        CalculoDni calculadora = new CalculoDni(numero);
        assertEquals(calculadora.getLletraDni(), letra);
    }

}





