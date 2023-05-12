package com.exception;

public class UseOfThrow {

	  public static void checkNum(int num) {  
	        if (num < 1) {  
	            throw new ArithmeticException("Number is negative");  
	        }  
	        else {  
	            System.out.println("Square of " + num + " is " + (num*num));  
	        }  
	    }  
	    
	    public static void main(String[] args) {  
	           UseOfThrow th= new UseOfThrow();  
	            th.checkNum(-3);  
	            System.out.println("Rest of the code..");  
	    }  
}
