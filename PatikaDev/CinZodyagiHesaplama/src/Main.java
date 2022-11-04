import java.util.Scanner;

public class Main {

	public static void main (String[]args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Dogum yilinizi giriniz: ");
	    int year = scanner.nextInt();
	    int zodiac = year % 12; // Burada yilin 12 ye bolumunden kalan bulunur.
	    String zodiacName = ""; 
	    switch (zodiac) { // Burada kalan degerlere gore burc isimleri atanir.
	        case 0:
	            zodiacName = "Maymun";
	            break;
	        case 1:
	            zodiacName = "Horoz";
	            break;
	        case 2:
	            zodiacName = "Kopek";
	            break;
	        case 3:
	            zodiacName = "Domuz";
	            break;
	        case 4:
	            zodiacName = "Fare";
	            break;
	        case 5:
	            zodiacName = "okuz";
	            break;
	        case 6:
	            zodiacName = "Kaplan";
	            break;
	        case 7:
	            zodiacName = "Tavsan";
	            break;
	        case 8:
	            zodiacName = "Ejderha";
	            break;
	        case 9:
	            zodiacName = "Yilan";
	            break;
	        case 10:    
	            zodiacName = "At";
	            break;
	        case 11:
	            zodiacName = "Koyun";
	            break;
	        default:
	            break;
	    }
	    System.out.println("Cin zodyagi burcunuz: " + zodiacName);  // Burcun ekrana yazdirilmasi
	}
}
