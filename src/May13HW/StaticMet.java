package May13HW;

public class StaticMet {

    static void multiply(int num,int num2){
        System.out.println(num*num2);
    }
    static void multiply (int num,double num2){
        System.out.println(num*num2);
    }
    static void multiply (double num,double num2){
        System.out.println(num*num2);
    }

    public static void main(String[] args) {
        multiply(13.5,123.5);
        multiply(5,10);
        multiply(10,56.7);

    }
}
