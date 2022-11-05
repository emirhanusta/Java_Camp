import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// It finds whether or not a number entered from the keyboard is a perfect number, and if the number is a perfect number, "it is a perfect number." if not, "it's not a perfect number." program that writes expressions to the screen
		Scanner scanner = new Scanner(System.in);
		int number, sum = 0;
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		for(int i = 1; i < number; i++) { 		// from 1 to the number entered
			if(number % i == 0) { 		// if the number is divisible by i
				sum += i; 		// add i to sum
			}
		}
		if(sum == number) { 		// if the sum of the numbers that divide the number is equal to the number
			System.out.println("It is a perfect number.");
		}
		else {
			System.out.println("It is not a perfect number.");
		}


	}

}
