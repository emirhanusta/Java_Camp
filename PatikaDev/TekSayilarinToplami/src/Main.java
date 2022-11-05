import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// program that accepts inputs from the user until a single number is entered with loops and collects even and multiples of 4 from the entered values ​​and prints it on the screen
		Scanner scanner = new Scanner(System.in);
		int number, sum = 0, count = 0;
		do { 
			System.out.print("Enter a number: ");
			number = scanner.nextInt();
			if(number % 2 == 0 && number % 4 == 0) {	// even and multiples of 4
				sum += number;
			}
		} while(number % 2 == 0);	// loop until a single number is entered
		System.out.println("Sum: "+ sum ); 	// sum of even and multiples of 4


	}

}
