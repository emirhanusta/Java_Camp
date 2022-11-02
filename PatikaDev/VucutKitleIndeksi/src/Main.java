import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		float height,weight;
		
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz");
		height = scanner.nextFloat();
		System.out.println("Lütfen kilonuzu giriniz");
		weight = scanner.nextFloat();
		
		System.out.println("Vücut Kitle Ýndeksiniz: " + weight / (height*height));

	}

}
