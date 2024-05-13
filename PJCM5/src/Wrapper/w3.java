package Wrapper;

public class w3 
{
	public static void main(String[] args)
	{
		int a=100;
		Integer i=a;//AutoBoxing
		System.out.println(a);
		System.out.println(i.toString());
		
		int b=i;//UnBoxing
		//System.out.println(b.toString());//CTe
		System.out.println(b);
		
		
		char c='x';
		char e=c;//AutoBoxing
		System.out.println(c);
		System.out.println(e);
		
		char f=c;//Auto unBoxing
		//System.out.println(f.toString());//cte
		System.out.println(f);
		
		double d=3.14;
		double x=d;//Auto boxing
		System.out.println(x);
		System.out.println(d);
		
		double p=x;//Auto unBoxing
		//System.out.println(p.toString());..ete
		System.out.println(p);
		
	}

}
