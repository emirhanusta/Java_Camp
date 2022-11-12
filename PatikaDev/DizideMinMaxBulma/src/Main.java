import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Program to find the nearest number and the closest number smaller than the entered number of the elements in the array.
		Scanner input = new Scanner(System.in);
		int[] array = {15,12,788,1,-1,-778,2,0};
		int number, min = 0, max = 0;
		System.out.print("Enter a number: ");
		number = input.nextInt();
		for (int i = 0; i < array.length; i++) { // Find the nearest number.
			if (array[i] < number) { 			// If the number is smaller than the number entered, the number is assigned to the min variable.
				min = array[i];
			}
			if (array[i] > number) { 			// If the number is greater than the number entered, the number is assigned to the max variable.
				max = array[i];
				break;
			}
		}
		System.out.println("The nearest number smaller than the entered number: " + min);
		System.out.println("The nearest number larger than the entered number: " + max);
		input.close();
		


	}

}
