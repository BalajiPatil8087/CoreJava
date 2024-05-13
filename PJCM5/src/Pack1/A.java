//Private keyword  access class within same class
package Pack1;

public class A 
{
	private static int i=100;
	private double d=5.1;
	
	public static void main(String[] args) 
	{
		
		A a1=new A();
		System.out.println(a1.d);
		System.out.println(i);
		
	}

}
