package REVERSE_STRING;
public class Program_7_each_w2 {
	String meth1(String str)
	{
		String [] arr = str.split(" ");
		String s="";
		for(String w:arr)
		{
			String str2="";
		for(int i=w.length()-1;i>=0;i--)
		{
			str2=str2+w.charAt(i);
		}
		s=s+str2+" ";
		}
		return s;
	}
	public static void main(String[] args) {
		Program_7_each_w2 obj = new Program_7_each_w2();
		String st  ="lalit narayan gupta";
		String result=obj.meth1(st);
		System.out.println(result);
	}

}
