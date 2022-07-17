package shapesquarerectanglesquare;

public class TestCircle
{
    public static void main(String[] args)
    {
        Circle c1= new Circle();
        System.out.println("Circle:"+"Color of String is:"+c1.getColor()+"  "+"value of filled is:"+c1.isFilled()+"  "+"radius is:"+c1.getRadius());

        Circle c2= new Circle("red",true,3.0);
        System.out.println("Circle:"+"Color of String is:"+c2.getColor()+"  "+"value of filled is:"+c2.isFilled()+"  "+"radius is:"+c2.getRadius());

    }
}
