//Name: James Vega
//CSE 110: <Class #> / <meeting days and times>
//Assignment: Lab1
//Author: James Vega  & <1220953539>
//Description: The average of three numbers 
//File name: Lab1.java


import java.util.Scanner;

public class Lab1 
{
	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		// var
		double test1 = 0;
		double test2 = 0;  
		double test3 = 0;
		final double NUM_TESTS = 3;
		
		//User Input
		System.out.print("Please input first test score      :   ");
		test1 = keyboard.nextDouble();
		System.out.print("Your test 1 is " + test1);
		System.out.println(" ");
		
		System.out.print("Please input second test score:   ");
		test2 = keyboard.nextDouble();
		System.out.print("Your test 2 is " + test2);
		
		System.out.println(" ");		
		System.out.print("Please input third test score     :   ");
		test3 = keyboard.nextDouble();
		System.out.println("Your test 3 is " + test3);
		System.out.println(" ");
		
		//Average calculation
		
		double avg;
		avg = (test1 + test2 + test3) / NUM_TESTS;
		System.out.printf("Your avg is %.2f", avg);
		
	}
}