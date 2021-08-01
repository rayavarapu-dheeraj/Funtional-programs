package com.bridgelabz.funtionalprograming;

import java.util.Scanner;

public class EuclideanDistance {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter two numbers to find the distance between them and origin :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("the distance from origin to "+ "( "+x+" , "+y+" ) is :"+distance);
		
	}

}
