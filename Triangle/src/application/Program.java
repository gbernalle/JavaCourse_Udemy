package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    System.out.println("Enter the measueres of triangle x: ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("Enter the measueres of triangle y: ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    System.out.printf("Triangle X area: %.4f%n", x.area());
    System.out.printf("Triangle Y area: %.4f%n", y.area());

  }
}
