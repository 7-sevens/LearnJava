package chapter2;

import java.util.Scanner;

public class FahrenheitToCelsius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		// Convert Fahrenheit to Celsius
		double celsius = (0.5 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	}
}
