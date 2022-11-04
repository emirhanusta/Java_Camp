import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// Scanner nesnesi oluşturuldu.
		System.out.print("Mesafeyi km turunden giriniz: "); 
		int km = scanner.nextInt();
		System.out.print("Yasinizi giriniz: ");
		int age = scanner.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yon, 2 => Gidis Donus): ");
		int type = scanner.nextInt();
		double price = 0;
		
		if (km < 0 || age < 0 || (type != 1 && type != 2)) {	// Hatali girisler icin
			System.out.println("Hatali veri girdiniz!");
		} else {								// Hatali giris yoksa		
			price = km * 0.10;
			if (age < 12) { //	0-12 yas arasi cocuklar icin
				price = price * 0.5;
			} else if (age >= 12 && age <= 24) { // 12-24 yas arasi gencler icin
				price = price * 0.9;
			} else if (age > 65) { // 65 yas ustu bireyler icin
				price = price * 0.7;
			}
			if (type == 2) { // Gidis donus yolculugu icin
				price = price * 0.8;
				price*=2;
			}
			System.out.println("Toplam Tutar: " + price); // Sonucu ekrana yazdir
		}
		


	}

}
