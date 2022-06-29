package Multitheading;
public class Runnableinterface  implements Runnable
{
public void run()
{
	for(int i=0;i<=5;i++)
	{
		System.out.println("overriding Runnable interface abstract method: "+i);
	}
}

public static void main(String[] args) 
{
Runnableinterface a = new Runnableinterface();
Thread t1 = new Thread(a);
System.out.println("java is awesome");
t1.start();  
}
}
