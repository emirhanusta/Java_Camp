import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a,b;
		System.out.println("ilk kenar�n uzunlu�unu girin");
		a=scanner.nextInt();
		System.out.println("ikinci kenar�n uzunlu�unu girin");
		b=scanner.nextInt();
		
		double hypotenuse = Math.sqrt((a*a) + (b*b));
		
		System.out.println("hipoten�s: "+hypotenuse);
	}

}
