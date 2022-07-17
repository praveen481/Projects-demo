package PersonStudentStaff;

public class Student extends Person
{
    String program;
    int year;
    double fee;
    public Student()
    {
        super();
        year=2000;
        fee=10000.0;
        program= "Ece";
    }
    public Student(String program, int year, double fee)
    {
        super();
        this.program=program;
        this.year=year;
        this.fee=fee;
    }

    public String getProgram()
    {
        return program;
    }

    public void setProgram(String program)
    {
        this.program = program;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public double getFee()
    {
        return fee;
    }

    public void setFee(double fee)
    {
        this.fee = fee;
    }
    @Override
    public String toString()
    {
        return "Student: ";
    }
}
