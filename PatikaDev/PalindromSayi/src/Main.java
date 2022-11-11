import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// a program that finds whether the entered number is "Palindrome Number"
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		int temp = number;
		int reverse = 0;
		while (temp != 0) { 		// reverse the number
			int lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp /= 10;
		}
		if (number == reverse) { 		// if the number is equal to the reverse number
			System.out.println(number + " is a Palindrome Number");
		} else {
			System.out.println(number + " is not a Palindrome Number");
		}
		input.close();

	}

}
