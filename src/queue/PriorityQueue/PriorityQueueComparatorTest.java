package queue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueComparatorTest {

	public static void main(String[] args) {
		Comparator<Person> comp = Comparator.comparing(Person::getName);
		Queue<Person> pq = new PriorityQueue<>(5, comp);
		pq.add(new Person(1, "Richard"));
		pq.add(new Person(4, "Gleeble"));
		pq.add(new Person(9, "Eric"));
		pq.add(new Person(3, "Utopia"));
		pq.add(new Person(2, "Glenn"));
		System.out.println(pq);
		
		while(pq.peek()!=null){
			pq.remove();
			System.out.println(pq);
		}

	}

}
