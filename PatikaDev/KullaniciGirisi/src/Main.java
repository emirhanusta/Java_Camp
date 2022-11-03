import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String username, password;
		System.out.println("Kullan�c� ad�n�z: ");
		username = scanner.nextLine();
		System.out.println("�ifreniz");
		password = scanner.nextLine();
		
		if (username.equals("patika")) { //kullanıcı adı patika ise
			if (password.equals("java123")) { //şifre java123 ise
				System.out.println("kullan�c� giri�i ba�ar�l�");
			} else {//şifre yanlış ise
				System.out.println("�ifre hatal�");
				System.out.println("�ifrenizi s�f�rlamak ister misiniz? (e/h)");
				if (scanner.nextLine().equals("e")) {			//eğer kullanıcı e ye basarsa
					System.out.println("yeni �ifrenizi girin: ");
					String reply=scanner.nextLine();
					if(reply.equals(password) || reply.equals("java123")) { //yeni şifre eski şifre ile aynı ise
						System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
					}
					else { 	//yeni şifre eski şifre ile aynı değil ise
						System.out.println("�ifre olu�turuldu");
						password=reply;
					}
				} else {//eğer kullanıcı h ye basarsa
					System.out.println("kullan�c� giri�i ba�ar�s�z");
				}
			}
		}else System.out.println("kullan�c� ad� hatal�");//kullanıcı adı yanlış ise
	}

}
