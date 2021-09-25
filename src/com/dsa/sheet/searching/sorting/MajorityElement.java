package com.dsa.sheet.searching.sorting;

// Refer Moorey Voting Algo
// refer take u forward

public class MajorityElement {
	
	public static void majorityElement(int array[], int length) {
		// 7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5
		int count = 0; // to keep track of total majority and minority elements.
		int element = 0;
		for(int i=0; i < length; i++) {
		if(count == 0) {
			element = array[i];
		}
		if(element == array[i]) {
			count = count + 1;
		}
		else {
			count = count -1;
		}
	}
		System.out.println(" Majority element is : " + element);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
       int length = array.length;
       MajorityElement.majorityElement(array, length);
	}

}
