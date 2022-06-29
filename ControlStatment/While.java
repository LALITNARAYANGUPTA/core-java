package ControlStatment;
public class While 
{
void  meth1(int n)
{
	int i=1,r = 0;
	System.out.println("Table of "+n);
	while(i<=10)
	{
		 r=n*i;
		 System.out.println(r);
		 i++;
	}
}
public static void main(String[] args) {
	While obj = new While();
	obj.meth1(19);
}
}
