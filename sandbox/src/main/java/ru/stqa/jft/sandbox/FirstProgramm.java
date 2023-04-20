package ru.stqa.jft.sandbox;

public class FirstProgramm {

  public static void main(String[] agrs) {
    hello("world");
    hello("java");
    hello("kia");

    Square s = new Square(5);
    System.out.println("площадь квадрата со стороной " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(3, 7 );
    System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r) );
  }
  public static void hello(String somebody){
   System.out.println("hello, " + somebody + "!");
  }

  public static double area(Square s){
    return s.l * s.l;
  }
  public static double area(Rectangle r){
    return r.a * r.b;
  }


}