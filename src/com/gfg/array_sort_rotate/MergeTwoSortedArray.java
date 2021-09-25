package com.gfg.array_sort_rotate;

import java.util.Arrays;

public class MergeTwoSortedArray {
	
	private static void mergeArrayWithoutExtraSpace(int[] nums1, int[] nums2) {

		int i=0,j=0;
		while(i<nums1.length && j<nums2.length) {

			if(nums1[i]>nums2[j]) {
				int temp=nums1[i];
				nums1[i]=nums2[j];
				nums2[j]=temp;

				Arrays.sort(nums2);
				i++;
			}
			else if(nums1[i]<=nums2[j]) {
				i++;
			}
		}
		System.out.print(Arrays.toString(nums1)+" -- ");
		System.out.print(Arrays.toString(nums2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = new int[] {1,2,4,6,8};
		int array2[] = new int[] {2,3,5,7};
		System.out.println();
		MergeTwoSortedArray.mergeArrayWithoutExtraSpace(array1, array2);
	}

}
