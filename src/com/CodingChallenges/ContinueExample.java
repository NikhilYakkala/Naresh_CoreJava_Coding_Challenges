//Task : Print the multiples of 3 and 5 between 0 to 30 but not common mutiples
package com.CodingChallenges;

public class ContinueExample {

	public static void main(String[] args) {

		int i;
		int m = 3, n = 5;
		System.out.println("Multiples of 3 between 0 to 30");
		for (i = 0; i <= 10; i++) {
			if ((m * i) % 5 == 0) {
				continue;
			}
			System.out.print(" "+ m * i);
		}
		System.out.println();
		System.out.println("Multiples of 5 between 0 to 30");
		for (i = 0; i <= 6; i++) {
			if ((n * i) % 3 == 0) {
				continue;
			}
			System.out.print(" "+ n * i);
		}
	}
}
