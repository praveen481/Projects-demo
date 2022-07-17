package PersonStudentStaff;

public class TestStudent
{
    public static void main(String[] args)
    {
        Student s1= new Student();
        System.out.println("Student:"+"name="+s1.getName()+"  "+"address="+s1.getAddress()+"  "+"program="+s1.getProgram()+"  "+"year="+s1.getYear()+"  "+"fee="+s1.getFee());
        Student s2= new Student("ece",2000,10000.0);
        System.out.println("Student:"+"name="+s2.getName()+"  "+"address="+s2.getAddress()+"  "+"program="+s2.getProgram()+"  "+"year="+s2.getYear()+"  "+"fee="+s2.getFee());
    }
}
