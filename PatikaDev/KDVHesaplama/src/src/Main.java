package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("Para miktarýný giriniz: ");
		int money= scanner.nextInt();
		
		double VATRate ;
		
		if (money>0 && money<1000) {
			VATRate = 0.18;
		} else {
			VATRate = 0.8;
		}
		double VATAmount = money*VATRate;
		System.out.println(VATAmount);
	}

}
