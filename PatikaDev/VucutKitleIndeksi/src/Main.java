import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		float height,weight;
		
		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz");
		height = scanner.nextFloat();
		System.out.println("L�tfen kilonuzu giriniz");
		weight = scanner.nextFloat();
		
		System.out.println("V�cut Kitle �ndeksiniz: " + weight / (height*height));

	}

}
