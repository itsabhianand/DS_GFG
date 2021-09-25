	/**
 * 
 */
package com.gfg.array_sort_rotate;

import java.util.Arrays;

/**
 * @author Abhijeet Anand
 * Program to rotate an array in Java by k times.(Shifting all elements towards left that is anti-clockwise)
 * This solution has Time complexity : O(n)
 * with extra space.
 *
 */
public class ArrayRotation {

	/**
	 * @param args
	 */
	//1,2,3,4,5,6,7,8,9,10
	public static int[] arrayRotate(int arr[], int d, int n)
	{
		int temp[] = new int[d];
		for(int i=0; i<d; i++) 
		{
			temp[i] = arr[i];// Storing first d elements in a temp Array.
		}
		int m=0;
		for(int j=d; j<=n-1; j++)	
		{
			arr[m] = arr[j];
			m++;             // Shifting all elements except first d elements. 3,4,5,4,5
		}
		for(int k=d-1; k>=0; k--)
		{
			arr[n - 1] = temp[k];//Storing back those d elements in final Array , 3,4,5,1,2
			n--;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[] = new int[] {1,2,3,4,5};
         int length = a.length;
         int finalRotatedArray[] = ArrayRotation.arrayRotate(a, 2, length);
         System.out.println("Final Rotated Array is :" + Arrays.toString(finalRotatedArray));
	}

}
