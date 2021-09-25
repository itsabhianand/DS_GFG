package com.dsa.sheet.bonus.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jobsequencing {
	
	static class job{
		int jobid;
		int deadline;
		int profit;
		
		job(int jobid, int deadline, int profit){
			this.jobid = jobid;
			this.deadline = deadline;
			this.profit = profit;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<job> jobList = new ArrayList<>();

		jobList.add(new job(1, 2, 100));
		jobList.add(new job(2, 1, 19));
		jobList.add(new job(3, 2, 27));
		jobList.add(new job(4, 1, 25));
		jobList.add(new job(5, 3, 35));

		findJobSequencing(jobList);
	}
	/*
	 * Sort the job list in descending order of profit
	 * 
	 * 1 2 100 || 5 3 35||  3 2 27 || 4 1 25 || 2 1 19
	 * 
	 * */
	private static void findJobSequencing(List<job> jobList) {
		// TODO Auto-generated method stub
		int n = jobList.size();
		boolean[] status = new boolean[n];
		
		int day = 0, profit =0;
		
		Collections.sort(jobList, new Comparator<job>() {

			@Override
			public int compare(job o1, job o2) {
				// TODO Auto-generated method stub
				Integer i1 = o1.profit;
				Integer i2 = o2.profit;
				return i2.compareTo(i1);
			}
			
		});
		
		for(int i=0; i<n; i++) {
			for(int j=Math.min(n, jobList.get(i).deadline-1); j>=0; j--){
				
				if(!status[j]) {
					day = day + 1;
					profit = profit + jobList.get(i).profit;
					status[j] = true; // [true, true, true, false, false]
					break;
				}
				
			}
		}
		System.out.println("Profit is : " + profit);
		System.out.println("Day is : " + day);
	}

}
