abstract class Bank {
    abstract int[] printDetails(int a,int b);
}

class SBI extends Bank {

    int[] printDetails(int rateOfInterest,int creditDepositRatio) {

        int a[] = {rateOfInterest,creditDepositRatio};
        return a ;
    }
}

class BOI extends Bank {

    int[] printDetails(int rateOfInterest,int creditDepositRatio) {

        int a[] = {rateOfInterest,creditDepositRatio};
        return a ;
    }
}

class ICICI extends Bank {

    int[] printDetails(int rateOfInterest,int creditDepositRatio) {

        int a[] = {rateOfInterest,creditDepositRatio};
        return a ;
    }
}

