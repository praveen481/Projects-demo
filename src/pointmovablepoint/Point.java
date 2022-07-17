package pointmovablepoint;

public class Point
{
    float x;
    float y;

    public Point()
    {
        x=0.1f;
        y=0.2f;
    }
    public Point(float x, float y)
    {
        this.x=0.3f;
        this.y=0.4f;
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
    public String toString()
    {
        return "Point:" ;
    }
}
