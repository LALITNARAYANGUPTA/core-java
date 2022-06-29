//Step 1: Create a package named 'numberTest' and make a class 'Number'. 
//package encapsulationTest; 
//public class Number
//{ 
//Step 2: Declare field/variable as private. 
//   private int y; 
//
//Step 3: Create a public getter method for private variable. 
//public int get() { 
//    return y; 
//} 
//Step 4: Create a public setter method for private variable and declare the parameter. 
//public void set(int y) { 
//   this.y = y; 
// } 
//} 
//Step4: Create another class EncapTest. 
//public class Encaptest
//{ 
//public static void main(String[] args)
//{ 
//Step 6: Create an object of class Number using the new keyword. 
// Number n = new number(); // Here, n is a reference variable of Number and pointing to the object of class Number. 
//
//Step 7: Now call setter method and set value of the variable. 
//   n.set(6); 
//
//Step 8: Call getter method to read the value of variable. 
//  int num = n.get(); 
//
//Step 9: Print the output. 
//  System.out.println(num); 
//  } 
//}
package Encapsulation;
public class Number1 {
private int y;

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}
public static class Encaptest{
	public static void main(String[] args) {
		Number1 obj = new Number1();
		obj.setY(6);
		int num= obj.getY();
		System.out.println(num);
	}
	
}
}
