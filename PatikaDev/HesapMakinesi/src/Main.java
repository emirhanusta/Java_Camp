import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n1,n2, operator;
		System.out.println("ilk sayýyý girin");
		n1 = scanner.nextInt();
		System.out.println("ikinci sayýyý girin");
		n2 = scanner.nextInt();
		System.out.println("yapýlacak iþlemi seçin (1-toplama  2-çýkarma  3-çarpma 2 4-bölme) ");
		operator = scanner.nextInt();
		
		switch (operator) {
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;
		case 3:
			System.out.println(n1*n2);
			break;
		case 4:
			System.out.println(n1/n2);
			break;
		default:
			break;
		}
	}
}
