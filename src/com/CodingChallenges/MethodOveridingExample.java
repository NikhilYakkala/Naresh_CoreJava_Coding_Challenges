/*If a Parent type reference refers to a Child object Child's methodOfParentClass() is called. 
This is called RUN TIME POLYMORPHISM.*/
package com.CodingChallenges;

class RBI
{
	public void interest()
	{
		System.out.println("Interest for Loan in RBI is : 0");
	}
}
class AndhraBank extends RBI
{
	@Override
	public void interest()
	{
		System.out.println("Interest for Loan in Andhra Bank is : 8");
	}
}
class SBIBank extends RBI
{
	@Override
	public void interest()
	{
		System.out.println("Interest for Loan in SBI Bank is : 10");
	}
}
public class MethodOveridingExample {
	
	public static void main(String[] args) {
		
		AndhraBank ab = new AndhraBank();
		ab.interest();
		SBIBank sb = new SBIBank();
		sb.interest();
	}
}
