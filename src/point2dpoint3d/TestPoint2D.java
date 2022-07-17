package point2dpoint3d;

public class TestPoint2D
{
    public static void main(String[] args)
    {
        Point2D p1= new Point2D();
        System.out.println("Point2D:"+ "value of x="+p1.getX()+"  "+"value of y="+p1.getY()+"  "+"value of xy="+p1.getXY());

        Point2D p2= new Point2D(0.1f,0.2f,0.3f);
        System.out.println("Point2D:"+ "value of x="+p2.getX()+"  "+"value of y="+p2.getY()+"  "+"value of xy="+p2.getXY());
    }

}

