package REVERSE_STRING;
public class Program_6_each_w1 
{
	String meth1(String str)
	{
		String[] arr = str.split(" ");
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				s=s+arr[i].charAt(j);
			}
			s=s+" ";
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Program_6_each_w1 obj = new Program_6_each_w1();
		String str  ="lalit gupta";
		String result=obj.meth1(str);
		System.out.println(result);
}
}