/* 1. this is a keyword.
 * 2. It holds current object address.
 * 3. It is used to access both static methods and non static methods.
 * 4. It must be used only in non static context/method.
 */

package com.CodingChallenges;

public class ThisKeywordExample {

	public static void main(String[] args) {

		ThisKeywordExample t = new ThisKeywordExample();

		t.access();
	}

	public void access() {
		this.staticMethod();

		this.nonStaticMethod();
	}

	public static void staticMethod() {
		System.out.println("This is from Static Method Block");
	}

	public void nonStaticMethod() {
		System.out.println("This is from Non Static method Block");
	}

}
