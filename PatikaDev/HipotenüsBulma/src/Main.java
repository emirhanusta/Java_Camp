import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a,b;
		System.out.println("ilk kenarýn uzunluðunu girin");
		a=scanner.nextInt();
		System.out.println("ikinci kenarýn uzunluðunu girin");
		b=scanner.nextInt();
		
		double hypotenuse = Math.sqrt((a*a) + (b*b));
		
		System.out.println("hipotenüs: "+hypotenuse);
	}

}
