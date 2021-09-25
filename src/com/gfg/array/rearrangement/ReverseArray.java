package com.gfg.array.rearrangement;


// Time complexity is O(n)

public class ReverseArray {
	
	
	public static void reverseRecursively(int array[], int low, int high) {
		if(low == high)// Base condition check
		System.out.println(array[low]);
		
		int temp;
		while(low < high) {
			temp = array[low];
			array[low] = array[high];
			array[high] = temp;
			high--;
			low++;
		}
		 for (int i = 0; i < array.length; i++)
             System.out.print(array[i] + " ");        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[] = new int[] {2,5,8,9,7,6};
        int length=array.length;
        ReverseArray.reverseRecursively(array, 0, length-1);
	}

}
