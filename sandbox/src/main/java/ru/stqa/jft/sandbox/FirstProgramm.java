package ru.stqa.jft.sandbox;
public class FirstProgramm {

  public static void main(String[] agrs) {
    Point p1 = new Point(9, 10);
    Point p2 = new Point(0, 16);

      System.out.println("расстояние между точками: " + distance(p1, p2));
      System.out.println("расстояние между точками: " + p1.distance(p2.x, p2.y));

    /*
    hello("java");
    Square s = new Square(5);
    System.out.println("площадь квадрата со стороной " + s.l + " = " + s.area());
    Rectangle r = new Rectangle(3, 7 );
    System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area() );
    */

  }

    public static double distance(Point p1, Point p2){
        return Math.sqrt( Math.pow(p2.x - p1.x, 2) +Math.pow(p2.y - p1.y, 2));
    }
/*
  public static void hello(String somebody){
   System.out.println("hello, " + somebody + "!");
    }
*/


  }