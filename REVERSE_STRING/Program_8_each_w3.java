package REVERSE_STRING;
public class Program_8_each_w3{
	String meth1(String str)
	{
		String arr[] = str.split(" ");
		String s=" ";
		for(String w :arr)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse(); 
			s=s+sb.toString()+" ";
		}
		return s;
		
	}
	public static void main(String[] args) {
		Program_8_each_w3 obj= new Program_8_each_w3();
		String st  ="lalit narayan gupta";
		String result=obj.meth1(st);
		System.out.println(result);
	}
}