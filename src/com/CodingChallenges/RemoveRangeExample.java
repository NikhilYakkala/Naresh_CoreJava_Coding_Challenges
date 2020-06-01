/*to access protected methods your class must extends the parent class 
 * i.e ArrayList and you must create the object of child class
 */
package com.CodingChallenges;

import java.util.ArrayList;

public class RemoveRangeExample<E> extends ArrayList<E>{
	
	public static void main(String[] args) {
		
		RemoveRangeExample<Integer> al = new RemoveRangeExample<Integer>();
		
		for(int i=10;i<=100;i=i+10)
		{
			al.add(i);
		}
		
		al.removeRange(2, 7);
		
		for(int i : al)
		{
			System.out.println(i);
		}
	}
	
	
}