import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int radius;
		System.out.println("Yar��ap� giriniz: ");
		radius = scanner.nextInt();
		
		System.out.println("�evre: " + 2*Math.PI * radius);
		System.out.println("Alan: " + Math.PI * Math.pow(radius, 2));
		
	}

}
