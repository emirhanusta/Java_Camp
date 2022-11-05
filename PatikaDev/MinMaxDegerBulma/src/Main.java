import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	//A program that finds the largest and smallest numbers from N counting numbers entered from the keyboard and writes these numbers to the screen
	
		Scanner scanner = new Scanner(System.in);
		int number, max = 0, min = 0;
		System.out.print("How many numbers will you enter?: ");
		number = scanner.nextInt();
		int array[] = new int[number];
		for(int i = 0; i < number; i++) { 		// from 0 to the number entered
			System.out.print((i+1) +". Enter a number: ");
			array[i] = scanner.nextInt();				
		}
		max = array[0];
		min = array[0];
		for(int i = 0; i < number; i++) { 		// from 0 to the number entered
			if(array[i] > max) { 		// find the largest number
				max = array[i];
			}
			if(array[i] < min) { 		// find the smallest number
				min = array[i];
			}
		}
		System.out.println("Max: " + max + " Min: " + min); 		// print the largest and smallest numbers
	}
	
}
