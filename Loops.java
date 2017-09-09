/****
 * File: Loops.java
 * Date: September 8, 2017
 * Purpose: Use of for loop that outputs common Foobar interview question
 ****/

package discussions;

// Import required libraries
import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		// Initialize variables
		int amount = 0;
		Scanner scannerIn = new Scanner(System.in);
		
		// Prompt for number to reiterate
		System.out.println("Enter the amount to reiterate: ");
		amount = scannerIn.nextInt();
		
		// For loop to print info		
		for (int i = 1;i < amount; i++) {
			if (i % 15 == 0) {
				System.out.println("FooBar");
			} else if (i % 3 == 0) {
				System.out.println("Bar");
			} else if (i % 5 == 0) {
				System.out.println("Foo");
			} else {
				System.out.println(String.valueOf(i));
			} 
		}
	}
}
