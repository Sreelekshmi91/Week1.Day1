package week1.day1;

public class OddNumbers {
	public static void main(String args[]) {
		
		//Find the odd numbers in the specific range of numbers
		int n = 20;
		System.out.print("List of odd numbers from 1 to " + n + ": ");
		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
