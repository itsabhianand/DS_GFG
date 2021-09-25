package com.dsa.sheet.bonus.questions;

// Sliding window technique.
// when even number of negative or all positive integers and with/without zeros then length = i - zeroPosition.
// when odd number of negative integers and with/without zeros,  length = i - firstNegative.
public class MaxLengthSubArrayPositiveProduct {
	
	public static int getMaxLen(int[] nums) {
		// 1,-2,-3,0,4,-5,6,-2
        int firstNegative = -1, zeroPosition = -1, cntNegative = 0, maxLength = 0;
     // we only need to know index of first negative number
        for(int i = 0;i < nums.length; i++){
            if(nums[i] < 0){
                cntNegative++; // increment negatives count
                if(firstNegative == -1) firstNegative = i; // set the firstNeg index
            }
			// if current number is 0, we can't use any element from index 0 to i anymore, so update zeroPosition, and reset sum and firstNegative. If it is a game, we should refresh the game when we meet 0. 
            if(nums[i] == 0){ 
                cntNegative = 0; // initialize as if array starts here
                firstNegative = -1;// // initialize as if array starts here
                zeroPosition = i;
            }
            // If current number is non zero.
            else{
                if(cntNegative%2 == 0) {
                	maxLength = Math.max(i - zeroPosition, maxLength); // // even number of negatives --> valid range is [lastZero(zeroPosition) + 1...i]
                }
				// consider index of first negative number
                else {
                	maxLength = Math.max(i - firstNegative, maxLength); // // odd number of negatives -> valid range is [firstNeg + 1..i]  
                }
            }
        }
        return maxLength;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]  nums = {1,-2,-3,0,4,-5,6,-2};
      int result =  getMaxLen(nums);
      System.out.println(result);
	}

}
