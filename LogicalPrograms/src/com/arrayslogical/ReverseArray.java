package com.arrayslogical;

public class ReverseArray {

	 public static void main(final String[] args) {

	  final int[] array = { 1, 2, 3, 4, 5, 6, 7};

	  final int middle = array.length / 2;

	  int temp;
	  int j = array.length -1;
	  
	  for(final int a : array){
	   System.out.println(" before reverse :: " + a);
	  }
	  for (int i = 0 ; i < middle; i++, j--) {
	   temp = array[i];
	   array[i] = array[j];
	   array[j] = temp;
	  }
	  
	  for(final int a : array){
	   System.out.println(" after reverse :: " + a);
	  }
	 }
	

}
