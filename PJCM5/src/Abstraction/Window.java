package Abstraction;

public class Window extends Calculator
{
	public void add(int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	public void sub(int a,int c)
	{
		int res=a-c;
		System.out.println(res);
	}
	public void mul(int c,int d)
	{
		int res=c*d;
		System.out.println(res);
	}
	public void div(double e,double f)
	{
		 double res=e/f;
		System.out.println(res);
	}


}
