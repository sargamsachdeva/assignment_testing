import spock.lang.Specification;

class Ques8Spec extends Specification {

    def sample;

    void setup() {
        sample = new Ques8();

    }

    void reverseAndRemove() {

        given:

        String str = "sargam sachdeva"

        when:

        String result = sample.reverseAndRemove(str) ;

        then:

        result == "avedmagras"

    }

}