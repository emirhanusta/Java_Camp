
public class Main {

	public static void main(String[] args) {
		// Program that prints the letter "B" to the screen with "stars" using multidimensional arrays.
		String[][] array = new String[7][4];

		for (int i = 0; i < array.length; i++) { // Assigns the "*" character to the array.
			for (int j = 0; j < array[i].length; j++) { // Assigns the "*" character to the array.
				if (i == 0 || i == 3 || i == 6) { 		// Assigns the "*" character to the array.
					array[i][j] = "*";
				} else if (j == 0 || j == 3) { 			// Assigns the "*" character to the array.
					array[i][j] = "*";
				} else {							// Assigns the " " character to the array.
					array[i][j] = " ";
				}
				System.out.print(array[i][j]); 			// Prints the array to the screen.
			}
			System.out.println();
		}


	}

}
