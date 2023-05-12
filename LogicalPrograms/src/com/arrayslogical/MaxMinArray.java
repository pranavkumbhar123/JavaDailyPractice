package com.arrayslogical;

import java.util.Scanner;

public class MaxMinArray {

	static Scanner sc=new Scanner(System.in);
	public static void maxAndMin(int ar[])
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
				if(ar[i]>max)
					max=ar[i];
				if(ar[i]<min)
					min=ar[i];
				
				
		}
		System.out.println("Maximum :"+max);
		System.out.println("Minimum :"+min);
	}
	public static void enterArrayElements(int ar[])
	{
		System.out.println("Enter array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]= sc.nextInt();
		}
	}
	

	public static void main(String[] args) {
    
     System.out.println("Enter the size of array");
     int size= sc.nextInt();
     
     int arr[]= new int[size];
     
      enterArrayElements(arr); 
      
     maxAndMin(arr);


	}
}
