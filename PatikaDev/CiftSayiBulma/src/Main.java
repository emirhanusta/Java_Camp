import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	//Write a program that calculates the average of numbers divisible by 3 and 4 from 0 to the number entered .

		Scanner scanner = new Scanner(System.in);
		int number, sum = 0, count = 0;
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		for(int i = 1; i < number; i++) {	// from 0 to the number entered
			if(i % 3 == 0 && i % 4 == 0) { 		// numbers divisible by 3 and 4
				sum += i;
				count++;
			}
		}
		System.out.println("Average: " + (sum / count)); 		// average of numbers divisible by 3 and 4
		}

}


