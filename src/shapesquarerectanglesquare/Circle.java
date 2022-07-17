package shapesquarerectanglesquare;

public class Circle extends Shape
{
    double radius;
    Circle()
    {
        super();
        radius=1.0;
    }
    Circle(String color, boolean filled, double radius)
    {
        super("Red",true);
        this.color=color;
        this.filled=filled;
        this.radius= radius;
    }
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

}

