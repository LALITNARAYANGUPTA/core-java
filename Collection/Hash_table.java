package Collection;

import java.util.*;

public class Hash_table {
	void meth1()
	 {
		 System.out.println("implementing map interface");
		 Hashtable<Integer,String> map = new Hashtable<>();
		    map.put(101,"java");
			map.put(102,"python");
			map.put(103,"html");
			map.put(104,"css");
			map.put(105,"adv java");  
			System.out.println("Hashtable:"+map);
			 System.out.println("Before remove: "+ map);    
		       // Remove value for key 102  
		       map.remove(102);  
		       System.out.println("After remove: "+ map); 
		       
		       System.out.println(map.getOrDefault(101, "Not Found"));  
		       System.out.println(map.getOrDefault(106, "Not Found"));  
		       
		       System.out.println("Initial Map: "+map);  
		       //Inserts, as the specified pair is unique  
		       map.putIfAbsent(106,"Gaurav");  
		       System.out.println("Updated Map: "+map);  
		       //Returns the current value, as the specified pair already exist  
		       map.putIfAbsent(102,"Vijay");  
		       System.out.println("Updated Map: "+map);  
}
	public static void main(String[] args) {
		Hash_table obj = new Hash_table();
		obj.meth1();
	}
}
