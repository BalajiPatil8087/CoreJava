package inheritance;

public class Y extends X
{
	int s=10;
	
	public void abc()
	{
		System.out.println(s);
		System.out.println(super.s);
		super.abc();
	}

}
