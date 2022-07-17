package circlecylinder;

public class TestCircle
{
    public static void main(String[] args)
    {
        //calling the default constructor
        Circle c1 = new Circle();
        System.out.println("Radius of the circle is:"+"  "+ c1.getRadius()+"  "+ "and Area of the Circle is:"+c1.getArea());

        //calling the parameterized constructor
        Circle c2 = new Circle(3.0);
        System.out.println("The radius of the circle is:"+c2.getRadius()+"  "+ "and the Area of the Circle is:"+c2.getArea());

    }
}
