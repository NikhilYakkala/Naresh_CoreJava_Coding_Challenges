package com.CodingChallenges;

import java.util.Scanner;

class Student
{
	int age;
	
	Student(int age)
	{
		this.age=age;
	}
}
class Teacher extends Student
{
	double salary;
	
	Teacher(int age,double salary)
	{
		super(age);
		this.salary = salary;
	}
	public void displayAgeSalary() {
		System.out.println("Age: " +age+" Salary: " +salary);
	}
	
}
public class SuperMethodExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		
		int age = sc.nextInt();
		
		System.out.println("Enter Salary:");
		
		double salary = sc.nextDouble();
		
		Teacher t = new Teacher(age, salary);
		
		t.displayAgeSalary();
		
	}

}
