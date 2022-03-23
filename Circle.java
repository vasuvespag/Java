package test;

import java.util.Scanner;

public class Circle {
	static double radius;
	static final double PI = 3.14;
	
	public double calculateArea(double radius)
	{
		return (PI*radius*radius);
	}

	public double calculatePerimeter(double radius)
	{
		return(2*PI*radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		System.out.println("Enter the radius of the circle");
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		System.out.println("The area of the circle is "+circle.calculateArea(radius));
		System.out.println("The perimeter of the circle is "+circle.calculatePerimeter(radius));

	}

}
