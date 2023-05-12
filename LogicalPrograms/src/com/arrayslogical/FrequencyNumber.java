package com.arrayslogical;

import java.util.Arrays;

public class FrequencyNumber {

	public static void countFrequency(int arr[])
	{
		int count;
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
			System.out.println(arr[i]+" : "+count);
		}
	}
	public static void main(String[] args) {
	int ar[]= {1,2,3,4,3,3,3,6};
	System.out.println(Arrays.toString(ar));
	countFrequency(ar);
	}

}
