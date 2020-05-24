package com.CodingChallenges;

import java.util.Scanner;

public class OddEvenIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int n = sc.nextInt();
		
		if(!(n%2==0))
		{
			System.out.println("Hello");
		}
		if(n%2==0)
		{
			if((n>=0)&&(n<=10))
			{
				System.out.println("Hi");
			}
			else if((n>10)&&(n<20))
			{
				System.out.println("Hello");
			}
			else
			{
				System.out.println("Bye");
			}
		}

	}
}
