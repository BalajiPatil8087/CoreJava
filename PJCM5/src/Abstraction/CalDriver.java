package Abstraction;

public class CalDriver 
{
	public static void main(String[] args)
	{
		Calculator w1=new Window();
		w1.add(10,5);
		w1.div(4,2);
		
		Calculator l2=new Linux();
		l2.add(10, 20);
		l2.div(4, 2);
		
	}

}
