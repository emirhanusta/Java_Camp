import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Write a program that sorts the elements in an array from smallest to largest. Get the size of the array and the elements of the array from the user
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dizi boyutunu giriniz : ");
		int size = scanner.nextInt();
		int[] array = new int[size];	// creating array
		System.out.println("Dizinin elemanlarını giriniz : ");
		for (int i = 0; i < array.length; i++) {	// getting array elements from user
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < array.length; i++) {	// sorting array elements from smallest to largest
			for (int j = 0; j < array.length; j++) {	// sorting array elements from smallest to largest
				if (array[i] < array[j]) {	// if array[i] is smaller than array[j]
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Dizinin elemanları küçükten büyüğe sıralanmış hali : ");
		for (int i = 0; i < array.length; i++) {	// printing sorted array
			System.out.print(array[i] + " ");
		}
		scanner.close();

	}

}
