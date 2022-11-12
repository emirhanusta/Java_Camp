import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// MineSweeper game
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the number of rows");
		int rows = scanner.nextInt();
		
		System.out.println("enter the number of columns");
		int columns = scanner.nextInt();
		
		MineSweeper game = new MineSweeper(rows, columns);
        game.RunGame();

        scanner.close();
	}

}
