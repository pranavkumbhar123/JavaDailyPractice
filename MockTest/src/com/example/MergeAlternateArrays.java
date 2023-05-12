package com.example;

import java.util.Arrays;

public class MergeAlternateArrays {

	public static void MergeAlternateArray(int arr1[], int arr2[],int arr3[],int n1, int n2)
	{
		int i=0, j=0,k=0;
		while(i<n1 && j<n2)
		{
			arr3[k++]=arr1[i++];
			arr3[k++]=arr2[j++];
			
			
			
			while(i<n1)
			{
				arr3[k++]=arr1[i++];
				
			}
			while(j<n2)
			{
				arr3[k++]=arr2[j++];
			}
		}
	}
	public static void main(String[] args) {


		int arr1[]= {1,3,5,7};
		System.out.println(Arrays.toString(arr1));
		int n1=arr1.length;
		int arr2[]= {2,4,6,8};
		System.out.println(Arrays.toString(arr2));
		int n2=arr2.length;
		
		int arr3[]=new int[n1+n2];
		MergeAlternateArray(arr1,arr2,arr3,n2,n1);
		
		System.out.println("After alternate merging two arrays");
		
		for(int i=0;i<n1+n2;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
		
		
				
		}
		

	}


