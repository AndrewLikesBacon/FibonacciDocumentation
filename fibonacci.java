/**
 * Created to print the Fibonacci sequence with recursive and iterative functions.
 */

public class fibonacci {
	
	/**
	 * Prints the first 42 digits of the Fibonacci sequence with recursive and iterative functions.
	 * Time taken for each function is displayed for 42 digits.
	 * Time taken for the first 2-22 digits for each function is also displayed.
	 */
	
	public static void main(String[] args) {
		
		int runs = 40;
		
		long startTime = System.nanoTime();
		System.out.print("0, 1");
		fibonacciRecursive(0, 1, runs);
		long endTime = System.nanoTime();
		
		
		System.out.println();
		System.out.println("Time taken: " + (endTime - startTime));
		System.out.println();
		
		startTime = System.nanoTime();
		System.out.print("0, 1");
		fibonacciIterative(runs);
		endTime = System.nanoTime();
		
		System.out.println();
		System.out.println("Time taken: " + (endTime - startTime));
		System.out.println();
		
		System.out.println("|Recursive|");
		
		long[] recursiveTimes = new long[21];
		
		for (int i=0; i<21; i++) {
			
			startTime = System.nanoTime();
			System.out.print("0, 1");
			fibonacciRecursive(0, 1, i);
			endTime = System.nanoTime();
			System.out.println();
			System.out.println("Time taken for " + i + " runs: " + (endTime - startTime));
			recursiveTimes[i] = endTime - startTime;
			
		}
		
		System.out.println();
		System.out.println("|Iterative|");
		
		long[] iterativeTimes = new long[21];
		
		for (int i=0; i<21; i++) {
			
			startTime = System.nanoTime();
			System.out.print("0, 1");
			fibonacciIterative(i);
			endTime = System.nanoTime();
			System.out.println();
			System.out.println("Time taken for " + i + " runs: " + (endTime - startTime));
			iterativeTimes[i] = endTime - startTime;
			
		}
		
		System.out.println();
		System.out.println("Recursive times:");
		
		for (int i=0; i<21; i++) {
			
			System.out.print(recursiveTimes[i] + " ");
			
		}
		
		System.out.println();
		System.out.println("Iterative times:");
		
		for (int i=0; i<21; i++) {
			
			System.out.print(iterativeTimes[i] + " ");
			
		}
		
	}
	
	/**
	 * A recursive function to calculate and print the Fibonacci sequence.
	 * Prints with a comma and space after each number.
	 * 
	 * @param num1 The first of the two numbers to be added in the sequence
	 * @param num2 The second of the two numbers to be added in the sequence
	 * @param runsleft The remaining amount of times the function will call itself
	 * 
	 */
	
	public static void fibonacciRecursive(int num1, int num2, int runsleft) {
		
		if (runsleft > 0) {
			
			int sum = num1 + num2;
			
			System.out.print(", " + sum);
			
			fibonacciRecursive(num2, sum, runsleft - 1);
			
		}
		
	}
	
	/**
	 * An iterative function to calculate and print the Fibonacci sequence.
	 * Prints with a comma and space after each number.
	 * 
	 * @param runs The amount of new numbers in the sequence to be calculated.
	 */
	
	public static void fibonacciIterative(int runs) {
		
		int num1 = 0;
		int num2 = 1;
		
		for (int i=0; i<runs; i++) {
			
			int sum = num1 + num2;
			System.out.print(", " + sum);
			num1 = num2;
			num2 = sum;
			
		}
		
	}
}
