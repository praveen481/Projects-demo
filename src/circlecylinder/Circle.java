package circlecylinder;

public class Circle
{
    private double radius;
    private String color;

    //default constructor
    public Circle()
    {
        radius=1.0;
        color="red";
    }
    //overloaded parameterized constructor
    public Circle(double r)
    {
        radius='r';
        color="red";
    }
    //returns the radius
    public double getRadius() {
        return radius;
    }

    //returns the Area
    public double getArea()
    {
        return radius*radius*Math.PI;
    }

    public String toString()
    {
        return "Circle:  subclass of "+ super.toString()+ "radius="+radius;
    }

}
