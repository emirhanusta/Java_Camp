import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n1,n2, operator;
		System.out.println("ilk say�y� girin");
		n1 = scanner.nextInt();
		System.out.println("ikinci say�y� girin");
		n2 = scanner.nextInt();
		System.out.println("yap�lacak i�lemi se�in (1-toplama  2-��karma  3-�arpma 2 4-b�lme) ");
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
