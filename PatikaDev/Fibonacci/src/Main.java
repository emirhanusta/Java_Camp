import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// program that finds the number of elements in the fibonacci series received from the user
		Scanner scanner = new Scanner(System.in);
		int number, first = 0, second = 1, next;
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		for(int i = 0; i < number; i++) { 		// from 0 to the number entered
			if(i <= 1) { 		// if i is less than or equal to 1
				next = i; 		// next is i
			}
			else {
				next = first + second; 		// next is the sum of the first and second
				first = second; 		// first is second
				second = next; 		// second is next
			}
			System.out.println(next); 		// print next
		}

	}

}
