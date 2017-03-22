import spock.lang.Ignore
import spock.lang.IgnoreRest
import spock.lang.Specification;
import spock.lang.Unroll;
import java.util.ArrayList;

class Ques1Spec extends Specification {

    def sample;

    void setup() {
        sample = new Ques2();

    }

    void findDuplicateWords() {

        given:


        String str = "sargam"

        when:

        String result = sample.findDuplicateWords(str) ;

        then:
        result == "a"

    }

}