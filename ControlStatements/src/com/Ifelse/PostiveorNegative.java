package com.Ifelse;

import java.util.Scanner;
public class PostiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* To Determine positive / negative number using if else statement
To Determine number of digits of given number using if-else-if ladder
Find largest number among three numbers using nested if
Print Day of week using switch-case statement
Write Program to check Vowel or Consonant using switch-case */

     Scanner sc = new Scanner(System.in);
		
     System.out.println("Enter the number:");
     int Num = sc.nextInt();
     
     if(Num >= 0) {
    	 System.out.println("The given number "+Num+" is positive");
     }
     /*else if(Num == 0){
    	 System.out.println("The given number "+Num+" is equal to zero");
     }*/
     else {
    	 System.out.println("The given number "+Num+" is Negative");	 
     }
     sc.close();
	}

}
