package ControlStatment;
public class If_else1 
{
	void meth1(int n)
	{
		if(n%2==0)
		{
			System.out.println("even number");
		}
		else
	    {  
	        System.out.println("odd number");  
	    }  
	}
	public static void main(String[] args) 
	{   
		If_else1 obj = new If_else1();
		obj.meth1(13);
	    
	}  
}
