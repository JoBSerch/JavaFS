package com.Ifelse;

import java.util.Scanner;
public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input");
		
		int input = sc.nextInt();
		
		if(input>100) {
			System.out.println("Number greater than 100");
		}
		else {
			System.out.println("Number less than 100");
		}

	}

}
