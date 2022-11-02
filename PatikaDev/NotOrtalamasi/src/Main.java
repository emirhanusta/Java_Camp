import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
		
	    Scanner myObj = new Scanner(System.in); 
	    int math,physics,chemistry,turkish,history,music;
	    int lessonCount=6;
	    String isSuccessful;
	    
	    System.out.println("Matematik notunuzu giriniz");
	    math = myObj.nextInt();
	    System.out.println("Fizik notunuzu giriniz");
	    physics = myObj.nextInt();
	    System.out.println("Kimya notunuzu giriniz");
	    chemistry = myObj.nextInt();
	    System.out.println("Türkçe notunuzu giriniz");
	    turkish = myObj.nextInt();
	    System.out.println("Tarih notunuzu giriniz");
	    history = myObj.nextInt();
	    System.out.println("Müzik notunuzu giriniz");
	    music = myObj.nextInt();

	    float avarage= (math+physics+chemistry+turkish+history+music)/lessonCount;
	    
	    isSuccessful= avarage>=60 ? "Sýnýfý Geçti" : "Sýnýfta Kaldý";
	   
	    System.out.println(isSuccessful);
	}

}
