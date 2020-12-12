//Name: James Vega
//CSE 110: <Class #> / <meeting days and times>
//Assignment: Assignment04.java
//Author: James Vega  & <studentID>
//Description:  arithmetic operations based on 
//              the user’s input
//Flename: Assignment04.java

import java.util.Scanner;

public class Lab04
{
    public static void main(String[] args) 
{
        
        int userOption, userNumber, result; // Declares all necessary variables

        Scanner input = new Scanner(System.in);

        do {
            // Display the menu
            displayMenu();

            // Ask the user for one option
            userOption = input.nextInt();

            switch (userOption) {

                // Calculates and prints the sum of integers between 1 and the user inputted number
                // 4 = 4+3+2+1 = 10
				case 1:
                    System.out.println("Enter a number: ");
                    userNumber = input.nextInt();
                    // Initializes the result to 0
                    result = 0;
                    // Loops from the user inputted number down to 1 and adds to itself to find the sum of all integers
                    for (int i = userNumber; i > 0; i--){
                        result += i;
                    }
                    System.out.printf("The sum of 1 to %d is %d\n\n", userNumber, result);
                    break;

                // Calculates the factorial of the user inputted number
				// n! = 5! = 5*4*3*2*1 = 120 n!
                case 2:
                    System.out.println("Enter a number: ");
                    userNumber = input.nextInt();
                    // Initializes result to 1 so that zero is not multiplied into the calculation
                    result = 1;
                    // Loops from the user inputted number down to 1 and multiplies to itself to find the factorial
                    for (int i = userNumber; i > 0; i--){
                        result *= i;
                    }
                    System.out.printf("The factorial of %d is %d\n\n", userNumber, result);
                    break;

                // Finds the leftmost integer of the user inputted number
                // find 975421, leftmost is 9
				case 3:
                    System.out.println("Enter a number: ");
                    userNumber = input.nextInt();
                    // Stores userNumber into result so that original 
					//userNumber is not changed during calculation
                    result = userNumber;
                    // Keeps dividing the integer by 10 until it is in 
					//the range of [1, 9]
                    // The result is the leftmost digit
                    while (result > 9){
                        result /= 10;
                    }
                    System.out.printf("The leftmost digit of %d is %d%n%n",
					userNumber, result);
                    break;

                // Prints Bye if the user inputs 4 to quit
                case 4:
                    System.out.println("Bye");
                    break;
            }

        } while (userOption != 4); // End do while loop


    } // End main()

    //User menu display
    private static void displayMenu() 
	{
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
		
    } // End displayMenu()
} // End Lab4 class