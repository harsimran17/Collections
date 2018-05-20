package queue.SimpleQueue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class SimpleQueue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.offer("Richard");
		q.add("Monana");

		System.out.println("Queue: "+ q);
		System.out.println(q.peek());
		while(q.peek()!=null){
			System.out.println("Removing from queue is : "+q.peek());
			q.remove();
			System.out.println(q);
		}
		
		System.out.println(q.isEmpty());
		System.out.println(q.poll());
		try{
			System.out.println(q.remove());
		}catch (NoSuchElementException e) {
			System.out.println("Use poll");
		}
		
	}

}
