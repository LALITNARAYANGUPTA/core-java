package Collection;
import java.util.*;
public class Vector_class {
 void meth1()
 {
	 Vector<Integer> v = new Vector<>(); 
   	 v.add(10);
	 //v.add("java");
	 //v.add(null);
	 v.add(75);
	 v.add(96);
	 v.add(12);
	 v.add(1);
	 v.add(30);
	 v.add(55);
	 v.add(10);
	 System.out.println("Vector:" +v);
	 System.out.println("======= use methods=======");
	 System.out.println("Size()==>"+v.size());
	 System.out.println("Is empty()==>"+v.isEmpty());
	// v.clear();
	//System.out.println("Is empty()==>"+al.isEmpty());
	 System.out.println("Contains()==>"+v.contains(55));
	 v.addElement(34);
	 System.out.println("Linkedlist==>"+v);
	 System.out.println("Remove()==>"+v.remove(4));
	// System.out.println("Remove()==>"+ll.remove((Object)10));
	 System.out.println("Linkedlist==>"+v);
     v.add(2,100);
     System.out.println("Linkedlist==>"+v);
     System.out.println("get()==>"+v.get(3)); 
     System.out.println("Retriving  the elements using for loop");
     for(int i=0;i<v.size();i++)
     {
    	 System.out.println(v.get(i));
     }
     System.out.println("Retriving the elements in reverse order using for loop");
     for(int j=v.size()-1;j>=0;j--)
     {
    	 System.out.println(v.get(j));
     }
     System.out.println("Retriving the elements using for-each  loop");
     for(int x:v)
     {
    	 System.out.println(x+"");
     }
     System.out.println("Retriving the elements using Iterator");
     Iterator<Integer> i=v.iterator();
     while(i.hasNext())
     {
    	 System.out.println(i.next());
     }
     System.out.println("Retriving the elements using ListIterator");
     System.out.println("Forword direction");
     ListIterator<Integer> li = v.listIterator();
     while(li.hasNext())
     {
    	 System.out.println(li.next());
     }
     System.out.println("reverse direction");
     while(li.hasPrevious())
     {
    	 System.out.println(li.previous()+" ");
     }
     System.out.println("Retriving the elements using Enumeration");
     Enumeration<Integer> e = v.elements();
     while(e.hasMoreElements())
     {
    	 System.out.println(e.nextElement());
     }
     System.out.println("last element");
     System.out.println(v.lastElement());
     System.out.println("first element");
     System.out.println(v.firstElement());
     v.removeElementAt(2);  
     System.out.println(v);
 }
 public static void main(String[] args) {
	 Vector_class vc = new Vector_class();
	 vc.meth1();
	 
}
}
