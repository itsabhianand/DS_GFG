package com.gfg.array.rearrangement;

// Program to find missing number in an array
// Time complexity : O(Logn)

public class SmallestMissingNumber {
	
	public static int smallestMissingNumber(int[] array,int low, int high) {
		   if ( low > high) {
			   return high + 1;
		   }
		   
		   // Check if first element itself is missing or not
		   if(low != array[low]) {
			   return low;
		   }
		   int mid = (low + high)/2;
		   if(array[mid] == mid) {
			   return smallestMissingNumber(array, mid+1, high);
					   
		   }
		   else {
			   return smallestMissingNumber(array, 0, mid - 1);
		   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = new int[] {0,1,2,3,4,5,6,7,10,11};
       int length = array.length;
       int smallestNumber = SmallestMissingNumber.smallestMissingNumber(array, 0 , length - 1);
       System.out.println("Smallest Number found is :" + smallestNumber);
	}

}
