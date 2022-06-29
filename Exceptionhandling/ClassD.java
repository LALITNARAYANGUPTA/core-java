package Exceptionhandling;
import java.io.FileInputStream;
public class ClassD {
int avl_amt=10000;
void with_draw(int wd_amt)
{
	if(avl_amt<wd_amt)
	{
		throw new RuntimeException("insufficient fund");
	}
	else
	{
		System.out.println("transaction suceesfull");
	}
}
	void meth2()throws Exception
	{
		FileInputStream fis= new FileInputStream
		("C:\\Users\\LALIT NARAYAN GUPTA\\Desktop\\FULL STACK COURSE\\file2.txt");
		fis.close();	
}
	public static void main(String[] args) throws Exception {
		ClassD obj = new ClassD();
		obj.with_draw(5000);
		obj.meth2();
	}
}