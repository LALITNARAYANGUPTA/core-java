package ControlStatment;

public class If {
void meth1(int a)
{
	if(a>10)
	{
		System.out.println("a value is bigger then 10");
		if(a<10)
		{
			System.out.println("a value is lessor then 10");
		}
		if(a==10)
		{
			System.out.println("hahjsjs");
		}
		if(a<=10)
		{
			System.out.println("rfersdfd");
		}
	
	}
}
public static void main(String[] args) {
	new If().meth1(5);
}
}
