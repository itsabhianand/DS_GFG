package com.dsa.sheet.array2;

// Refer take u forward code.

public class TrappingRainWater {
	
	public static int trappingRainWater(int height[], int length) {
		// 0,1,0,2,1,0,1,3,2,1,2,1
		int left = 0;
		int right = length -1;
		int result = 0;
		int maxLeft = 0;
		int maxRight = 0;
		
		while(left <= right) {
			if(height[left] <= height[right]) {
				if(height[left] > maxLeft) {
					maxLeft = height[left];
				}
				else {
					result = result + (maxLeft - height[left]);
				}
				left++;
			}
			else if(height[left] > height[right]){
				if(height[right] > maxRight) {
					maxRight = height[right];
				}
				else {
					result = result + (maxRight - height[right]);
				}
				right--;
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
       int length = height.length;
       int waterTrapped = TrappingRainWater.trappingRainWater(height , length);
       System.out.println("Total Amount of Water Trapped is :" + waterTrapped);
	}

}
