package Arralist;
import java.util.ArrayList;
public class A1
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add(1);
		a1.add("Hii");
		a1.add(true);
		a1.add('A');
		a1.add(3.14);
		System.out.println(a1);
		
		
		a1.add(1,"bye");
		a1.remove(true);
		System.out.println(a1);
		
		a1.clone();
		System.out.println(a1);
		
		a1.iterator();
		System.out.println(a1);
		
		a1.lastIndexOf(4);
		System.out.println(a1);
		
		
		
		
	}

}
