package May13HW;

public class CreditCard {
    double balance;
    double interest;

    void calcInterest(){
        System.out.println(balance*interest);
    }

}
class Visa extends CreditCard{


}
class AX extends CreditCard{
    @Override
    void calcInterest() {
        System.out.println(balance*interest*2);
    }
}
