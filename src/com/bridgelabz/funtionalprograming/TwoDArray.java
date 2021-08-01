package com.bridgelabz.funtionalprograming;

import java.util.Scanner;

public class TwoDArray {
	static Scanner sc =new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("Enter Row length of an array : ");
		int row=sc.nextInt();
		System.out.println("Enter column length of an array : ");
		int column=sc.nextInt();
		int a[][]=new int[row][column];   	 
		System.out.println("Enter " + row*column + " Elements to Store in Array :");
	        for (int i = 0; i < row; i++)
		{
		    for(int j = 0; j < column; j++)
		    {
	           	a[i][j] = sc.nextInt();
		    }
		}   
	        System.out.println("Elements in Array are :");
	        for (int i = 0; i < row; i++)
		{
		    for(int j = 0; j < column; j++)
		    {
		       System.out.println("Row ["+i+"]:  Column ["+j+"] :"+a[i][j]);
		}
		}
	}
}
	


