package May13HW;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard cd=new CreditCard();
        cd.interest=1.9;
        cd.balance=600.97;
        cd.calcInterest();

        Visa visa=new Visa();
        visa.interest=1.2;
        visa.balance=100.55;
        visa.calcInterest();

        AX amex=new AX();
        amex.interest=3;
        amex.balance=600;
        amex.calcInterest();
    }
}
