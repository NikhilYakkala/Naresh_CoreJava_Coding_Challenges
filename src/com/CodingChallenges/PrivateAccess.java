/*Private Access Modifier can be applied within class only.
Private can applied to Methods,Variables and Constructors only.
Task : Access to Private Methods, Variables and Constructors within the Class only.*/

package com.CodingChallenges;

	public class PrivateAccess
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
	
public static void main(String[] args) {
		 
		PrivateAccess pv = new PrivateAccess();
		
		pv.printValue();
		
		pv.a=10;
		
		System.out.println(pv.a);
		
	}

}