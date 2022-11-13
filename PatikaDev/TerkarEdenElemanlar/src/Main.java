
public class Main {

	public static void main(String[] args) {
		// Program to find how many times elements in array are repeated
		int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
		int[] count = new int[array.length];
		int temp = 0;

		for (int i = 0; i < array.length; i++) {	// Loop to find how many times elements are repeated
			temp = 1;
			for (int j = i + 1; j < array.length; j++) {	// Loop to find how many times elements are repeated
				if (array[i] == array[j]) {	// If elements are equal, increase temp
					temp++;
					count[j] = -1;
				}
			}
			if (count[i] != -1) {	// If elements are not equal, increase count
				count[i] = temp;
			}
		}
		for (int i = 0; i < count.length; i++) {	// Loop to print how many times elements are repeated
			if (count[i] != -1) {	// If elements are not equal, print elements and how many times they are repeated
				System.out.println(array[i] + " repeated " + count[i] + " times");
			}
		}

	

	}

}
