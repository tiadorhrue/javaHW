package May9HW;

public class PianoTeacher extends Teachers{
    public static void main(String[] args) {

        PianoTeacher piano=new PianoTeacher();

        String teacherName=piano.name="Asel";
        char gender=piano.gender='F';
        int numStud=piano.numOfStudents=12334;

        System.out.println(teacherName+" "+gender+" "+numStud);
        piano.gradePapers();
        piano.writeOnChalkBoard();

    }
}
