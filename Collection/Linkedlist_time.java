package Collection;
import java.util.*;
public class Linkedlist_time {
private static Object arr[];
static {
	arr= new Object[100000];
	for(int i=0;i<arr.length;i++)
		arr[i]=new Object();
}
	void ArrayListTime()
	{
		long Start;
		long end;
		ArrayList<Object> al=new ArrayList<Object>();
		Start= System.currentTimeMillis();
		for(Object obj1:arr)
		{
			al.add(obj1);
		}
		end=System.currentTimeMillis();
		System.out.println("Arraylist construction time: "+(end-Start));
	}
	void LinkedListTime()
	{
		long start,end;
		LinkedList<Object> ll = new LinkedList<Object>();
		start=System.currentTimeMillis();
		for(Object obj2:arr)
		{
			ll.add(obj2);
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList construction time: "+(end-start));
	}
	public static void main(String[] args) {
		Linkedlist_time lt= new Linkedlist_time();
		lt.ArrayListTime();
		lt.LinkedListTime();
	}
}

