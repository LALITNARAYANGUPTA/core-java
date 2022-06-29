package REVERSE_STRING;

public class Program_3 {
void meth1(String str)
{
	char[] arr = str.toCharArray();
	 for (int i = arr.length - 1; i >= 0; i--)
        System.out.print(arr[i]);
}
public static void main(String[] args) {
	Program_3 obj= new Program_3();
	obj.meth1("lalit narayan gupta");
}
}
