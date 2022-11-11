import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// combination calculator program
		Scanner input = new Scanner(System.in); // create Scanner object	
		System.out.println("Enter the number of elements: "); // prompt user for input
		int n = input.nextInt(); // read input
		System.out.println("Enter the number of elements to be selected: ");	// prompt user for input
		int r = input.nextInt();	// read input
		int nFact = 1;
		int rFact = 1;
		int nMinusRFact = 1;
		int nMinusR = n - r;
		for (int i = 1; i <= n; i++) {	// calculate n!
			nFact *= i;
		}
		for (int i = 1; i <= r; i++) {	// calculate r!
			rFact *= i;
		}	
		for (int i = 1; i <= nMinusR; i++) {	// calculate (n-r)!
			nMinusRFact *= i;
		}
		int combination = nFact / (rFact * nMinusRFact);	// calculate combination
		System.out.println("The number of combinations is: " + combination);	// display result
		input.close();

		

		

	}

}
