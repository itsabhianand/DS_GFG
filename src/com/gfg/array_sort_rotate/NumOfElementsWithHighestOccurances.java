package com.gfg.array_sort_rotate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

// Finding elements with maximum number of occurances

public class NumOfElementsWithHighestOccurances {
	public static void numOfElementsWithHighestOccurances(int array[], int k) {
		HashMap map = new HashMap<Integer,Integer>();
		for(int i=0; i < array.length; i++) {
			int key = array[i];
			if(map.containsKey(key)) {
				int value = (Integer) map.get(key);
				map.put(key, value + 1);				
			}
			else {
				map.put(key, 1);
			}
		}
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){

			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getValue() == o2.getValue()) {
					return o2.getKey() - o1.getKey();
				}
				else {
					return o2.getValue() - o1.getValue();
				}
			}
			
		});
		
		System.out.println("List After sorting is : ");
		for(Entry<Integer, Integer> i : list) {
			System.out.println("Key is :" + i.getKey());
			System.out.println("Value is :" + i.getValue());
		}
		for(int i=0; i < k; i++) {
			System.out.println("Elements with maximum number of occurances is :" + list.get(i).getKey());
		}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = new int[] {1,3,5,6,5,5,5,4,3,3,4};
       System.out.println("Please enter number of elements whose maximum occurances needs to be find :");
       Scanner scan = new Scanner(System.in);
       int k = scan.nextInt();
       NumOfElementsWithHighestOccurances.numOfElementsWithHighestOccurances(arr, k);
	}

}
