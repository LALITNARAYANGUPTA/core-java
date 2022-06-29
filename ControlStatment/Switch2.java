package ControlStatment;

public class Switch2 
{
	void meth1(String levelString)
	{       
	    int level=0;  
	    switch(levelString)
	    {      
	    case "Beginner": 
	    	level=1;  
	    break;    
	    case "Intermediate":
	    	level=2;  
	    break;    
	    case "Expert": 
	    	level=3;  
	    break;    
	    default: 
	    	level=0;  
	    break;  
	    }    
	    System.out.println("Your Level is: "+level);  
	} 
	public static void main(String[] args) 
	{
		Switch2 obj = new Switch2();
		obj.meth1("  ");
	}
}
