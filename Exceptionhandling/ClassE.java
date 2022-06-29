package Exceptionhandling;

public final class ClassE {
 final int a=10;
 final void meth1()
 {
	 System.out.println("meth1() called");
	// System.out.println(a++);
	 System.out.println(a);
 }
 public static void main(String[] args) {
	new ClassE().meth1();
}
}
// public class Classp 
// {
//	 void meth1()
//	 {
//		 System.out.println("classA method overridden");
//	 }
//	 public static void main(String[] args) {
//		ClassA obj = new ClassA();
//		obj.meth1();
//	}
// }