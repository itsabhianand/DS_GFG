package com.dsa.sheet.arrays;

// Note this solution will work only for element
// Returns count of Pairs whose sum is equal to k or 0.
// if we use 2 pointers here we  will not get all pairs, we will get 2 pairs, it will not give duplicate pair.
import java.util.HashMap;
import java.util.Map;

public class AllPairEqualToSum {
	
	public static int countAllPairs(int arr[], int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int length = arr.length;
		int count =0;
		for(int i=0; i<length; i++) {
			int temp = sum - arr[i];
			if(map.containsKey(temp)) {
				map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
				count = count + map.get(temp); 
			}
			else {
				map.put(arr[i], 1);
			}
			
		}
		 return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {5,1,7,1,5};
       int sum = 6;
       int count = AllPairEqualToSum.countAllPairs(array, sum);
       System.out.println("Total count is : " + count);
	}

}
