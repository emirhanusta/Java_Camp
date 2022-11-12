
public class Main {

	public static void main(String[] args) {
		// A program that specifies repeating even numbers in a string of numbers
		int[] array = {1,2,3,4,5,6,6,8,1,10,11,12,13,13,2,16,17,7,19,7};
		int[] array2 = new int[array.length];
		int count = 0;
		for (int i = 0; i < array.length; i++) {	// Find the repeating numbers.
			for (int j = 0; j < array.length; j++) { 	
				int number =array[i];
				if (number == array[j] && i!=j && number%2==0) { 	
					count++;
				}
			}
			if (count > 0) {	// If the number is repeated, assign it to the array2.
				array2[i] = array[i];
			}
			count = 0;
		}
		for (int i = 0; i < array2.length; i++) {	// Print the array2 to the screen.
			if (array2[i] != 0) { 	
				System.out.print(array2[i]+" ,");
			}
		}


	}

}
