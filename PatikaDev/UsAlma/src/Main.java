import java.util.Scanner;

public class Main {
	
	public static int power(int base, int exponent) {
		if(exponent == 0) { 		// if the exponent is 0
			return 1; 		// return 1
		}
		else {
			return base * power(base, exponent - 1); 		// return the base multiplied by the power of the base and the exponent minus 1
		}
	}
	
	public static void main(String[] args) {
		// The program that uses the Recursive method for exponentiation, whose base and exponent values ​​are taken from the user.
		Scanner scanner = new Scanner(System.in);
		int base, exponent;
		System.out.print("Enter the base: ");
		base = scanner.nextInt();
		System.out.print("Enter the exponent: ");
		exponent = scanner.nextInt();


		
		System.out.println(power(base, exponent)); 		// print the power of the base and the exponent
	}

}
