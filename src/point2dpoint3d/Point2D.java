package point2dpoint3d;

public class Point2D
{
    public float x;
    public float y;
    public float xy;

    public Point2D()
    {
        x=0.1f;
        y=0.2f;
        xy=0.3f;
    }
    public Point2D(float x, float y, float xy)
    {
        this.x=x;
        this.y=y;
        this.xy=xy;
    }

    public float getX()
    {
        return x;
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public float getY()
    {
        return y;
    }

    public void setY(float y)
    {
        this.y = y;
    }
    public float getXY()
    {
        return xy;
    }

    public void setXY(float xy)
    {
        this.xy = xy;
    }
    public String toString()
    {
        return "Point2D:";
    }
}
