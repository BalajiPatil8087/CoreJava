package Wrapper;

public class w1 
{
	public static void main(String[] args) 
	{
		int a=100;
		
		Integer i1=new Integer(a);//boxing
		
		System.out.println(a);
		System.out.println(i1.toString());
		
		
		double d=3.14;
		Double d1= new Double(3.14);//Boxing
		System.out.println(d1.toString());
		
		byte b=4;
		Byte b1=new Byte(b);
		System.out.println(b1.toString());
		
		boolean c=true;
		Boolean b2=new Boolean(c);
		System.out.println(b2.toString());
		
		
		
	}

}
