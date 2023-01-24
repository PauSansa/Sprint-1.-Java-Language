import n2exercici1.n2exercici1;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Testn2exercici1 {

    @Test
    public void testMain(){
        n2exercici1 Objeto = new n2exercici1();
        assertThat(Objeto.getLloc(),llargada(is(6)) );
    }

    public static Matcher<String> llargada(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "una String d'allargada", "llargada") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }

}
