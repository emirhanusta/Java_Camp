
public class Main {

	public static void main(String[] args) {
		// Program to find how many times elements in array are repeated
		int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
		int[] count = new int[array.length];
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			temp = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					temp++;
					count[j] = -1;
				}
			}
			if (count[i] != -1) {
				count[i] = temp;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != -1) {
				System.out.println(array[i] + " repeated " + count[i] + " times");
			}
		}
		
	

	}

}
