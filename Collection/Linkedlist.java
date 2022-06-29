package Collection;
import java.util.*;
public class Linkedlist {
	void meth1()
	 {
		 System.out.println("implementing Linkedlist");
		 LinkedList<Integer> ll = new LinkedList<Integer>();
		 ll.add(10);
		 //ll.add("java");
		 //ll.add(null);
		 ll.add(75);
		 ll.add(96);
		 ll.add(12);
		 ll.add(1);
		 ll.add(30);
		 ll.add(55);
		 ll.add(10);
		 System.out.println("Linkedlist: "+ll);
		 System.out.println("======= use methods=======");
		 System.out.println("Size()==>"+ll.size());
		 System.out.println("Is empty()==>"+ll.isEmpty());
		// al.clear();
		//System.out.println("Is empty()==>"+al.isEmpty());
		 System.out.println("Contains()==>"+ll.contains(55));
		 ll.add(34);
		 System.out.println("Linkedlist==>"+ll);
		 System.out.println("Remove()==>"+ll.remove(4));
		// System.out.println("Remove()==>"+ll.remove((Object)10));
		 System.out.println("Linkedlist==>"+ll);
	     ll.add(2,100);
	     System.out.println("Linkedlist==>"+ll);
	     System.out.println("get()==>"+ll.get(3)); 
	     System.out.println("Retriving  the elements using for loop");
	     for(int i=0;i<ll.size();i++)
	     {
	    	 System.out.println(ll.get(i));
	     }
	     System.out.println("Retriving the elements in reverse order using for loop");
	     for(int j=ll.size()-1;j>=0;j--)
	     {
	    	 System.out.println(ll.get(j));
	     }
	     System.out.println("Retriving the elements using for-each  loop");
	     for(int x:ll)
	     {
	    	 System.out.println(x+"");
	     }
	     System.out.println("Retriving the elements using Iterator");
	     Iterator<Integer> i=ll.iterator();
	     while(i.hasNext())
	     {
	    	 System.out.println(i.next());
	     }
	     System.out.println("Retriving the elements using ListIterator");
	     System.out.println("Forword direction");
	     ListIterator<Integer> li = ll.listIterator();
	     while(li.hasNext())
	     {
	    	 System.out.println(li.next());
	     }
	     System.out.println("reverse direction");
	     while(li.hasPrevious())
	     {
	    	 System.out.println(li.previous()+" ");
	     }
	     System.out.println("getfirst element");
	     System.out.println(ll.getFirst());
	     System.out.println("getlastelement");
	     System.out.println(ll.getLast());
	     System.out.println("Removefirst element");
	     System.out.println(ll.removeFirst());
	     System.out.println("Removelast element");
	     System.out.println(ll.removeLast());
	     System.out.println("peekfirst element");
	     System.out.println(ll.peekFirst());
	     System.out.println("peeklastelement");
	     System.out.println(ll.peekLast());
	     System.out.println(ll);
}
	public static void main(String[] args) {
	 new Linkedlist().meth1();
		
	}
}