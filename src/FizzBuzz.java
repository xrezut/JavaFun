
/**
 * A solution to the FizzBuzz problem, which is commonly seen on
 * programming tests. It prints numbers for a given range. But 
 * for multiples of three it prints "Fizz" instead of the number,
 * and for the multiples of five print "Buzz". For numbers which 
 * are multiples of both three and five print "FizzBuzz".
 * 
 * @author xrezut
 *
 */
public class FizzBuzz {
	
	/**
	 * A method for the FuzzBuzz algorithm for 1-100.
	 */
	private void fizzBuzz() {
		
		for(int i=1; i<=100; i++) {
			
			if(i % 15 == 0) {
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
			
		}
	}
	
	
	/**
	 * We can run and test it here.
	 */
	public static void main(String [] args) {
		FizzBuzz fb = new FizzBuzz();
		fb.fizzBuzz();
	}

}
