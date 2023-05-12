package com.clone;

public class Student {

	int id;
	String name;
	

	Student()
	{
		
	}
	Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String args[])
	{
		//deep copy..........change is reflected to copy also
		Student s1=new Student(1,"Pranav");
		Student s2=s1;
		System.out.println("Before modification:");
		System.out.println("Original:"+s1);
		System.out.println("Copy:"+s2);
		
		s1.name="Nilesh";
		System.out.println("Before modification:");
		System.out.println("Original:"+s1);
		System.out.println("Copy:"+s2);
		
		//shallow copy.........
		
	}
}
