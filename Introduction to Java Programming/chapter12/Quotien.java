package chapter12;

import java.util.Scanner;

public class Quotien {

	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
	}

}
