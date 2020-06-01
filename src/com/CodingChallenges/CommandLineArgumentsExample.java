package com.CodingChallenges;

public class CommandLineArgumentsExample {

	public static void main(String[] args) {

		try {
			int a = Integer.parseInt(args[0]);

			int b = Integer.parseInt(args[1]);

			System.out.println("Sum : " + (a + b));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Insufficient Arguments...");
		}
	}
}