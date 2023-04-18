package ru.stqa.jft.sandbox;

public class Point {

  public static void main(String[] agrs) {
    hello("world");
    hello("java");
    hello("kia");

    double l = 5;
    System.out.println("площадь квадрата со стороной " + l + " = " + area(l));
    double a = 6;
    double b = 8;
    System.out.println("площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b) );
  }
  public static void hello(String somebody){
   System.out.println("hello, " + somebody + "!");
  }

  public static double area(double len){
    return len * len;
  }
  public static double area(double a, double b){
    return a * b;
  }


}