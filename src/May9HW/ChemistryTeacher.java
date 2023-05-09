package May9HW;

public class ChemistryTeacher extends Teachers{
    public static void main(String[] args) {
        ChemistryTeacher chem=new ChemistryTeacher();

        String teacherName=chem.name="Moazzam";
        String subject=chem.subjectTaught="Chemistry";
        char gender=chem.gender='M';

        System.out.println(teacherName+" "+subject+" "+gender);
        chem.beginClass();
        chem.writeOnChalkBoard();


    }


}
