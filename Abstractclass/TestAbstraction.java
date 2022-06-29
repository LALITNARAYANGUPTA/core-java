package Abstractclass;
abstract class Shape
{  
	public abstract void draw();  
}
class Rectangle extends Shape
{  
	public void draw()
	{
		System.out.println("drawing rectangle");
	}  
}  
class Circle extends Shape
{  
	public void draw()
	{
		System.out.println("drawing circle");
	}  
} 
public class TestAbstraction
{  
	public static void main(String args[])
	{  
		Shape p = new Circle(); 
		p.draw();  
	}  
}	  
