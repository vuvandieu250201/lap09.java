package SHAPE;

public class Rectangle extends Shape{
  private int length,width;
  //construcstor
  public Rectangle( String color,int length,int width){
    super(color);
    this.length =length;
    this.width = width;
  }
  @Override
  public String toString(){
    return "Rectangle[="+length+","+width+super.toString()+"]";
  }
  @Override
  public double getArea(){
     return length*width;
  }
}
