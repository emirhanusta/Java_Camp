import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// An ATM project where the user can manage their bank account with swich case
		Scanner input = new Scanner(System.in);
		int balance = 1000;
		int selection;
		do { 		
			System.out.println("Welcome to the ATM");
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Exit");
			System.out.print("Please make a selection: ");
			selection = input.nextInt();
			switch (selection) {
			case 1:		// check balance
				System.out.println("Your balance is: " + balance);
				break;
			case 2: 		// withdraw
				System.out.print("How much would you like to withdraw? ");
				int withdraw = input.nextInt();
				if (withdraw > balance) {
					System.out.println("You do not have enough money");
				} else {
					balance -= withdraw;
					System.out.println("Your new balance is: " + balance);
				}
				break;
			case 3: 		// deposit
				System.out.print("How much would you like to deposit? ");
				int deposit = input.nextInt();
				balance += deposit;
				System.out.println("Your new balance is: " + balance);
				break;
			case 4: 		// exit
				System.out.println("Thank you for using the ATM");
				break;
			default:
				System.out.println("Invalid selection");
			}
		} while (selection != 4); 		// exit the program


	}

}
