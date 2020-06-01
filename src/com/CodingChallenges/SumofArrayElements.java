//Task : Sum of array elements using enhanced for loop.

package com.CodingChallenges;

import java.util.Scanner;

public class SumofArrayElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i,sum = 0;

		System.out.println("Enter array size:");

		int n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter array elements:");

		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int j : a) {
			sum = sum + j;
		}

		System.out.println("Sum of array elements: " + sum);
	}

}
