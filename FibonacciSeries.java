package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		// To find Fibonacci Series for a given range
		
		int r = 8, firstNum = 0, secNum = 1, sum;

		for (int i = 1; i <= r; i++) {
			
			System.out.println(firstNum);

			sum = firstNum + secNum;

			firstNum = secNum;

			secNum = sum;
		}

	}
}
