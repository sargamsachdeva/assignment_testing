import spock.lang.Specification;

class Ques5Spec extends Specification {

    def sample;

    void setup() {
        sample = new Ques5();

    }

    void commonElements(){

        expect:

        sample.commonElements(a1,a2) == expectedResult 

        where:
                    a1 | a2 | expectedResult

                [3,2,1,4] as Integer[]| [3,7,2,6] as Integer[]| [3,2] as Set;
    }

}