package PersonStudentStaff;

public class TestPerson
{
    public static void main(String[] args)
    {
        Person p1= new Person();
        System.out.println("Name of the person is:"+ p1.getName()+"  "+ "and address of the person is:"+p1.getAddress());
        Person p2= new Person("Durga", "Hyd");
        System.out.println("Name of the person is:"+ p2.getName()+"  "+ "and address of the person is:"+p2.getAddress());
    }
}
