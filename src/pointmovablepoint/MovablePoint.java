package pointmovablepoint;

public class MovablePoint extends Point
{
    float xSpeed;
    float ySpeed;

    public MovablePoint()
    {
        super();

    }
    public MovablePoint(float xSpeed, float ySpeed)
    {
       this.xSpeed= xSpeed;
       this.ySpeed=ySpeed;

       System.out.println("");
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "MovablePoint:";
    }
}
