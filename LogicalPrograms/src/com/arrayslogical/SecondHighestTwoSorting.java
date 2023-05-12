package com.arrayslogical;

import java.util.Arrays;

public class SecondHighestTwoSorting {

	public static void secondHighest(int ar[])
	{
		int highest=Integer.MIN_VALUE;
		int shighest=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>highest)
			{
				shighest=highest;
				highest=ar[i];
			}
			if(ar[i]<highest && ar[i]>shighest)
			{
				shighest=ar[i];
			}
		}
		System.out.println("Second highest: "+shighest);
	}
	public static void main(String[] args) {
	
		int arr[]= {3,1,4,5,6,37,8};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
		
		secondHighest(arr);

	}

}
