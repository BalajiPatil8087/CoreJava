package Wrapper;

public class Unboxing 
{
	public static void main(String[] args) 
	{
		int a=100;
		Integer i=new Integer(a);//boxing
		int b=i.intValue();//unboxing
		System.out.println(b);
		
	}

}
