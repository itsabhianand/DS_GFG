package com.dsa.sheet.array2;

import java.util.HashMap;

// refer code Library
import java.util.Map;

public class ArraySubSetAnotherArray {
	
	public static boolean containsSubSetArray(int array1[], int array2[], int length1, int length2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		
		for(int nums : array1) {
			map.put(nums, map.getOrDefault(nums, 0) + 1);
		}
		for(int nums : array2) {
			map2.put(nums, map2.getOrDefault(nums, 0) + 1);
		}
		
		int count = 0;
		for(int i=0; i <length2; i++) {
			if(map.containsKey(array2[i]) && map2.get(array2[i]) <= map.get(array2[i]) ) {
				count++;
			}
		}
		if(count != length2) {
			return false;
		}
		else {
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int array1[] = {11,1,13,2,3,7};
         int length1 = array1.length;
         int array2[] = {11,3,7,1,1};
         int length2 = array2.length;
         boolean result = ArraySubSetAnotherArray.containsSubSetArray(array1, array2, length1, length2);
         System.out.println("Array2 is subset of Array1 :" + result);
        
	}

}
