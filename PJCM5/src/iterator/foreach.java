
//for each loop
package iterator;
import java.util.HashSet;

public class foreach 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> a=new HashSet<Integer>();
		
		a.add(1);
		a.add(350);
		a.add(345);
		a.add(23);
		System.out.println(a);
		for (Integer i : a) 
		{
			System.out.println(i);
			
		}
		
	}

}
