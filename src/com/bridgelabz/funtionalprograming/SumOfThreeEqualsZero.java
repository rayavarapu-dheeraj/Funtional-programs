package com.bridgelabz.funtionalprograming;

import java.util.Scanner;

public class SumOfThreeEqualsZero {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("enter the length of the array: ");
		int length = sc.nextInt();
		int[] Array = new int[length];
		System.out.println("enter " + length + " elements into the array: ");
		for (int i = 0; i < length; i++) {
			Array[i] = sc.nextInt();
		}
		for (int i = 0; i < Array.length; i++) {
			for (int j = i + 1; j < Array.length; j++) {
				for (int k = j + 1; k < Array.length; k++) {
					if (Array[i] + Array[j] + Array[k] == 0) {
						System.out.println("Numbers found : " + Array[i] + "," + Array[j] + " and " + Array[k]);
					}
				}
			}
		}
	}
}
