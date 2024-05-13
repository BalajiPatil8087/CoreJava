package Interface;

public class ABDriver 
{
	public static void main(String[] args) 
	{
		A a1=(String s)->{
			
		System.out.println("Writing with lambda function");
		System.out.println(s);
		
		};
		a1.abc("I am tejus");
		
	}

}
