import spock.lang.Specification;

class BankSpec extends Specification {

    Bank b;
    def a;

    void setup() {
         b = new SBI();
         b= new BOI();
         b=new ICICI();
    }

    void printDetailsSBI() {

        given:
        int rateOfInterest=7;
        int creditDepositRatio=6;

        when:

        a = b.printDetails(rateOfInterest,creditDepositRatio);

        then:
        a == [7,6];

    }

    void printDetailsBOI() {

        given:
        int rateOfInterest=11;
        int creditDepositRatio=2;

        when:

        a = b.printDetails(rateOfInterest,creditDepositRatio);

        then:
        a == [11,2];

    }

    void printDetailsICICI() {

        given:
        int rateOfInterest=4;
        int creditDepositRatio=6;

        when:

        a = b.printDetails(rateOfInterest,creditDepositRatio);

        then:
        a == [4,6];

    }
}