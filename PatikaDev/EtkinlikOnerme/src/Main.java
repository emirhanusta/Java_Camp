import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		float heat;
		
		System.out.println("Sicaklik degerini girin");
		heat= scanner.nextFloat();


		if (heat<5) {
			System.out.println("kayak yapabilrsiniz");
		}else if (heat>5 && heat <15) {
			System.out.println("sinemaya gidebilrsiniz");

		}else if (heat>15 && heat <25) {
			System.out.println("piknik yapabilrsiniz");

		} else {
			System.out.println("yuzmeye gidebilirsiniz");
		}
	}
}
