package May13HW;

public class Programming {

    String language;
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String language){
        this.language=language;
        System.out.println("I love "+language);
    }

    public static void main(String[] args) {
        Programming pro=new Programming();
        Programming prog=new Programming("Java");
    }
}
