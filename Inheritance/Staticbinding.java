package Inheritance;
// Java Program to Illustrate Static Binding
// Main class
public class Staticbinding {
// Class 1
	public static class superclass {  // Static nested inner class
		static void print()   // Method of inner class
		{
			System.out.println("print() in superclass is called");
		}
		}
// Class 2
	public static class subclass extends superclass {  // Static nested inner class
	    static void print()       // Method of inner class
	    {
	        System.out.println("print() in subclass is called");
	    }
    	}

	@SuppressWarnings("static-access")
	public static void main(String[] args)  // Method of main class
	    {
		superclass obj1 = new superclass();// Creating objects of static inner classes
	    superclass obj2 = new subclass();
	        obj1.print();
	        obj2.print();
	    }
}