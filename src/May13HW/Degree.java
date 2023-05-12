package May13HW;

public class Degree {

    void getPrerequisites() {
        System.out.println("To get a degree you need high school diploma");
    }

}
class Bachelors extends Degree{

}
class Masters extends Degree {
    @Override
    void getPrerequisites() {
        System.out.println("To get a degree you need a Bachelor's degree ");
    }

}



