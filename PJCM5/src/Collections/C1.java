package Collections;
import java.util.ArrayList;

public class C1 
{
	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		
		al1.add(1);
		al1.add("hii");
		al1.add(true);
		al1.add('A');
		al1.add(3.14);
		
		System.out.println(al1);
		
		al1.add(2,"bye");
		al1.remove(true);
		
		System.out.println(al1);
		
		
	}

}
