
// default keyword  access using package to package
package Pack2;
import Pack1.C;

public class P extends C 
{
	public static void main(String[] args) 
	{
		System.out.println(C.s);//CTE
		
		C c1=new C();
		System.out.println(C1.c);//CTE
		
	}

}
