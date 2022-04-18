package week1.day1;

public class LearnFactorial {
	public static void main(String[] args) {
		// To find factorial the factorial of a given number
		int n = 5, fact = 1;
		for (int i = 1; i <= n; i++) 
		{
			fact = fact * i;
		}
		System.out.println(fact );

	}

}
