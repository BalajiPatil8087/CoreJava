package Arralist;
import java.util.ArrayList;

public class A4 
{
	public static void main(String[] args)
	{
		ArrayList a4=new ArrayList();
		
		a4.add("sagar");
		a4.add(43.8);
		a4.add('z');
		a4.add(7);
		a4.add(false);
		
		
		System.out.println(a4);
		
		
		
		
		a4.iterator();
		System.out.println(a4);

		a4.get(4);
		System.out.println(a4);
		
		a4.addAll(a4);
		System.out.println(a4);
		
		a4.clone();
		System.out.println(a4);
		
		
		
		a4.ensureCapacity(2);
		System.out.println(a4);
		
		
		a4.clear();
		System.out.println(a4);
		
	}

}
