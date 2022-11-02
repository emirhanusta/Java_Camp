import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		double pear = 2.14 ;
		double apple = 3.67 ;
		double tomato = 1.11 ;
		double banana = 0.95 ;
		double aubergine = 5.00 ;
		double total=0;
		
		System.out.println("Kaç kilo armut ? : ");
		total += scanner.nextFloat()*pear;
		System.out.println("Kaç kilo elma ? : ");
		total += scanner.nextFloat()*apple;
		System.out.println("Kaç kilo domates ?: ");
		total += scanner.nextFloat()*tomato;
		System.out.println("Kaç kilo muz ? : ");
		total += scanner.nextFloat()*banana;
		System.out.println("Kaç kilo patlýcan ? : ");
		total += scanner.nextFloat()*aubergine;
		
		System.out.print("Toplam Tutar: "+total);
	}

}
