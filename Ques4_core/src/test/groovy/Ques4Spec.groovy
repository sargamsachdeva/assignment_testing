import spock.lang.Specification;

class Ques4Spec extends Specification {

    def sample;

    void setup() {
        sample = new Ques4();

    }

    void countLetters(){

        expect:
        sample.countLetters(str) == expectedResult

        where:
        str | expectedResult
        "saRGam++ sa51}" | [2,6,2,4]
    }

}