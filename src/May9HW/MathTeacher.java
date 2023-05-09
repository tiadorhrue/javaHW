package May9HW;

public class MathTeacher extends Teachers{
    public static void main(String[] args) {

        MathTeacher math=new MathTeacher();

        String teacherName=math.name="Asghar";
        String subject=math.subjectTaught="Math";
        int numStud=math.numOfStudents=14523;

        System.out.println(teacherName+" "+subject+" "+numStud);
        math.beginClass();
        math.dismissClass();

    }
}
