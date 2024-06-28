package com.Ifelse;

import java.util.Scanner;
public class Positive_Negative_TernaryOperatora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To Determine positive / negative number using Terinary Operator

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int Num = sc.nextInt();
				
		String N = (Num>=0) ? "Positive" : "Negative";
		
		System.out.println(N);
		
		sc.close();
				

	}

}
