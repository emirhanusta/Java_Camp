import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// The program that calculates the EBOB and LCC values ​​of two numbers using "While Loop"
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = input.nextInt();
		int i = 1;
		int ebob = 1;
		while (i <= number1 && i <= number2) { 		// find the EBOB
			if (number1 % i == 0 && number2 % i == 0) { 		// if the number is divisible by both numbers
				ebob = i;
			}
			i++;
		}	
		System.out.println("The EBOB of " + number1 + " and " + number2 + " is: " + ebob);
		int ekok = (number1 * number2) / ebob; 		// find the LCC
		System.out.println("The LCC of " + number1 + " and " + number2 + " is: " + ekok);
		input.close();


	}

}
