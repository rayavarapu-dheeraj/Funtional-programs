package com.bridgelabz.funtionalprograming;

import java.util.Scanner;

public class Quadratic {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("enter 3 integers to form a equation of type ax^2+bx+c=0: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("the equation is "+a+"x^2 + "+b+"x +"+c);
		double delta = Math.pow(b,2)-4*a*c;
		double root1=(-b+Math.sqrt(delta))/(2*a);
		double root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("the roots of the above given equation are :"+root1 +"\t "+root2);
	}

}