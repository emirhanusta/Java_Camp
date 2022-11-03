import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String sign = "";
		boolean isError = false;

		Scanner sc = new Scanner(System.in);
		System.out.print("Dogdugunuz ay : ");
		int month = sc.nextInt();
		System.out.print("Dogdugunuz gun : ");
		int day = sc.nextInt();

		if (month == 1) {
			if (day > 0 && day <= 21) {
				sign = "Oglak";
			} else if (day > 0 && day <= 31) {
				sign = "Kova";
			} else
				isError = true;

		} else if (month == 2) {
			if (day > 0 && day <= 19) {
				sign = "Kova";
			} else if (day > 0 && day <= 29) {
				sign = "Balik";
			} else
				isError = true;

		} else if (month == 3) {
			if (day > 0 && day <= 20) {
				sign = "Balik";
			} else if (day > 0 && day <= 31) {
				sign = "Koç";
			} else
				isError = true;

		} else if (month == 4) {
			if (day > 0 && day <= 20) {
				sign = "Koç";
			} else if (day > 0 && day <= 30) {
				sign = "Boga";
			} else
				isError = true;

		} else if (month == 5) {
			if (day > 0 && day <= 21) {
				sign = "Boga";
			} else if (day > 0 && day <= 31) {
				sign = "ikizler";
			} else
				isError = true;

		} else if (month == 6) {
			if (day > 0 && day <= 22) {
				sign = "ikizler";
			} else if (day > 0 && day <= 30) {
				sign = "Yengec";
			} else
				isError = true;

		} else if (month == 7) {
			if (day > 0 && day <= 22) {
				sign = "Yengec";
			} else if (day > 0 && day <= 31) {
				sign = "Aslan";
			} else
				isError = true;

		} else if (month == 8) {
			if (day > 0 && day <= 22) {
				sign = "Aslan";
			} else if (day > 0 && day <= 31) {
				sign = "Basak";
			} else
				isError = true;

		} else if (month == 9) {
			if (day > 0 && day <= 22) {
				sign = "Basak";
			} else if (day > 0 && day <= 30) {
				sign = "Terazi";
			} else
				isError = true;

		} else if (month == 10) {
			if (day > 0 && day <= 22) {
				sign = "Terazi";
			} else if (day > 0 && day <= 31) {
				sign = "Akrep";
			} else
				isError = true;

		} else if (month == 11) {
			if (day > 0 && day <= 21) {
				sign = "Akrep";
			} else if (day > 0 && day <= 30) {
				sign = "Yay";
			} else
				isError = true;

		} else if (month == 12) {
			if (day > 0 && day <= 21) {
				sign = "Yay";
			} else if (day > 0 && day <= 31) {
				sign = "Oglak";
			} else
				isError = true;
		}
		if ((month > 12) || (month < 1)) {
			System.out.println("Hatali giris. Lütfen tekrar deneyiniz.");
		} else if (isError) {
			System.out.println("Hatali giris. Lütfen tekrar deneyiniz.");
		} else {
			System.out.println("Burcunuz : " + sign);
		}

	}

}
