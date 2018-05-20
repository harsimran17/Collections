package queue.PriorityQueue;

public class ComparablePerson extends Person implements Comparable{

	public ComparablePerson(int id, String name) {
		super(id, name);
	}

	@Override
	public int compareTo(Object o) {
		ComparablePerson cp = (ComparablePerson) o;
		int cpid = cp.getId();
		String name = cp.getName();
		
		if(this.getId()<cpid){
			return -1;
		}
		else if(this.getId()>cpid){
			return 1;
		}else if(this.getId()==cpid){
			return this.getName().compareTo(name);
		}
		
		return 0;
	}

}
