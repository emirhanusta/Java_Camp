import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// make diamonds with stars using loops program
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = input.nextInt();
		int i, j, k;
		for (i = 1; i <= rows; i++) {	// for upper part
			for (j = 1; j <= rows - i; j++) { 		// for spaces
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {	// for stars
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = rows - 1; i >= 1; i--) { 		// for lower part
			for (j = 1; j <= rows - i; j++) {	// for spaces
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {		// for stars
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();

	}

}
