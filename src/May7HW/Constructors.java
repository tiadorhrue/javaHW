package May7HW;

public class Constructors {
    String name;
    int age;
    int weight;
    String color;
    String height;

    void printInfo(){
        System.out.println(name+" "+age+" "+weight+" "+color+" "+height);
    }

    Constructors( String name, int age, int weight, String color, String height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
        this.height=height;

    }
    private Constructors( String name, int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color="Brown";
        this.height="3'4";



    }
    public Constructors( String name, int age, int weight, String height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color="Black";
        this.height=height;

    }

    public static void main(String[] args) {
        Constructors cons=new Constructors("Maxie",2,12);
        cons.printInfo();
    }

}

