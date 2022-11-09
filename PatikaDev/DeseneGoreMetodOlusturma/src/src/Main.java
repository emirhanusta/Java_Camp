package src;

import java.util.Scanner;

public class Main {
	static int n;
	static boolean b=true;
	
	public static int pattern(int number) { //
		if (number>0 && b) {
			System.out.println(number);
			return pattern(number-5);
		}else if (n>=number) {
			b=false;
			System.out.println(number);
			return pattern(number+5);
		}else return 1;
	}
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		n=number;

		pattern(number);
	}
}
