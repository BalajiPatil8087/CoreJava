
//Default keyword access class within class
package Pack1;

public class C 
{
	static String s="hi";
	char c='a';
	
	public static void main(String[] args) 
	{
		System.out.println(s);
		
		C c1=new C();
		System.out.println(c1.c);
		
	}

}
