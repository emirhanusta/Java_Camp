import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Matematik, Fizik, Kimya, T�rk�e, Tarih, M�zik
		
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
	    System.out.println("T�rk�e notunuzu giriniz");
	    turkish = myObj.nextInt();
	    System.out.println("Tarih notunuzu giriniz");
	    history = myObj.nextInt();
	    System.out.println("M�zik notunuzu giriniz");
	    music = myObj.nextInt();

	    float avarage= (math+physics+chemistry+turkish+history+music)/lessonCount;
	    
	    isSuccessful= avarage>=60 ? "S�n�f� Ge�ti" : "S�n�fta Kald�";
	   
	    System.out.println(isSuccessful);
	}

}
