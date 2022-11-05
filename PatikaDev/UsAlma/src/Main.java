import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// The program that uses the "Recursive" method for exponentiation, whose base and exponent values ​​are taken from the user.
		Scanner scanner = new Scanner(System.in);
		int base, exponent;
		System.out.print("Enter the base: ");
		base = scanner.nextInt();
		System.out.print("Enter the exponent: ");
		exponent = scanner.nextInt();
		System.out.println("Result: " + Math.pow(base, exponent));
		
	}

}
