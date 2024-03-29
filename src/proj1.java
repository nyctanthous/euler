/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *	Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class proj1 {
	public static void main(String[] args) {
		for (int i = 0, allMult = 0; i < 1000; i++) {
			allMult += (i % 3 == 0 || i % 5 == 0) ? (i) : (0);
			if (i + 1 == 1000)
				System.out.println(allMult);
		}
	}
}