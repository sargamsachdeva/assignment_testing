import spock.lang.Specification;

class Ques6Spec extends Specification {

    def sample;
    def a;

    void setup() {
        sample = new Ques6();

    }

    void oddOne() {

        expect:

        sample.oddOne(a1) == expectedResult

        where:
        a1 | expectedResult

        [3,2,2,1,3] as int[] | 1;
    }

}