package com.exception;

public class UseOfThrows {

	 public static int divideNum(int num1, int num2) throws ArithmeticException {  
	        int div = num1 / num2;  
	        return div;  
	    }  
	   
	    public static void main(String[] args) {  
	        UseOfThrows obj = new UseOfThrows();  
	        try {  
	            System.out.println(obj.divideNum(45, 0));  
	        }  
	        catch (Exception e){  
	            System.out.println("number Cannot divided by 0"+e);  
	        }  
	          
	    }  
}
