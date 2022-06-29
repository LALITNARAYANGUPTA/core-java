package Collection;
import java.util.*; 
public class Arraylist {
 void meth1()
 {
	 System.out.println("implementing Array list");
	 ArrayList<Integer> al = new ArrayList<Integer>();
	 al.add(10);
	 //al.add("java");
	 //al.add(null);
	 al.add(75);
	 al.add(96);
	 al.add(12);
	 al.add(1);
	 al.add(30);
	 al.add(55);
	 al.add(10);
	 System.out.println("Arraylist: "+al);
	 System.out.println("======= use methods=======");
	 System.out.println("Size()==>"+al.size());
	 System.out.println("Is empty()==>"+al.isEmpty());
	// al.clear();
	//System.out.println("Is empty()==>"+al.isEmpty());
	 System.out.println("Contains()==>"+al.contains(55));
	 al.add(34);
	 System.out.println("Arraylist==>"+al);
	 System.out.println("Remove()==>"+al.remove(4));
	 System.out.println("Remove()==>"+al.remove((Object)10));
	 System.out.println("Arraylist==>"+al);
     al.add(2,100);
     System.out.println("Arraylist==>"+al);
     System.out.println("get()==>"+al.get(3));
     System.out.println("------------------------------");
     System.out.println("Retriving  the elements using for loop");
     for(int i=0;i<al.size();i++)
     {
    	 System.out.println(al.get(i));
     }
     System.out.println("Retriving the elements in reverse order using for loop");
     for(int j=al.size()-1;j>=0;j--)
     {
    	 System.out.println(al.get(j));
     }
     System.out.println("Retriving the elements using for-each  loop");
     for(int x:al)
     {
    	 System.out.println(x+"");
     }
     System.out.println("Retriving the elements using Iterator");
     Iterator<Integer> i=al.iterator();
     while(i.hasNext())
     {
    	 System.out.println(i.next());
     }
     
 }
 public static void main(String[] args) {
	new Arraylist().meth1();
}
}
