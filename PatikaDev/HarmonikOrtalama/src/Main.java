
public class Main {

	public static void main(String[] args) {
		// Program to calculate the harmonic mean of the numbers in the array

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double sum = 0;

		for (int i = 0; i < numbers.length; i++) { // for loop to calculate the sum of the reciprocals of the numbers in the array
			sum += 1.0 / numbers[i];
		}

		double harmonicMean = numbers.length / sum;
		System.out.println("Harmonic mean: " + harmonicMean);


	}

}
