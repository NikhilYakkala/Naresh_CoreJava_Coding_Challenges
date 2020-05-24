package com.CodingChallenges;

public class StringtoInt {
		
	public static void stringToInt(String s,String st)
	{	
		try
		{
		int a = Integer.parseInt(s);
		
		int b = Integer.parseInt(st);
		
		int sum = a + b;
		
		System.out.println("Sum of "+s+ " and " +st+" is "+sum);
		
		}
		catch (NumberFormatException e) {
			
			System.out.println("Enter Only Numbers...");
		
		}
	}
	public static void main(String[] args) {
		
		StringtoInt.stringToInt("2","3");
		//Exception because we can't convert string name to int
		/* StringtoInt.stringToInt("JAVA","3"); */
	}

}
