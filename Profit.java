package Profit;

/*
 * This program calculates the profit by subtracting the entered expenses values from the revenue initialized value.
 */

import java.util.ArrayList; // Add ArrayList class to the program.
import java.util.Scanner; // Add the Scanner class to the program.

public class Profit {
	
	static double revenue = 7000.0, monthExpenses, profit; // Static variables.
	
	public static void main(String[] args) {
		
		
		Scanner amount = new Scanner(System.in); // Create the Scanner.
		
		// Create a variable of type Arraylist that takes values of primitive types.
		ArrayList<Double> totalExpenses = new ArrayList<Double>(); // Autoboxing.
		
		System.out.print("Please enter the current month's expenses. When done, please enter 0\n");
		
		while (true) {
			System.out.print("Month Expenses: ");
			monthExpenses = amount.nextDouble();
			if (monthExpenses == 0) {
				break;
			}
			totalExpenses.add(monthExpenses); // Add values of the primitive type double.
		}
		
		double sumExpenses = 0;
		for ( double i : totalExpenses ) {
		sumExpenses = sumExpenses + i; // Unboxing.
		profit = revenue - sumExpenses;
		}
		
		System.out.printf("The profit: $%.2f%n", profit);
	}
}
