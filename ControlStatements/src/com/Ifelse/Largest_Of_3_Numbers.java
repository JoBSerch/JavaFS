package com.Ifelse;

import java.util.Scanner;
public class Largest_Of_3_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find largest number among three numbers using nested if
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of X:");
		int X = sc.nextInt();
		
		System.out.println("Enter the Value of Y:");
		int Y = sc.nextInt();
		
		System.out.println("Enter the Value of Z:");
		int Z = sc.nextInt();
		
		if(X > Y) {
			if(X > Z) {
				System.out.println("X is the largest of the given numbers");
			}
			else {
				System.out.println("Z is the largest of the given numbers");
			}
		}
		else if(Y > Z) {
			System.out.println("Y is the largest of the given numbers");
			}
		else {
			System.out.println("Z is the largest of the given numbers");
		}
		sc.close();
		}
}
