package ControlStatment;

public class If_else 
{ 
	void meth1(int age)
	{
		if(age>18)
		{ 
			System.out.print("Age is greater than 18");  
		}
		else if(age<18)
		{
			System.out.println("Age is less than 18");
		}
		else
		{
			System.out.println("Age is equal to 18");
		}
	}
	public static void main(String[] args) 
	{
	  If_else obj = new If_else();
	  obj.meth1(19);
		 
	}  
}  

