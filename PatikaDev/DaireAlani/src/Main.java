import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int radius;
		System.out.println("Yarýçapý giriniz: ");
		radius = scanner.nextInt();
		
		System.out.println("Çevre: " + 2*Math.PI * radius);
		System.out.println("Alan: " + Math.PI * Math.pow(radius, 2));
		
	}

}
