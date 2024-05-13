package polymorphism;

public class SubDriver 
{
	public static void main(String[] args)
	{
		Super s1=new Sub();
		System.out.println(s1.a);
		System.out.println(s1.s);
		
	}

}
