package Multitheading;

public class Interruptmethod extends Thread
{
public void run()
{
	System.out.println("i am ready to go to interviews");
	for(int i=1;i<=5;i++)
	{
		System.out.println("this is my "+i+" interview");
	}
	System.out.println("i got placed");
	try
	{
		Thread.sleep(10000);
	}
	catch(Exception e)
	{
		System.out.println("my sleep is disturbed");
	}
	System.out.println("time to go to office");

}
public static void main(String[] args) {
	{
		Interruptmethod obj= new Interruptmethod();
		Thread t = new Thread(obj);
		t.start();
		t.interrupt();
	}
}
}

