import spock.lang.Specification;

class Ques9Spec extends Specification {

    def sample;

    void setup() {
        sample = new Ques9();

    }

    void printContent() {

        given:

        BufferedReader reader = new BufferedReader(new FileReader ("src/abc.txt"));
        when:

        String res = sample.printContentOfFile(reader);

        then:

        res == "11 hello" + "\n" +"sargam";
    }

}