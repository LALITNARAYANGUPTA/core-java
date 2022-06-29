package ControlStatment;
public class Ageblood 
{     
	void meth1(int age,int weight)
	{
		if(age>=18)
		{      
			if(weight>50)
			{    
	            System.out.println("You are eligible to donate blood");    
	        } 
			else
			{  
	            System.out.println("You are not eligible to donate blood");    
	        }  
		} 
		else
		{  
	      System.out.println("Age must be greater than 18");  
	    }  
	}
	public static void main(String[] args) {
		Ageblood  obj = new Ageblood ();
		obj.meth1(25,60);
	}
}  
