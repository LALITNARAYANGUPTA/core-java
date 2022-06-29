package Exceptionhandling;
import java.util.*;
public class ClassB 
{
 void meth1()
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println(10);
	 try {
		 System.out.println("try block executed");
		 System.out.println("please ente the number");
		 System.out.println("Division: "+20/sc.nextInt());
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("catch block executed");
		 System.out.println(e.getMessage());
//		// e.getMessage()==>
		 System.out.println(e.toString());
//		 //toString()==>
         e.printStackTrace();	 
//		 //printStackTrace()==>
	 }
	 finally {
		 System.out.println("finally block executed");
	 }
	 sc.close();
	 System.out.println(30);
}
 public static void main(String[] args) {
	new ClassB().meth1();
}
}
