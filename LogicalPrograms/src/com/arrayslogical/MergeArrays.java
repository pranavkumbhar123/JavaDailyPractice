package com.arrayslogical;

import java.util.Arrays;

public class MergeArrays {

	public static int[]mergeArray(int ar1[], int ar2[])
	{
		int size1=ar1.length;
		int size2=ar2.length;
		
		int marr[]=new int[size1+size2];
		int i,j;
		int k=0;
		for( i=0,j=0;i<size1&&j<size2;i++,j++)
		{
			marr[k++]=ar1[i];
			marr[k++]=ar2[j];
			
		}
		System.out.println(Arrays.toString(marr));
		//remaining elements
		
		while(i<size1)
		{
			marr[k++]=ar1[i++];
			
		}
		while(j<size2)
		{
			marr[k++]=ar2[j++];
		}
		System.out.println(Arrays.toString(marr));
		return marr;
		}
		
	
	
	public static void main(String[] args) {

		int arr1[]= {6,7,1,4,9,8};
		int arr2[]= {2,3,5,6};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int mar[]=mergeArray(arr1,arr2);
		
		System.out.println(Arrays.toString(mar));

	}

}
