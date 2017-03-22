import spock.lang.Ignore
import spock.lang.IgnoreRest
import spock.lang.Specification;
import spock.lang.Unroll;
import java.util.ArrayList;

class Ques3Spec extends Specification {

    def sample;

    void setup() {
        sample = new Ques3();

    }

    void countOccurrences() {

        given:


        String str = "sargam sachdeva"
        String character = "a"
        when:

        int result = sample.countOccurrences(str,character) ;

        then:
        result == 4

    }

}