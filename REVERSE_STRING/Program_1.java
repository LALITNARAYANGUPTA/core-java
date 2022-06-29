package REVERSE_STRING;
public class Program_1 {
	String s=" ";
	//void meth1(String str)
  String meth1(String str)
  {
	  for(int i=str.length()-1;i>=0;i--) 
	  {
		s=s+str.charAt(i); 
	  }
	  //System.out.println("Reverse order"+s);
	  return str+"|"+s;
  }
public static void main(String[] args) {
	Program_1 obj= new Program_1();
	//obj.meth1("lalit");
	String result =obj.meth1("lalit gupta");
	System.out.println(result);
}	
} 