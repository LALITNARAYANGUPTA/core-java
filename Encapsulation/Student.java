package Encapsulation;
public class Student
{ 
	// Step 1: Declare variables private in the class. 
	  private String stdName; 
	  private int stdRollNo; 
	  private int stdId; 
// Step 2: Apply public getter setter method for each private vairable in the class. 
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdRollNo() {
		return stdRollNo;
	}
	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	 static class EncapTest 
	{ 
	public static void main(String[] args)
	{ 
	// Step 4: Create the object of class Student by using new keyword. 
		Student obj = new Student();  

	// Step 5: Call setter method and set the value of variables. 
	   obj.setStdName("Kiran"); 
	   obj.setStdRollNo(4); 
	   obj.setStdId(12345); 
	// Step 6: Call getter method to read the value of variables and print it on console. 
	   System.out.println("Student's Name: " +obj.getStdName()); 
	   System.out.println("Student's Roll no.: " +obj.getStdRollNo()); 
	   System.out.println("Student's Id: " +obj.getStdId()); 
	  } 
	}	
	
}
