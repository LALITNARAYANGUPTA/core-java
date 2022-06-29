package Exceptionhandling;


public class ClassA 
{
void meth1() 
{
	System.out.println(10);
try
{
	System.out.println(20/0);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Exception caught");
}
finally
{
	System.out.println("finally block executed");
}
System.out.println(30);
}
public static void main(String[] args) {
	new ClassA().meth1();
}
}
