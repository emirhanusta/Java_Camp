import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// program to find the harmonic series of the entered number
		Scanner input = new Scanner(System.in); // create Scanner object
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		double sum = 0;
		for (int i = 1; i <= number; i++) { // calculate harmonic series
			sum += 1.0 / i;
		}
		System.out.println("The harmonic series of " + number + " is: " + sum); // display result
		input.close();

	}

}
