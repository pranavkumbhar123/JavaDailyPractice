package com.example;

public class Chain {

	 Chain()
	 {
		 this(10);
		 System.out.println("the default constructor called");
	 }
	 
	 Chain(int num1)
	 {
		 this(10,20);
		 System.out.println(num1);
	 }
	 
	 Chain(int num1, int num2)
	 {
		 System.out.println("Multiplication of num1 and num2:" + num1*num2);
	 }
	 
	 public static void main(String args[])
	 {
		 new Chain();
	 }
	 
}
