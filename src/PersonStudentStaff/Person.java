package PersonStudentStaff;

public class Person
{
    private String name;
    private String address;

    //default constructor
    public Person()
    {
        name="Durga";
        address="Hyd";
    }
    //parameterized constructor
    public Person(String n, String add)
    {
        name=n;
        address=add;
    }
    //getting the name
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
    public String toString()
    {
        return name;

    }
}
