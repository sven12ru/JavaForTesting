package ru.stqa.jft.sandbox;

public class FirstProgramm {

  public static void main(String[] agrs) {
    hello("world");
    hello("java");
    hello("kia");

    Square s = new Square(5);
    System.out.println("площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(3, 7 );
    System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area() );
  }
  public static void hello(String somebody){
   System.out.println("hello, " + somebody + "!");
  }





}