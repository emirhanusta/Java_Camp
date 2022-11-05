import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//program that prints powers of 4 and 5 up to the entered number
        Scanner scanner = new Scanner(System.in);
        int number, power1 = 1, power2 = 1;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        for(int i = 0; i < number; i++) {	// from 1 to the number entered
        	System.out.println("4^" + i + " = " + power1 + " 5^" + i + " = " + power2 );	// print the power of 4 and 5
            
            power1 *= 4;    // power of 4
            power2 *= 5;    // power of 5		
        }

	}
	

}
