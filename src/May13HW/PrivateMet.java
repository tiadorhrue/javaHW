package May13HW;

public class PrivateMet {
    private void subtract(int num,int num2){
        System.out.println(num-num2);
    }
    private void subtract(int num,double num2){
        System.out.println(num-num2);
    }
    private void subtract(double num,double num2){
        System.out.println(num-num2);
    }

    public static void main(String[] args) {
        PrivateMet obj=new PrivateMet();
        obj.subtract(30,20);
        obj.subtract(50,25.5);
        obj.subtract(345.5,665.8);
    }
}
