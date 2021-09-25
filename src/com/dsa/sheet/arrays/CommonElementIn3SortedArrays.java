package com.dsa.sheet.arrays;

// Refer Code Library code for this example
// Code to find out common element in 3 sorted arrays

public class CommonElementIn3SortedArrays {
	
	public static void commonElementFound(int a[], int b[], int c[]) {
		int length1= a.length;
		int length2 = b.length;
		int length3 = c.length;
		int i=0, j=0, k=0;
		while(i< length1 && j < length2 && k < length3) {
			
			if(a[i]<b[j] && a[i]<c[k]) // Comparing first element array with second and third , same below
				i++;
			else if(b[j]<a[i] && b[j]<c[k])
				j++;
			else if(c[k]<a[i] && c[k]<b[j])
				k++;
			else {
				System.out.print(a[i]+" ");
				i++;
				j++;
				k++;
			}
				
		}

			 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int array1[] = {1,5,10,20,40,80};
         int array2[] = {6,7,20,80,100};
         int array3[] = {3,4,15,20,30,70,80,120};
		
		/*
		 * int array1[] = {3,3,3,3,3}; int array2[] = {3,3,3,3}; int array3[] =
		 * {3,3,3,3,3,3,3};
		 */
		 
         CommonElementIn3SortedArrays.commonElementFound(array1, array2, array3);
	}

}
