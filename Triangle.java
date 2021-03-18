package SHAPE;

public class Triangle extends Shape{
  private int base,height;
  //constructor
  public Triangle(String color,int base,int height){
    super(color);
    this.base =base;
    this.height =height;
  }

  @Override
  public double getArea() {
    return base*height;
  }
  @Override
  public String toString(){
    return "Triangle["+base+","+height+","+super.toString()+"]";
  }
}
