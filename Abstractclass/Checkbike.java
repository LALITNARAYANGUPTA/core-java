package Abstractclass;
abstract class Bike 
{
	public abstract void run();
}
class Honda extends Bike
{
	public void run()
	{
		System.out.println("running bike");
	}
}
  public class Checkbike
 {
		public static void main(String[] args) 
		{
			Bike obj = new Honda();
			obj.run();
		}
 }
