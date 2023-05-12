package com.exception;

import java.io.IOException;

public class CheckedExceptionPropagation {

	void method1() throws IOException{
		throw new IOException("Error in I/o");
	}
	
	void method2() throws IOException
	{
		method1();
	}
	void method3() throws IOException
	{
		method2();
	}
	public static void main(String[] args) {

CheckedExceptionPropagation c1=new CheckedExceptionPropagation();
try {
	c1.method3();
}
catch(Exception e){
	System.out.println(e);
	
}
		

	}

}
