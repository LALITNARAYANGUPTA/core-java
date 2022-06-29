package Collection;
import java.util.*;
public class Hashmap {
void meth1()
{
	System.out.println("implementing map interface");
	HashMap<Integer,String> map =new HashMap<>();
	map.put(101,"java");
	map.put(102,"python");
	map.put(103,"html");
	map.put(104,"css");
	map.put(105,"adv java");
	System.out.println("hashmap:"+map);
	System.out.println("Iterating Hashmap...");  
	for(Map.Entry<Integer,String> m : map.entrySet())
	{    
		System.out.println(m.getKey()+" "+m.getValue());    
	}
	map.putIfAbsent(106, "dotnet");  
    System.out.println("After invoking putIfAbsent() method ");  
    for(Map.Entry<Integer,String> m:map.entrySet()){    
         System.out.println(m.getKey()+" "+m.getValue());    
        } 
    for(Map.Entry<Integer,String> m:map.entrySet()){    
        System.out.println(m.getKey()+" "+m.getValue());    
       }  
//    HashMap<Integer,String> map2 =new HashMap<>();
//    map2.put(107,"c");  
//    map2.putAll(map);  
//    System.out.println("After invoking putAll() method ");  
//    for(Map.Entry<Integer,String> m:map2.entrySet())
//    {    
//     System.out.println(m.getKey()+" "+m.getValue());
//    }
//    System.out.println("Initial list of elements: "+map);  
//    //key-based removal  
//    map.remove(106);  
//    System.out.println("Updated list of elements: "+map);  
//    //value-based removal  
//    map.remove((Object)101);  
//    System.out.println("Updated list of elements: "+map);  
//    //key-value pair based removal  
//    map.remove(105, "adv java");  
//    System.out.println("Updated list of elements: "+map);  
    System.out.println("Initial list of elements:");  
    for(Map.Entry<Integer,String> m:map.entrySet())  
    {  
       System.out.println(m.getKey()+" "+m.getValue());   
    }  
    System.out.println("Updated list of elements:");  
    map.replace(102, "cpp");
    map.replace(103, "html", "html5");
    for(Map.Entry<Integer,String> m:map.entrySet())  
    {  
       System.out.println(m.getKey()+" "+m.getValue());   
    }  
    System.out.println("Updated list of elements:");  
    map.replaceAll((k,v) -> "Ajay");  
    for(Map.Entry<Integer,String> m:map.entrySet())  
    {  
       System.out.println(m.getKey()+" "+m.getValue());   
    } 
  
	
}
public static void main(String[] args) {
	Hashmap obj = new Hashmap();
	obj.meth1();
} 
}
