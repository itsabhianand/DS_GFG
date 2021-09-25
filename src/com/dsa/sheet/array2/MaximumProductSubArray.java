package com.dsa.sheet.array2;

// WAP to find Maximum Product Sub-Array 
// refer May The Codes Be With You
public class MaximumProductSubArray {
	
	public static int maxProdSubArrayUsingTwoPass(int array[], int length) {
		// For Array : -1,-2,-3,4 
		// We are taking 2 traversals because in forward traversal, total max product is 2 but in actual it is 24 (-2,-3,4) which we get while traversing backward.
		int maxProduct = 0, currentProduct =1;
		for(int i=0; i < length; i++) {
			currentProduct = currentProduct * array[i];
			maxProduct = Math.max(currentProduct, maxProduct);
			if(currentProduct == 0) {
				currentProduct = 1;
			}
		}
			currentProduct = 1;
			for(int j=length-1; j>=0; j--) {
				currentProduct = currentProduct * array[j];
				maxProduct = Math.max(currentProduct, maxProduct);
				if(currentProduct == 0) {
					currentProduct = 1;
				}
		}
			return maxProduct;	
			
	}
	
	private static void findProductWithOnePass(int[] nums) {

		int min = nums[0],max=nums[0],product=nums[0];
		for(int i=1;i<nums.length;i++) {
         // Here we are swapping min and max bcz if min is -10 and max is -5 then we multiply it with number suppose -3 then min(-10) will give big resultant product than max(-5) 
			if(nums[i] < 0) {
				int temp = min;
				min = max;
				max = temp;
			}
			max = Math.max(nums[i], max*nums[i]);
			min = Math.min(nums[i], min*nums[i]);

			if(max>product)
				product = max;
		}

		System.out.println("Max Product is " + product);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = {-1,-2,-3,4};
      int length = array.length;
      int maxProduct = MaximumProductSubArray.maxProdSubArrayUsingTwoPass(array, length);
      System.out.println("Max Product is :" + maxProduct);
      findProductWithOnePass(array);
	}

}
