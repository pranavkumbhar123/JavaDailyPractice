package com.stringquestions;

public class SumOfDigits {

	public static int sumDigits(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
   {
	char ch=str.charAt(i);
	if(Character.isDigit(ch)) {
	int digit=Character.getNumericValue(ch);
	sum+=digit;
	}
   }
return sum;
	}

	public static void main(String[] args) {
		String str = "1234";
		int sum = sumDigits(str);
		System.out.println("Sum of digits in string " + str + " is: " + sum);

	}

}
