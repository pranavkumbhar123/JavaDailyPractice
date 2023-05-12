package com.arrayslogical;

import java.util.Scanner;

public class CheckPrime {


	static Scanner sc= new Scanner(System.in);
	
	public static void enterArray(int ar[])
	{
		System.out.println("Enter array elements:");
      for(int i=0;i<ar.length;i++)
      {
    	  ar[i]= sc.nextInt();
      }
		
	}
	
	public static void printArray(int ar[])
	{
		for(int x:ar)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static void checkArrayPrime(int ar[])
	{
		System.out.println("-----------------------");
		System.out.println("Prime number in array........");
		for(int i=0;i<ar.length;i++)
		{
			checkP(ar[i]);
		}
		
	}
	
	public static void checkP(int num)
	{
		boolean status=true;
		if(num==0||num==1)
			status=false;
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
					status=false;
			}
		}
		
		if(status)
		{
			System.out.println(num);
		}
	}
	
	

	public static void main(String[] args) {
      
		System.out.println("Enter array size");
		int size= sc.nextInt();
		
		int arr[]=new int[size];
		
		enterArray(arr);
		
		System.out.println("Array:");
		printArray(arr);
		
		checkArrayPrime(arr);
       

	}

}
