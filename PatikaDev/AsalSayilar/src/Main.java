
public class Main {

	public static void main(String[] args) {
		// Program to print prime numbers from 1 to 100
		int number = 100;
		for(int i = 2; i <= number; i++) { 		// from 2 to 100
			boolean isPrime = true;
			for(int j = 2; j < i; j++) { 		// from 2 to i
				if(i % j == 0) { 		// if i is divisible by j
					isPrime = false; 		// isPrime is false
					break; 		// break the loop
				}
			}
			if(isPrime) { 		// if isPrime is true
				System.out.println(i); 		// print i
			}
		}

	}

}
