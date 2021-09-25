package com.sde.sheet.stacks.queues;

//Take class ImplementStackUsingArray as queue built from Array.

public class ImplementQueueUsingArray {
	
	int capacity;
	int front, rear;
	int queue[];
	
	ImplementQueueUsingArray(int c) {
		front = -1;
		rear = -1;
		capacity = c;
		queue = new int[capacity];
	}
	
     public void enQueue(int x) {
    	 if(rear >= capacity - 1) {
    		 System.out.println("Queue is overflown");
    	 }
    	 else if(front == -1 && rear == -1) {
    		 front = rear = 0;
    		 queue[rear] = x;
    		 System.out.println("Element inserted at first position is : " + queue[rear]);
    	 }
    	 else {
    		 rear++;
    		 queue[rear] = x;
    		 System.out.println("Element inserted is : " + queue[rear]);
    	 }
     }
     
     public void dequeue() {
    	 if(front == -1 && rear == -1) {
    		 System.out.println("Queue is underflown");
    	 }
    	 else if(front == rear) {// only 1 element in queue
    		 front = rear = -1;
    	 }
    	 else {
    		 int x = queue[front];
    		 front ++;
    		 System.out.println("Element dequeued is : " + x);
    	 }
     }
     
     public void display() {
    	 if(front == -1 && rear == -1) {
    		 System.out.println("Queue is empty");
    	 }
    	 else {
    		 System.out.println("Displaying Queue element is : ");
    		 for(int i = front; i <= rear; i++) {
    			 System.out.println("Queue element is :" + queue[i] );
    		 }
    	 }
     }
     
     public void peek() {
    	 if(front == -1 && rear == -1) {
    		 System.out.println("Queue is empty");
    	 }
    	 else {
    		 System.out.println("Peek Elemet at front is :" + queue[front]);
    	 }
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementQueueUsingArray q = new ImplementQueueUsingArray(5);
		q.enQueue(2);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.display();
		q.peek();
		q.dequeue();
		q.dequeue();
		q.display();
		q.peek();
	}

}
