package REVERSE_STRING;

public class Program_5 {
void meth1(String str) {
	StringBuffer sbr = new StringBuffer(str);
    sbr.reverse();
    System.out.println(sbr);
}
public static void main(String[] args) {
	Program_5 obj = new Program_5();
	obj.meth1("lalit gupta");
}
}
