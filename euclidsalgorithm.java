package week3_recursion;

import java.util.Scanner;

public class euclidsalgorithm {
/** euclid's algorithm is the process of dividing P from Q, then dividing Q to the 
remainder (if it has one) until we get 0. */
	
	public static void main(String[] args) { // this is the main method
		Scanner sc = new Scanner(System.in); 
		System.out.println("Find GCD.");
		 
		System.out.print("P = ");
		int P = sc.nextInt();
		
		System.out.print("Q = ");
		int Q = sc.nextInt(); // scanner so the user can input their desired numbers
		
		System.out.println(euclid(P, Q)); 
		// prints and calls out the other method so the program can read it
	}

	public static int euclid(int P, int Q) {
		if (Q == 0) { // base case. if Q is not 0, we will go to the else statement
			return P; // we return P because the answer will input itself here
		}
		else {
			return euclid(Q, P % Q); 
			// we call out the method inside of itself (recursion)
/** the initial P becomes Q, then Q becomes P%Q. so for example, the user inputs 
 * P = 16, Q = 12, Then the else statement will be euclid(12, 16%12). 16 divided by 12
 * leaves a remainder of 4, and so 4 will be our new Q and 12 the P. it will turn into 
 * euclid(4, 12%4), 12 divided by 4, leaves no remainder (0) and so we go to our if statement
 * wherein if Q == 0, and 4 is not equal to 0, return P. P in this case is 0, since in
 * our main method we have P in place of the Q */
		}
	}
}