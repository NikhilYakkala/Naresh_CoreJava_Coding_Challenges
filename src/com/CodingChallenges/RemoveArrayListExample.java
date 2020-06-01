package com.CodingChallenges;

import java.util.ArrayList;

public class RemoveArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(2);
		al.add(20);
		al.add(2);
		al.add(30);
		al.add(2);
		
		System.out.println("Before Removing Last Element from Array List: "+al);
		
		al.remove(al.size()-1);
		
		System.out.println("After Removing Last Element from Array List: "+al);
		
		al.remove(new Integer(2));
		
		System.out.println(al);
	}

}
