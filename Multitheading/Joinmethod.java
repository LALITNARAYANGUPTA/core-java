package Multitheading;
class Joinmethod extends Thread 
{
  public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println("Joinmethod1==>"+i);
	}
}

 static class Joinmethod2 extends Thread
{
	 public static void main(String[] args)throws InterruptedException 
{
		Joinmethod obj = new Joinmethod();
		obj.start();
		obj.join();

		for(int i=1;i<=5;i++)
		{
			System.out.println("Joinmethod2==>"+i);
		}
}
}
}