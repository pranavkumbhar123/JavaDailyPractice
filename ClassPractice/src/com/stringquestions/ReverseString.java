package com.stringquestions;

public class ReverseString {

	public static void reverseString(char []arr)
	{
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			arr[left]^=arr[right];
			arr[right]^=arr[left];
			arr[left]^=arr[right];
			
			left++;
			right--;
		}
		
	}
	public static void main(String[] args) {
	
		String str="Hello, world";
		char []arr=str.toCharArray();
		reverseString(arr);
		System.out.println("Reversed string: "+new String(arr));

	}

}
