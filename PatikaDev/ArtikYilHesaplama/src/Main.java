import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yil giriniz: ");
		int year = scanner.nextInt();

		if (year % 4 == 0) {	// 4'e bolunuyorsa artik yildir
			if (year % 100 == 0) {		// 100'e bolunuyorsa 400'e bolunme durumuna bakilir
				if (year % 400 == 0) {  		// 400'e bolunuyorsa artik yildir
					System.out.println("Artik yildir.");
				} else { 		// 400'e bolunmuyorsa artik yil degildir
					System.out.println("Artik yil degildir.");
				}
			} else {	// 100'e bolunmuyorsa artik yildir
				System.out.println("Artik yildir.");
			}
		} else {	// 4'e bolunmuyorsa artik yil degildir
			System.out.println("Artik yil degildir.");
		}

	}

}
