package circlecylinder;

public class Cylinder extends Circle
{
    private double height;
    public Cylinder()
    {
        super();
        //radius and color will be automatically derived from the super class default constructor
          height=1.0;
    }
    // Constructor with default radius, color but given height
    public Cylinder(double height)
    {
        super();
        this.height=height;
    }
    //Constructor with default color, but given radius, height
    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height=height;
    }
    //method to retrieve the height
    public double getHeight()
    {
        return height;
    }
    //method to calculate volume
    public double getVolume()
    {
        return getArea()*height;
    }
    @Override
    public String toString()
    {
        return "Cylinder: subclass of "+ super.toString()+ "height="+ height;
    }

}
