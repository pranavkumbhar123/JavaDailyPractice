package com.example;

interface Movable{
	void move();
}
 class Car implements Movable
	{

	@Override
	public void move() {
		System.out.println("Car is moving");
		
	}
		
	}
class Bike implements Movable{

	@Override
	public void move() {


		System.out.println("Bike is moving");
		
	}
	
public class TestInterface{
	public static void main(String args[])
	{
		Movable m=new Car();
		m.move();
	}
}
	
}


