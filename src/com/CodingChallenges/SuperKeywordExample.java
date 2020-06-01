/* Super is a keyword and it is a predefined non static variable
 * It is used to access parent class functionality from child.
 * Note : It must be used only inside the non static context.
 * This Keyword - Same class Functionality
 * Super Keyword - Parent Class Functionality
 */
package com.CodingChallenges;

class Vehicle
{
	int speed;
	
	public void speed(int speed)
	{
		this.speed=speed;
	}
	
	public void run()
	{
		System.out.println("Vehicle is Running");
	}
}
class Car extends Vehicle
{
	@Override
	public void run()
	{
		super.run();
		super.speed(100);
		System.out.println("Car is Running with "+speed+" KMPH ");
	}
}
public class SuperKeywordExample 
{
	public static void main(String[] args) {
		
		Car c = new Car();
		c.run();
	}
}
