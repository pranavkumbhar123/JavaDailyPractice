package com.arrayslogical;

import java.util.Arrays;

public class HalfSorting {

	public static void halfSort(int ar[])
	{
		int len=ar.length;
		int temp;
		for(int i=0;i<len/2;i++)
		{
			for(int j=i+1;j<len/2;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
		//for descending order half
		for(int i=len/2;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
		
	}
	
	public static void printArray(int ar[])
	{
		for(int x:ar)
		{
			System.out.println(x+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,6};
		System.out.print("Before");
		//printArray(arr);
		
		System.out.println("===============");
		halfSort(arr);
		
		System.out.print("After sorting");
		printArray(arr);
		

	}

}
