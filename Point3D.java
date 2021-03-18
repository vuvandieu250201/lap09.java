package Point;

public class Point3D extends Point2D{
  private int z;
  //contructor
  //default
  public Point3D(){
  super();
  this.z = 0;
  }
  //contrucstor 3D
  public Point3D(int x,int y,int z){
    super(x,y);
    this.z =z;
  }
  // getter and setter
  public int getZ(){
    return this.z;
  }
  public void setZ(int z){
    this.z = z;
  }
  @Override
  public String toString(){
    return "("+ super.getX()+","+super.getY()+","+this.z+")";
  }
}
