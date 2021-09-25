package com.dsa.sheet.searching.sorting;

// Refer code Library

public class KthElementTwoSortedArrays {
	
	public static void kthElement(int array1[], int array2[], int k) {
		int x=0;
		int i =0;
		int j=0;
		
		// 2,3,6,7,9
		// 1,4,8,10
		while(i < array1.length && j < array2.length) {
			if(array1[i] < array2[j]) {
				x++;
				if(x == k) {
					System.out.println("Kth element is :" +array1[i]);
					break;
				}
				i++;
				
			}
			else {
				x++;
				if(x == k) {
					System.out.println("Kth element is :" +array2[j]);
					break;
				}
				j++;
			}
		}
		
		while (i <array1.length) {
			x++;
			if(x == k) {
				System.out.println("Kth element is :" +array1[i]);
				break;
			}
			i++;
		}
		
		while(j < array2.length) {
			x++;
			if(x == k) {
				System.out.println("Kth element is :" +array2[j]);
				break;
			}
			j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array1[] = {2,3,6,7,9};
       int array2[] = {1,4,8,10};
       int length1 = array1.length;
       int length2 = array2.length;
       int k =5;
       KthElementTwoSortedArrays.kthElement(array1, array2, k);
	}

}
