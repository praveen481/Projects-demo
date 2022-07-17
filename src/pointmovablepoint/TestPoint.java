package pointmovablepoint;

public class TestPoint
{
    public static void main(String[] args)
    {
        Point tp1= new Point();
        System.out.println("TestPoint:"+"Value of x="+tp1.getX()+"  "+"Value of y="+tp1.getY());
        Point tp2= new Point(0.3f,0.4f);
        System.out.println("TestPoint:"+"Value of x="+tp2.getX()+"  "+"Value of y="+tp2.getY());
    }
}
