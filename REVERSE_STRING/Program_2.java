package REVERSE_STRING;
public class Program_2 {
 void ReverseString(String str)
 {
	 StringBuilder sb = new StringBuilder(str);
	 //sb.append(str);
     sb.reverse();
     System.out.println(sb);
 }
 public static void main(String[] args) {
	 Program_2 obj = new Program_2 ();
	 obj.ReverseString("lalit gupta");
	 
}
}
