package Collection;
import java.util.*;
public class Treemap {
 void meth1()
 {
	 System.out.println("implementing map interface");
	 TreeMap<Integer,String> map = new TreeMap<>();
	    map.put(101,"java");
		map.put(102,"python");
		map.put(103,"html");
		map.put(104,"css");
		map.put(105,"adv java");  
		System.out.println("Treemap:"+map);
		
		for(Map.Entry<Integer,String> m:map.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		//Maintains descending order  
	      System.out.println("descendingMap: "+map.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+map.headMap(102,true));  //backword value print
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(102,true));  //forword value print
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(101, false, 103, true)); 
	    //Returns key-value pairs whose keys are less than the specified key.  
	      System.out.println("headMap: "+map.headMap(102));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(102));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(100, 102));    
	 
 }
 public static void main(String[] args) {
	 Treemap obj= new Treemap();
	 obj.meth1();
}
}
