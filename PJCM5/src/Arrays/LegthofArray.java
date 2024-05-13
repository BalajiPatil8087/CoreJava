package Arrays;


public class LegthofArray 
{
	public static void main(String[] args)
	{
		int [] a= new int[5];
	try 
	{
		a[0]=1;
		a[1]=9;
		a[2]=4;
		a[3]=5;
		a[4]=8;
		a[5]=10;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		
	} catch (ArrayIndexOutOfBoundsException e) 
	{
	System.out.println("Please Enter valid length");
	}	
		
		System.out.println(a.length);
		
		
		
		
	
		
		
		
		
	}

}
