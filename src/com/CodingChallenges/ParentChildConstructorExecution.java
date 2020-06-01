/*In the process of child object creation, JVM Constructs Parent Object first.
And then it extends the behaviour of Parent Object into child.*/

package com.CodingChallenges;

class Parent {

	Parent() {
		System.out.println("Parent's Constructor Called...");
	}
}

class Child extends Parent {
	Child() {
		System.out.println("Child's Constructor Called");
	}
}

public class ParentChildConstructorExecution {

	public static void main(String[] args) {

		Child c = new Child();

	}
}
