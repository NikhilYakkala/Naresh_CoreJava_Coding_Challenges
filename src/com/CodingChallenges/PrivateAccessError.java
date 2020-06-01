/*Task : Error While Access to Private Methods, Variables and Constructors to another class.*/

package com.CodingChallenges;

class PrivateAccess
{
	private int a;
	
	private void printValue()
	{
		System.out.println("Private Method");
	}
	
	private PrivateAccess()
	{
		System.out.println("Private Constructor");
	}
}

class PrivateAccessError {
	
	public static void main(String[] args) {
		 
		PrivateAccess pv = new PrivateAccess();
		
		pv.printValue();
		
		pv.a=10;
		
		System.out.println(pv.a);
		
	}
}
