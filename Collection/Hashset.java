package Collection;
import java.util.*;
public class Hashset {
void meth1(){
	HashSet<Integer> hs = new HashSet<Integer>();
	 hs.add(10);
	 //ll.add("java");
	 //ll.add(null);
	 hs.add(75);
	 hs.add(96);
	 hs.add(12);
	 hs.add(1);
	 hs.add(30);
	 hs.add(55);
	 hs.add(10);
	 System.out.println("Hashset==>"+hs);
	 System.out.println("======= use methods=======");
	 System.out.println("Size()==>"+hs.size());
	 System.out.println("Is empty()==>"+hs.isEmpty());
	// al.clear();
	//System.out.println("Is empty()==>"+al.isEmpty());
	 System.out.println("Contains()==>"+hs.contains(55));
	 hs.add(34);
	 System.out.println("Hashset==>"+hs);
	 System.out.println("Remove()==>"+hs.remove(4));
	// System.out.println("Remove()==>"+ll.remove((Object)10));
	 System.out.println("Hashset==>"+hs);
     System.out.println("Retriving the elements using for-each  loop");
     for(int x:hs)
     {
    	 System.out.println(x+"");
     }
     System.out.println("Retriving the elements using Iterator");
     Iterator<Integer> i=hs.iterator();
     while(i.hasNext())
     {
    	 System.out.println(i.next());
     }
}
public static void main(String[] args) {
	Hashset obj = new  Hashset();
	obj.meth1();
}
}
