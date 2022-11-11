import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Program to find fibonacci series with recursive methods
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int terms = input.nextInt();
		for (int i = 1; i <= terms; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		input.close();


	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}
	
}
