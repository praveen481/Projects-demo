package PersonStudentStaff;

public class TestStaff
{
    public static void main(String[] args)
    {
        Staff s1= new Staff();
        System.out.println("Staff="+ "name="+s1.getName()+"  "+"address="+s1.getAddress()+"  "+"school="+ s1.getSchool()+"  "+"pay="+s1.getPay());

        Staff s2= new Staff("lucas",100000.0);
        System.out.println("Staff="+ "name="+s2.getName()+"  "+"address="+s2.getAddress()+"  "+"school="+ s2.getSchool()+"  "+"pay="+s2.getPay());
    }


}
