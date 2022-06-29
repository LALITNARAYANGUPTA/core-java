package Multitheading;

public class Sleepmethod {
public static void main(String[] args)throws InterruptedException 
{
	System.out.println("j");
	Thread.sleep(5000);
	System.out.println("a");
	Thread.sleep(5000);
	System.out.println("v");
	Thread.sleep(5000,500);
	System.out.println("a");
}
}
