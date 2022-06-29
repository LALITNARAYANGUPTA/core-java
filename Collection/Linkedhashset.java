package Collection;
import java.util.*;
public class Linkedhashset {
	void meth1(){
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		 lhs.add(10);
		 //ll.add("java");
		 //ll.add(null);
		 lhs.add(75);
		 lhs.add(96);
		 lhs.add(12);
		 lhs.add(1);
		 lhs.add(30);
		 lhs.add(55);
		 lhs.add(10);
		 System.out.println("LinkedHashset==>"+lhs);
		 System.out.println("======= use methods=======");
		 System.out.println("Size()==>"+lhs.size());
		 System.out.println("Is empty()==>"+lhs.isEmpty());
		// al.clear();
		//System.out.println("Is empty()==>"+al.isEmpty());
		 System.out.println("Contains()==>"+lhs.contains(55));
		 lhs.add(34);
		 System.out.println("LinkedHashset==>"+lhs);
		 System.out.println("Remove()==>"+lhs.remove(4));
		// System.out.println("Remove()==>"+ll.remove((Object)10));
		 System.out.println("LinkedHashset==>"+lhs);
		 System.out.println("Retriving the elements using for-each  loop");
	     for(int x:lhs)
	     {
	    	 System.out.println(x+"");
	     }
	     System.out.println("Retriving the elements using Iterator");
	     Iterator<Integer> i=lhs.iterator();
	     while(i.hasNext())
	     {
	    	 System.out.println(i.next());
	     }
	}
	public static void main(String[] args) {
		Linkedhashset obj = new  Linkedhashset();
		obj.meth1();
	}
}
