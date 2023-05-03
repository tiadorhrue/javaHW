package May3HW;

public class Students {

    static int numberOfStudents;
    String name;
    String studentID;

    public static void main(String[] args) {
        Students stud=new Students();

        stud.name = "Tiadorh";
        stud.studentID = "12345678A";
        numberOfStudents++;

        stud.name="Olivier";
        stud.studentID = "12345678B";
        numberOfStudents++;

        stud.name="Ariela";
        stud.studentID = "12345678C";
        numberOfStudents++;

        System.out.println("The number of students is "+numberOfStudents);






    }
}
