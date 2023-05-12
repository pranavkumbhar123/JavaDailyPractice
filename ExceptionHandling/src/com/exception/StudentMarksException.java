package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private float marks;
	
	public Student()
	{
		
	}
	public Student(int id, String name, float marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
public class StudentMarksException {

	public static void main(String[] args) {

		Student s=new Student();
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter id");
		s.setId(sc.nextInt());

		System.out.println("Enter name:");
		s.setName(sc.next());
		try {
			
			System.out.println("ENter marks:");
			float m=sc.nextFloat();
			if(m<0||m>40)
			{
				throw new InputMismatchException();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Marks should be greator than 40");
		}


	}

}
