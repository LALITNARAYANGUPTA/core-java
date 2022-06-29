package Multitheading;

public class Threadclass extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("overriding thread class run(): "+i);
		}
	}
	public static void main(String[] args) 
	{
		Threadclass obj = new Threadclass();
		Thread t1 = new  Thread(obj);
		t1.start();
		t1.run();
	}

}
