package com.exception;

public class UncheckedExceptionPropogation {

	void method1()
	{
		int data=10/0;
	}
	void method2()
	{
		method1();
	}
	void method3()
	{
		try {
			method2();
		}
		catch(Exception e)
		{
			System.out.println("Method3:"+e);
		}
	}
	public static void main(String[] args) {


		UncheckedExceptionPropogation u1=new UncheckedExceptionPropogation();
		u1.method3();

	}

}
