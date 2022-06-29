package ControlStatment;
public class For1 
{
void display(int n)
{
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println( );
	}
}
public static void main(String[] args) 
{
	For1 obj = new For1();
	obj.display(5);
}
}
