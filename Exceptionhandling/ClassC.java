package Exceptionhandling;

public class ClassC {
void meth1()
{
	String s="java";
	System.out.println(10);
	try
	{
		System.out.println("try block executed");
		System.out.println("division: "+20/0);
		System.out.println("Length: "+s.length());
		System.out.println("hi");
	}
	//System.out.println("hello world");
//	catch(ArithmeticException e)
//	{
//		System.out.println("1st catch block executed");
//		e.printStackTrace();
//	}
//	catch(Exception e)
//	{
//		System.out.println("2nd catch block executed");
//		e.printStackTrace();
//	}
	catch(ArithmeticException | NullPointerException e)
	{
		System.out.println("catch block executed");
		e.printStackTrace();
	}
	finally
	{
		System.out.println("finally block executed");
	}
	System.out.println(30);
}
public static void main(String[] args) {
	new ClassC().meth1();
}
}
