package Inheritance;
public class Program1 {
void meth1()
{
	System.out.println("parent class method");
}

 static class Program2 extends Program1
{
	void meth2()
{
	System.out.println("child class method");	
}
	public static void main(String[] args) {
		Program1 obj1 =  new Program1();
		obj1.meth1();
		//obj1.meth2();
		System.out.println("-------------------------");
		Program1 obj2 = new Program2();
		obj2.meth1();
		//obj2.meth2();
		System.out.println("--------------------------");
		Program2 obj3 = new Program2();
		obj3.meth1();
		obj3.meth2();
		System.out.println("----------------------------");
		//Program2 obj4 = new Program1();//error
	}
}
}