import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] numbers = new int[3];
		// b,a,c
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i+1 +". sayiyi girin");
			numbers[i]=scanner.nextInt();
		}

		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				int temp;
				if (numbers[j]<numbers[i]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		for (int i : numbers) {
			System.out.print(i+ " - ");
		}
	}
}
