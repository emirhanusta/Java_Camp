import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// The program that draws the number of digits from the user and draws an inverted triangle to the screen with asterisks (*)
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		for(int i = number; i > 0; i--) { 		// from the number entered to 0
			for(int j = 0; j < i; j++) { 		// from 0 to i
				System.out.print("*"); 		// print *
			}
			System.out.println(); 		// print a new line
		}

	}

}
