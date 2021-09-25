package com.dsa.sheet.arrays;

// Program to find profit for buy and sell stock, refer take u forward

public class BestTimeToBuyAndSellStock {
	
	public static int bestTimeToBuyAndSell(int array[], int n) {
		// 7,2,5,3,1,3
	    int minPriceToBuy = Integer.MAX_VALUE;
	    int maxprofit = 0;
	    for(int i=0; i < n ; i++) {
	    	if(array[i] < minPriceToBuy) {
	    		minPriceToBuy = array[i];
	    	}
	    	else if(array[i] - minPriceToBuy > maxprofit) {
	    		maxprofit = array[i] - minPriceToBuy;
	    	}
	    }
	    return maxprofit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[] = {7,2,5,3,1,3}; //Here each index is treated as a day and element
                                     // is treated as a price of stock on that day. 
       int length = array.length;
       int profit = BestTimeToBuyAndSellStock.bestTimeToBuyAndSell(array , length);
       System.out.println("Max profit earned is : " + profit);
	}

}
