import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int row;
    private int column;
    private String[][] MineField;
    Random r = new Random();
    MineSweeper(int Row,int Column){
        this.row = Row;
        this.column = Column;
        this.MineField = new String[Row][Column];
    }
    private void formTable(){
        for (int i = 0; i < this.row*this.column/4; i++) {
            int randomRow = r.nextInt(this.row);
            int randomCol = r.nextInt(this.column);
            if(this.MineField[randomRow][randomCol] == null){
                this.MineField[randomRow][randomCol] = "*";
            }
            else{
                i--;
            }
        }
        for (int i = 0; i < MineField.length; i++) {
            for (int j = 0; j < MineField[i].length; j++) {
                if(MineField[i][j] == null){
                    MineField[i][j] = "-";
                }
            }
        }
    }
    private void displayAdminTable(){
        System.out.print("\n");
        for (int i = 0; i < MineField.length; i++) {
            for (int j = 0; j < MineField[i].length; j++) {
                System.out.print(this.MineField[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    private void displayPlayerTable(){
        System.out.print("\n");
        for (int i = 0; i < MineField.length; i++) {
            for (int j = 0; j < MineField[i].length; j++) {
                if(this.MineField[i][j] == "*"){
                    System.out.print("- ");
                }
                else{
                    System.out.print(this.MineField[i][j]+" ");
                }
            }
            System.out.print("\n");
        }
    }
    private int CalcNearbyMines(int rowCoord, int columnCoord){
        int count = 0;
        for (int i = 0; i < MineField.length; i++) {
            for (int j = 0; j < MineField[i].length; j++) {
                if(MineField[i][j] == "*" && Math.abs(rowCoord-i)<=1 && Math.abs(columnCoord-j)<=1){
                    count++;
                }
            }
        }
        return count;
    }
    public int sizeControl(int number , int enteredNumber) {

    	if (enteredNumber>number) {
    		int newNumber;
			do {
    			Scanner scanner = new Scanner(System.in);
				System.out.println("enter a valid number");
				newNumber=scanner.nextInt();
			} while (newNumber>number);
			return newNumber;
		} else {
			return enteredNumber;
		}
    }
    public void RunGame(){
        Scanner sc = new Scanner(System.in);
        int rowPicked=0;
        int columnPicked=0;
        boolean isRun = true;
        formTable();
        do{
            displayPlayerTable();
            System.out.print("Enter row: ");
            rowPicked= sc.nextInt();
            rowPicked = this.sizeControl(row, rowPicked);
            System.out.print("Enter column: ");
            columnPicked = sc.nextInt();
            columnPicked = this.sizeControl(column, columnPicked);
            
            isRun = this.MineField[rowPicked][columnPicked] != "*";
            if(isRun == true){
                this.MineField[rowPicked][columnPicked] = String.valueOf(CalcNearbyMines(rowPicked, columnPicked));
            }
        }
        while(isRun);
        sc.close();
        System.out.println("Mayına Bastınız! Oyun kaybedildi.");
        displayAdminTable();
    }
}