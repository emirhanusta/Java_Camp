import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Program to calculate the sum of digits of a number
		Scanner input = new Scanner(System.in); 		// create Scanner object
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int sum = 0;
		while (number > 0) { 		// while number is greater than 0
			sum += number % 10; 		// add the last digit to sum
			number /= 10; 		// remove the last digit from number
		}
		System.out.println("The sum of digits is: " + sum); 		// display result
		input.close();
	}

}
