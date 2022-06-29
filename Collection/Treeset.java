package Collection;
import java.util.*;
public class Treeset {
	void meth1(){
		TreeSet<Integer> ts = new TreeSet<Integer>();
		 ts.add(10);
		 //ll.add("java");
		 //ll.add(null);
		 ts.add(75);
		 ts.add(96);
		 ts.add(12);
		 ts.add(1);
		 ts.add(10);
		 ts.add(55);
		 ts.add(45);
		 System.out.println("Treeset==>"+ts);
		 System.out.println("======= use methods=======");
		 System.out.println("Size()==>"+ts.size());
		 System.out.println("Is empty()==>"+ts.isEmpty());
		// al.clear();
		//System.out.println("Is empty()==>"+al.isEmpty());
		 System.out.println("Contains()==>"+ts.contains(55));
		 ts.add(34);
		 System.out.println("Treeset==>"+ts);
		 System.out.println("Remove()==>"+ts.remove(4));
		 System.out.println("Treeset==>"+ts);
		 System.out.println("Retriving the elements using for-each  loop");
	     for(int x:ts)
	     {
	    	 System.out.println(x+"");
	     }
	     System.out.println("Retriving the elements using Iterator");
	     Iterator<Integer> i=ts.iterator();
	     while(i.hasNext())
	     {
	    	 System.out.println(i.next());
	     }
	     System.out.println("Retriving the elements using descendingIterator");
	     Iterator<Integer> i2=ts.descendingIterator();
	     while(i2.hasNext())
	     {
	    	 System.out.println(i2.next());
	     }
	     System.out.println("-----------------------------");
	     System.out.println("headSet:"+ts.headSet(10));
	     System.out.println("tailSetts:"+ts.tailSet(10));
	}
	public static void main(String[] args) {
		Treeset obj = new  Treeset();
		obj.meth1();
	}
}
