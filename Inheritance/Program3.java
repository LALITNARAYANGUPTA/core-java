package Inheritance;

public class Program3 {
void meth1()
{
	System.out.println("Program3 method");
}
Program3()
{
	this("java is awesome");
	System.out.println("Program3 a default contructor");
}
Program3(String s)
{
	System.out.println(s);
	this.meth1();
}

static class Program4 extends Program3{
 	void meth2()
	{
		System.out.println("Program4 method");
		super.meth1();
	}
 	void meth3()
 	{
 		System.out.println("meth3() called");
 	}
 	Program4()
 	{
 		super();
 		System.out.println("Program4 a default constructor");
 		this.meth3();
 		super.meth1();
 	}
 	Program4(int a)
 	{
 		System.out.println("Program4 parametrized constructor"+a);
 	}
 	public static void main(String[] args) {
		Program4 obj4 = new Program4();
		obj4.meth2();
	}
}
}
