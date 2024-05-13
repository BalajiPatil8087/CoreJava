
//final with local variable
package Pack1;

public class f1 
{
	public static void main(String[] args) 
	{
		final int S =1234;
		System.out.println(S);
		
		S=12;//cte CANNOT ALTER FINAL
		System.out.println(S);
		
	}

}
