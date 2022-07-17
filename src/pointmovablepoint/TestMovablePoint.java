package pointmovablepoint;

public class TestMovablePoint
{
    public static void main(String[] args)
    {
        MovablePoint mp1= new MovablePoint();
        System.out.println("TestMovablePoint:"+"Value of x="+mp1.getX()+"  "+"value of y="+mp1.getY()+"  "+"value of xSpeed="+mp1.getxSpeed()+"  "+"value of ySpeed="+mp1.ySpeed);
        MovablePoint mp2= new MovablePoint(0.7f,0.8f);
        System.out.println("TestMovablePoint:"+"Value of x="+mp2.getX()+"  "+"value of y="+mp2.getY()+"  "+"value of xSpeed="+mp2.getxSpeed()+"  "+"value of ySpeed="+mp2.ySpeed);
    }
}
