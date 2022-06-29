package REVERSE_STRING;
import java.util.*;
public class Program_4 {
 void meth1(String str)
 {
	 char arr[] =str.toCharArray();
	 ArrayList<Character> al = new ArrayList<>();
	 for(char c:arr)
	 {
		 al.add(c);
	 }
	 Collections.reverse(al);
	 System.out.println(al);
	 ListIterator <Character>li = al.listIterator();
	 while(li.hasNext())
	 {
		 System.out.print(li.next());
	 }
 }
 public static void main(String[] args) {
	 Program_4 obj = new  Program_4();
	 obj.meth1("lalit gupta");
}
}