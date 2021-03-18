package SHAPE;

public class Test {
  public static void main(String[]args){
    Shape s1 = new Rectangle("red",3,5);
    System.out.println(s1);
    System.out.println("Area is"+s1.getArea());
  }
}
