package Abstraction;

public  class Linux extends Calculator
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(int c,int d)
	{
		System.out.println(c-d);
	}
	public void mul(int p,int q)
	{
		System.out.println(p*q);
	}
	public void div(double a,double b)
	{
		System.out.println(a/b);
	}

}
