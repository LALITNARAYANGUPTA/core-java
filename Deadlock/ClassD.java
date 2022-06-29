package Deadlock;
public class ClassD 
{
public static void main(String[] args) 
{
final String A="java";
final String B="python";
Thread t1 = new Thread()
{
	public void run() 
	{
	 synchronized (A)
	 {
		 System.out.println("thread 1 locked on A");
		 try
		 {
			 Thread.sleep(100);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 synchronized (B)
		 {
			 System.out.println("Thread 1 locked on B");
		 }
		 System.out.println("no deadlock");
	 }
	 
	}
};
Thread t2 = new Thread()
{
	public void run() 
	{
	 synchronized (B)
	 {
		 System.out.println("thread 2 locked on B");
		 try
		 {
			 Thread.sleep(100);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 synchronized (A)
		 {
			 System.out.println("Thread 2 locked on A");
		 }
		 System.out.println("no deadlock");
	 }
	 
	}
};
t1.start();
t2.start();
}
}
