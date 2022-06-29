package ControlStatment;
public class Switch1 
{
void meth1(int a ,int b,char op)
{
	switch(op)
	{
	case'+':
		System.out.println("Addition value:"+(a+b));
		break;
	case'-':
	    System.out.println("Substration value:"+(a-b));
	    break;
	case'*':
		System.out.println("Multiplication value:"+(a*b));
		break;
	case '/':
		System.out.println("Division value:"+(a/b));
		break;
	default :
		System.out.println("Invalid input");
		break;
	}
}
public static void main(String[] args) 
{
	new Switch1().meth1(10,20,'*');
}
}