package com.CodingChallenges;

public class Test
{
	public Test()
	{
		System.out.println("This is Test Constructor");
	}
	
	public Test(int x)
	{
		this();
		System.out.println("X value = "+x);
	}
	public Test(int y,int z)
	{
		this(10);
		System.out.println("Y value = "+y+"\n"+"Z Value = "+z);
	}
	
	public static void main(String[] args) {
		Test test = new Test(11, 12);
	}

}