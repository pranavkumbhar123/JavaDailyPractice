package com.impquestions;

class Vehicle
{
	protected int speed;
	{
		speed=90;
	}
	Vehicle changeSpeed()
	{
		speed=speed+10;
		return this;
	}
	void display()
	{
		System.out.println("Speed of vehicle:"+speed);
	}
}

class Car extends Vehicle
{
	{
	speed=190;
	}
	Car changeSpeed()
	{
		speed=speed+10;
		return this;
	}
	void display()
	{
		System.out.println("The speed of car:"+speed);
	}
	void changeGear()
	{
		System.out.println("Gear changed");
	}
}


public class CovarientDemo1 {

	public static void main(String args[])
	{
		Car c1=new Car();
		c1.display();
		c1=c1.changeSpeed();
		
		c1.changeGear();
		
		c1.display();
		Car c;
		
		Car bmw=new Car();
		Car audi=new Car();
		
		c=bmw.changeSpeed();
		c.display();
		c.changeGear();
		c.display();
		
		c=audi.changeSpeed();
		c.display();
	}
}

