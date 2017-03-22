import spock.lang.Specification;

class Ques7Spec extends Specification {

    def sample;

    void setup() {
        sample = new Ques7();

    }

    void getlastName() {

        when:

        String result = Ques7.getLastname();
        println(Ques7.age);
        println(Ques7.firstname);

        then:
        result == "Sachdeva"

    }

}