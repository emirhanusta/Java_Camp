import java.util.Scanner;

public class Main {
	public static boolean isPrime(int number, int i) { 		// Recursive method for finding prime numbers
		if (number <= 2) {
			return (number == 2) ? true : false;
		}
		if (number % i == 0) {
			return false;
		}
		if (i * i > number) {
			return true;
		}
		return isPrime(number, i + 1);
	}

	public static void main(String[] args) {
		// Program that finds whether the number received from the user is a "Prime" number by using the "Recursive" method.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		if (isPrime(number, 2)) { 		// if the number is prime
			System.out.println(number + " is a prime number.");
		} else { 		// if the number is not prime
			System.out.println(number + " is not a prime number.");
		}


	}

}
