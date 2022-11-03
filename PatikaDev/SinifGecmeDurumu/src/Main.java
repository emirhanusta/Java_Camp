import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	    Scanner myObj = new Scanner(System.in); 

	    int [] lessons = new int [6];
	    int lessonCount=0;
	    int total=0;
	    System.out.println("Matematik notunuzu giriniz");
	    lessons[0] = myObj.nextInt();
	    System.out.println("Fizik notunuzu giriniz");
	    lessons[1] = myObj.nextInt();
	    System.out.println("Kimya notunuzu giriniz");
	    lessons[2] = myObj.nextInt();
	    System.out.println("Turk�e notunuzu giriniz");
	    lessons[3] = myObj.nextInt();
	    System.out.println("Tarih notunuzu giriniz");
	    lessons[4] = myObj.nextInt();
	    System.out.println("Muzik notunuzu giriniz");
	    lessons[5] = myObj.nextInt();

	    for (int i = 0; i < lessons.length; i++) {
			if (lessons[i]>=0 && lessons[i]<=100) {
				total+=lessons[i];
				lessonCount++;
			}
		}
	    
	   	String isSuccessful=total/lessonCount>55? "S�n�f� Ge�ti":"S�n�fta Kald�";
	   	
	    System.out.println(isSuccessful);
	}
	
}