package Abstractclass;
public abstract class ClassA {
	public abstract void meth1();
	public abstract int meth1(int a,int b);
	void meth2()
	{
		System.out.println(" Normal meth2() called");
	}
	static void meth3()
	{
		System.out.println("static meth3() called");
	}
	ClassA()
	{
		this("java is awesome");
		System.out.println("classA default constructor");
	}
	ClassA(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		System.out.println("classA main() called");
		//ClassA aobj = new ClassA();
		ClassA.meth3();

		
		
	}

}
