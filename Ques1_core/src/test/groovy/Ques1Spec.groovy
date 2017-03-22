import spock.lang.Ignore
import spock.lang.IgnoreRest
import spock.lang.Specification;
import spock.lang.Unroll;
import java.util.ArrayList;

class Ques1Spec extends Specification {

    def sample;

    void setup() {
        sample = new Ques1();

    }

    void replaceSubstring() {

        given:


        String str = "sargam"
        String substr = "ar"
        String replaceString="dd"

        when:

        String result = sample.replaceSubstring(str,substr,replaceString) ;

        then:
        result == "sddgam"

    }

   @Ignore
    void errorSubstring() {

        given:

        String str = "sargam"
        String substr = "z"
        String replaceString="j"

        when:

        sample.replaceSubstring(str,substr,replaceString) ;

        then:
        thrown(StringIndexOutOfBoundsException)
    }
}