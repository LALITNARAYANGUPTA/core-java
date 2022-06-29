package Encapsulation;
import java.util.*;
public class Encapsulation2 {
void display()
{
	Scanner sc = new Scanner(System.in);
	Encapsulation1 eobj= new Encapsulation1();
	System.out.println("enter  your rollnumber");
	eobj.setStudentrollnumber(sc.nextInt());
	System.out.println("enter your name");
	eobj.setStudentname(sc.next());
	System.out.println("Rollnumber:"+eobj.getStudentrollnumber());
	System.out.println("Name:"+eobj.getStudentname());
	sc.close();
	}
public static void main(String[] args) {
	new Encapsulation2().display();
}
}
