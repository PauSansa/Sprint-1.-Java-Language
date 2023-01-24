import n2exercici1.n2exercici1;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestMain {

    @Test
    public void testMain(){
        n2exercici1 Objeto = new n2exercici1();
        assertThat(Objeto.getNom(),llargada(is(3)) );
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
