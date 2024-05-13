package iterator;
import java.util.HashSet;
import java.util.Iterator;

public class Itertator 
{
	public static void main(String[] args) 
	{
		HashSet <Integer> h1=new HashSet<Integer>();
		
		h1.add(1);
		h1.add(34);
		h1.add(305);
		h1.add(23);
		
		System.out.println(h1);
		
		Iterator i1=h1.iterator();
		while (i1.hasNext())
		{
		System.out.println(i1.next());
			
		}
		
	}

}
