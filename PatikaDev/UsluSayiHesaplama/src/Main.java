import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// program that calculates exponential numbers with the values ​​entered by the user

		Scanner input = new Scanner(System.in); 		// create Scanner object
		System.out.println("Enter the base number: ");
		int base = input.nextInt();
		System.out.println("Enter the exponent number: ");
		int exponent = input.nextInt();
		int result = 1;
		for (int i = 1; i <= exponent; i++) { 		// calculate the exponential number
			result *= base;	
		}
		System.out.println(base + " to the power of " + exponent + " is " + result);
		input.close();

	}

}
