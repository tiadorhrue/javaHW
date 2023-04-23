package April23HW;

import java.util.Scanner;

public class whatAreYouExpecting {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the mom's name?");
        String momName= scanner.nextLine();
        System.out.println("What is the dad's name?");
        String dadName= scanner.nextLine();
        System.out.println("What is the gender");
        String expectingA= scanner.next();



        if(expectingA.contentEquals("Boy")){
            System.out.println("What is mom's name? "+momName.substring(0,4));
            System.out.println("What is dad's name? "+dadName.substring(0,3));
            System.out.println("What are you expecting? "+expectingA);
            System.out.println("Suggested name is BOB");
        }else if (expectingA.contentEquals("Girl")){
            System.out.println("What is mom's name? "+momName.substring(0,4));
            System.out.println("What is dad's name? "+dadName.substring(0,3));
            System.out.println("What are you expecting? "+expectingA);
            System.out.println("Suggested name is LILLY");


        }




    }
}
