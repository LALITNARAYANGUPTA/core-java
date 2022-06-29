package Multitheading;
public class Yieldmethod extends Thread 
{
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println("ClassA==>"+i);
	}
}

 static class ClassB extends Thread
{
	public static void main(String[] args)
	{
		Yieldmethod obj = new Yieldmethod();
		obj.start();
		Thread.yield();
		for(int i=1;i<=5;i++)
		{
			System.out.println("ClassB==>"+i);
		}
	}
}
 }