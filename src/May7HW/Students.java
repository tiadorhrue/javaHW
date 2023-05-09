package May7HW;

public class Students {

    String name;
    int historyGrade;
    int mathGrade;
    int scienceGrade;

    void average(){
        System.out.println((historyGrade+mathGrade+scienceGrade)/3);
    }

    Students( String name, int historyGrade, int mathGrade, int scienceGrade){
        this.name=name;
        this.historyGrade=historyGrade;
        this.mathGrade=mathGrade;
        this.scienceGrade=scienceGrade;
    }

    public static void main(String[] args) {
        Students stud=new Students("Tiadorh",90,100,98);
        stud.average();
        Students stud2=new Students("Luis",92,105,80);
        stud2.average();
        Students stud3=new Students("Olivier",96,30,70);
        stud3.average();
        Students stud4=new Students("Ariela",60,100,100);
        stud4.average();
        Students stud5=new Students("Valeria",75,75,99);
        stud5.average();

        Constructors cons=new Constructors("Saph",2,14,"Grey","2'3");
        cons.printInfo();


    }

}
