package com.arrayslogical;

import java.util.Arrays;

public class DuplicateNumber {

	public static void duplicate(int arr[])
	{
		int count;
		int dcount=0;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			if(arr[i]=='\0')
				continue;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='\0';
				}
			}
				if(count>1)
				{
					dcount++;
					System.out.println(arr[i]+" : "+count);
				}
			}
		
			System.out.println("Number of duplicate elements : "+dcount);
		
	}
	public static void main(String[] args) {

		  int ar[]= {5,3,2,4,3,2,4,5,1};
		  System.out.println(Arrays.toString(ar));
		  
		  duplicate(ar);

	}

}
