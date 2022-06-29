package ControlStatment;
public class If_else2 
{
 void meth1(int marks) 
 {
	 if(marks<40)
	 {  
	 System.out.println("fail");  
	 }
	 else if(marks>=40 && marks<50)
     {  
	 System.out.println("E grade");  
	 }   
     else if(marks>=50 && marks<60)
     {  
	 System.out.println("D grade");  
	 }  
	 else if(marks>=60 && marks<70)
	 {  
	 System.out.println("C grade");  
     }  
	 else if(marks>=70 && marks<80)
	 {  
	 System.out.println("B grade");  
	 }  
	 else if(marks>=80 && marks<90)
	 {  
	 System.out.println("A grade");  
	 }
	 else if(marks>=90 && marks<100)
	 {  
	 System.out.println("A+ grade");  
	 }
	 else
	 {  
	 System.out.println("Invalid!");  
	 } 
	} 
 public static void main(String[] args) {
	 If_else2 obj = new If_else2();
	 obj.meth1(86);
}
}
