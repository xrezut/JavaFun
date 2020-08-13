/**
 * A class which shows the Fibonacci example in Java.
 * In fibonacci series, the next number is the sum of 
 * previous two numbers.
 * 
 * @author xrezut
 *
 */
public class Fibonacci {
	
	
	/**
	 * The fibonacci method until a given number.
	 * @param until The number of times to calculate until.
	 */
	private void fibonacciLoop(int until) {
		
		int n1 = 0;
		int n2 = 1;
		
		System.out.print(n1);
		System.out.print(", "+ n2);
		
		for(int i=2; i<until; i++) {
			int n3 = n1+n2;
			
			System.out.print(", "+ n3);
			
			n1 = n2;
			n2 = n3;
		}
				
	}
	
	/**
	 * The fibonacci value of a given number in the sequence.
	 * @param count The value in the sequence to get the fibonacci number of
	 * @return The fibonacci value
	 */
	private int fibonacciOfX(int count) {
		if (count <= 0) {
			return 0;
		}else if (count == 1) {
			return 1;
		}else {
			return fibonacciOfX(count-1) + fibonacciOfX(count-2);
		}
	}

	
	/**
	 * We can run and test it here.
	 */
	public static void main(String [] args) {
		Fibonacci fb = new Fibonacci();
		fb.fibonacciLoop(10);
		System.out.println("\n"+ fb.fibonacciOfX(10));
	}

}
