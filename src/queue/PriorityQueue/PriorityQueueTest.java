package queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		Queue<ComparablePerson> q = new PriorityQueue<>();
		q.add(new ComparablePerson(1, "Richard"));
		q.add(new ComparablePerson(2, "Albert"));
		q.add(new ComparablePerson(3, "Babinski"));
		q.add(new ComparablePerson(1, "Feynman"));

		System.out.println(q.toString());
		
		while(q.peek()!=null){
			q.remove();
			System.out.println("After removing a Person: "+q);
		}
		
		
	}

}
