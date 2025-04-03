import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
	}
	public static void q1() {
		System.out.println(sumOfDigits(234)); 
		System.out.println(sumOfDigits(12));   
		System.out.println(sumOfDigits(39));   
		System.out.println(sumOfDigits(-12));  
	}

	public static int sumOfDigits(int x) {
		if (x < 0) {
			x = -x;
			}
		
		if (x < 10) {
			return x;
			}
		
		return (x % 10) + sumOfDigits(x / 10);

	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = scanner.nextInt();

		int result = factorial(num);
		System.out.println("Factorial of " + num +" is " +result);

	}
		public static int factorial(int n) {
			if (n < 0) {
				return 0;
			} 
			if (n == 0 || n == 1) {
			return 1;
			}
			return n * factorial(n-1);
			}
	
}
