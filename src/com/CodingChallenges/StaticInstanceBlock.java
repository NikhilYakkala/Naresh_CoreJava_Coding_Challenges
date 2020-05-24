/*1) Static block will execute only once in that particular Class life.

2) Instance Initializer Block (Non-Static) block will execute for every object 
that is created for that Class. 
If we create 3 Object of an class Then Instance Initializer Block also execute 3 times.*/

//static Blocks = at the time of class loading
//Instance Blocks = at the time of object creation

package com.CodingChallenges;

public class StaticInstanceBlock {

	static
	{
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	public static void main(String[] args) {
		
		System.out.println("Main Block");
		
		StaticInstanceBlock st = new StaticInstanceBlock();
		
		StaticInstanceBlock sts = new StaticInstanceBlock();
		
	}
}
