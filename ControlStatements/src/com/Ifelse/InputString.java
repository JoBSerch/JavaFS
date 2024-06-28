package com.Ifelse;

import java.util.Scanner;
public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input text");
		String userInput = sc.nextLine();
		
		if(userInput.equals("java") || (userInput.equals("JAVA")) || (userInput.equals("Java")) || (userInput.equals("JaVa"))) {
			System.out.println("YeS");
				}
		else {
			System.out.println("No");
		}
		sc.close();	

	}

}
