package Collection;
import java.util.*;
public class comparable1 {
void meth1()
{
ArrayList<Integer>al = new ArrayList<Integer>();
al.add(10);
al.add(34);
al.add(14);
al.add(56);
al.add(65);
al.add(78);
al.add(17);
al.add(98);
al.add(94);
al.add(86);
al.add(34);
System.out.println(al);
Collections.sort(al);
System.out.println(al);
Collections.sort(al,Collections.reverseOrder());
System.out.println(al);
}
public static void main(String[] args) {
	comparable1 obj = new comparable1();
	obj.meth1();
}
}


