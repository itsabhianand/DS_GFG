package com.dsa.sheet.bonus.questions;

import java.util.LinkedList;
import java.util.Queue;

// This is BFS Approach based.
public class RottenOranges {
	
	static class Pair{
		int x;
		int y;
		Pair(int x1, int y1){
			x = x1;
			y = y1;
		}
	}
	
	public static int findTimeForRottenOranges(int [][] grid) {
		Queue<Pair> q = new LinkedList<Pair>();
		int total = 0, rotten = 0, time = 0;
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 1 || grid[i][j] == 2) {
					total++;
				}
				if(grid[i][j] == 2) {
					q.add(new Pair(i, j));
				}
			}
		}
		
		if(total == 0) {
			return 0;
		}
		
		while(!q.isEmpty()) {
			int size = q.size();
			rotten =rotten + size;
			
			if(rotten == total) {
				return time;
			}
			
			time++;
			
			for(int i = 0; i < size; i++) {
				Pair p = q.poll();
				
				if (p.x + 1 < grid.length && grid[p.x + 1][p.y] == 1) {
                    grid[p.x + 1][p.y] = 2;
                    q.add(new Pair(p.x + 1, p.y));
                }
                if (p.x - 1 >= 0 && grid[p.x - 1][p.y] == 1) {
                    grid[p.x - 1][p.y] = 2;
                    q.add(new Pair(p.x - 1, p.y));
                }
                if (p.y + 1 < grid[0].length && grid[p.x][p.y + 1] == 1) {
                    grid[p.x][p.y + 1] = 2;
                    q.add(new Pair(p.x, p.y + 1));
                }
                if (p.y - 1 >= 0 && grid[p.x][p.y - 1] == 1) {
                    grid[p.x][p.y - 1] = 2;
                    q.add(new Pair(p.x, p.y - 1));
                }
                
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[][] grid =  {
        		          {2,1,1},
                          {1,1,0},
                          {0,1,1}
                        }; 
         
         int time = findTimeForRottenOranges(grid);
         System.out.println(time);
         }
	}
