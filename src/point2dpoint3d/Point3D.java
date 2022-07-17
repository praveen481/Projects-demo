package point2dpoint3d;

public class Point3D extends Point2D
{
      float z;

      public Point3D()
      {
         super();
         z=0.3f;

      }
      public Point3D(float z)
      {
         super();
         this.z=z;
      }

   public float getZ()
   {
      return z;
   }

   public void setZ(float z)
   {
      this.z = z;
   }
   @Override
   public String toString()
   {
       return "Point3D:";
   }
}
