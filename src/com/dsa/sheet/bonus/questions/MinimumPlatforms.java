package com.dsa.sheet.bonus.questions;

// Type of Greedy
// Refer take u forward
import java.util.Arrays;

public class MinimumPlatforms {
   
	public static int minPlatforms(int arrival[], int depart[], int n) {
		
		// 120,50,550,200,700,850
		// 600,550,700,500,900,1000
		Arrays.sort(arrival);
		Arrays.sort(depart);
		int platform_needed = 1; // Initializing for first arrival Train.
		int maxPlatform = 1; // Initializing for first arrival train. Total Max platforms occupied at any point of time.
		
		int i = 1, j = 0;
		
		while(i < n && j < n) {
			if(arrival[i] <= depart[j]) {
				platform_needed++;
				i++;
			}
			
			else if(arrival[i] > depart[j]) {
				platform_needed--;
				j++;
			}
			
			if(platform_needed > maxPlatform) {
				maxPlatform = platform_needed;
			}
		}
		
		return maxPlatform;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arrival[] = {120,50,550,200,700,850};
          int depart[] = {600,550,700,500,900,1000};
          int n = arrival.length;
          int platforms = minPlatforms(arrival, depart, n);
          System.out.println(platforms);
	}

}
