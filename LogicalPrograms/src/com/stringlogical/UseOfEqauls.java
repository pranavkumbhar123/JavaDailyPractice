package com.stringlogical;

public class UseOfEqauls {

	public static void main(String[] args) {


		String s1="Pranav";
		String s2="Pranav";
		
		String s3=new String("Pranav");
		
		System.out.println("Use of equals method");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
		System.out.println("Use of == method");
		System.out.println(s1==s2);
		System.out.println(s1==s3);

	}

}
