package April23HW;

public class symbolsInString {

    public static void main(String[] args) {

        String name="String123";

        if(!name.isEmpty()){
            if(name.length()%2!=0 && name.length()>=3){
                System.out.print(name.substring(0,3));
                System.out.print(name.substring(6,9));
                System.out.print(name.substring(3,6));
            }

        }


    }
}
