package Collection;
import java.util.*;
public class Queue {
void meth1()
{
	
	List<Integer>li = new LinkedList<>();
	li.add(10);
	//li.offer(45);
	LinkedList <Integer>ll =new LinkedList<>();
	ll.add(10);
	ll.offer(45);
	System.out.println("====== useing list =======");
	System.out.println(li);
	System.out.println("====== using linkedlist =====");
	System.out.println(ll);
}
void meth2()
{
	PriorityQueue<Integer> pq = new  PriorityQueue<Integer>();
	System.out.println("======= Priorty queue =====");
	pq.add(10);
	pq.offer(20);
	pq.offer(30);
	pq.offer(40);
	pq.add(96);
	pq.offer(67);
	pq.offer(78);
	pq.offer(92);
	System.out.println("PriortiyQueue: "+pq);
	System.out.println("poll()==>"+pq.poll());
	System.out.println("remove()==>"+pq.remove());
	System.out.println("Peek()==>"+pq.peek());
	System.out.println("PriortiyQueue: "+pq);
	//pq.clear();
//	System.out.println("poll()==>"+pq.poll());
//	System.out.println("remove()==>"+pq.remove());
//	System.out.println("Peek()==>"+pq.peek());
//	System.out.println("PriortiyQueue: "+pq);
	
}
public static void main(String[] args) {
	new Queue().meth1();
	new Queue().meth2();
	
}
}
