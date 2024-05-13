package Wrapper;

public class w2 
{
	public static void main(String[] args) 
	{
		int a=100;
		Integer i1=new Integer(a);//boxing
		int b=i1.intValue();//unboxing
		System.out.println(b);
		
		
		double d=3.14;
		Double d1=new Double(d);//boxing
		double c=d1.doubleValue();//un boxing
		System.out.println(c);
		
		
		boolean e=true;
		Boolean f1=new Boolean(e);
		boolean g=f1.booleanValue();
		System.out.println(g);
		
	}

}
