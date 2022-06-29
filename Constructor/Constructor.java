package Constructor;
public class Constructor {
//void meth1()
//{
//	System.out.println("saturday");
//}
Constructor()
{
	System.out.println("sunday");
	new Constructor("monday");
}
Constructor(String s)
{
	System.out.println(s);
	new Constructor(10);
}
Constructor(int p)
{
	System.out.println("thusday");
	new Constructor(30,"java");
}
Constructor(int a,String d)
{
	System.out.println("wednusday");
	new Constructor('a');
}
Constructor(char c)
{
	System.out.println("thrusday");
	new Constructor(2000d);
}
Constructor(double d)
{
	System.out.println("friday");
	new Constructor(true);
}
Constructor(boolean v)
{
	System.out.println("Saturday");
}
public static void main(String[] args) {
	//Constructor obj= new Constructor();
	//obj.meth1();
	new Constructor();
	
}
}
