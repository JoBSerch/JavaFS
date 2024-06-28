package com.Ifelse;

import java.util.Scanner;
public class Vowel_Consonant_UsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write Program to check Vowel or Consonant using switch-case
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet to check:");
		char Letter = sc.next().charAt(0);
				
		switch(Letter) {
		
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Given letter is vowel");
			break;
		default:
			System.out.println("Given letter is Consonant");
		}
		sc.close();
	}

}
