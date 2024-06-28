package com.Ifelse;

import java.util.Scanner;
public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number:");
		
		int N = sc.nextInt();
		
		if (N%2 == 0) {
			System.out.println("The number "+N+" is Even");
		}
		else {
			System.out.println("The number "+N+" is Odd");
		}
		sc.close();

	}

}
