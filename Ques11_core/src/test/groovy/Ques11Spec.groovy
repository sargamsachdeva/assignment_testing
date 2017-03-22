import spock.lang.IgnoreRest
import spock.lang.Specification;

class Ques11Spec extends Specification {

    def sample;

    void setup() {
        sample = new Ques11();

    }

    void calcSum(){

        expect:
        sample.sum(a,b) == expectedResult

        where:
        a | b | expectedResult

         2 | 2 | 4
        2.2 | 2.3 | 4.5
    }

    void calcMultiply(){

        expect:
        sample.multiply(a,b) == expectedResult

        where:
        a | b | expectedResult

        2 | 12 | 24
        1.2 | 1.2 | 1.44
    }

    void concatString(){

        expect:
        sample.concat(a,b) == expectedResult

        where:
        a | b | expectedResult

        "sargam" | "hello" |  "sargamhello"


    }

    void concat(){

        expect:
        sample.concat(a,b,c) == expectedResult

        where:
        a | b | c |expectedResult

        "sargam" | "hello" |"abc" | "sargamhelloabc"

    }
}