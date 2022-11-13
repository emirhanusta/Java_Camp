
public class Main {

	public static void main(String[] args) {
		// program that finds matrix transpose
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] transpose = new int[matrix.length][matrix.length];

		for (int i = 0; i < matrix.length; i++) {	// Loop to print transpose of matrix
			for (int j = 0; j < matrix.length; j++) {	// Loop to print transpose of matrix
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < matrix.length; i++) {	// Loop to find transpose of matrix
			for (int j = 0; j < matrix.length; j++) {	// Loop to find transpose of matrix
				transpose[i][j] = matrix[j][i];
			}
		}
		for (int i = 0; i < matrix.length; i++) {	// Loop to print transpose of matrix
			for (int j = 0; j < matrix.length; j++) {	// Loop to print transpose of matrix
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
