package com.stringquestions;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void checkAnagram(String str1, String str2)
	{
		boolean status =false;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()==str2.length())
		{
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			System.out.println(ch1);
			System.out.println(ch2);
			
			if(Arrays.equals(ch1, ch2))
			{
				status =true;
				System.out.println("The strings are anagram");
			}
			
			if(!status)
			{
				System.out.println("The string are not anagram");
			}
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first string");
		String s1=sc.next();
		
		System.out.println("Enter the second string");
		String s2=sc.next();
		
		checkAnagram(s1,s2);
		
	}
	
}
