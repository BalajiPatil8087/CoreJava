package GC;
import java.util.ArrayList;
import java.util.Package;

public class GC2
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList();
		
		a1.add("india");
		a1.add("pakistan");
		a1.add("China");
		a1.add("Russia");
		a1.add("Singapore");
		System.out.println(a1);
		Collection.sort(a1);
		System.out.println(a1);
		
	}

}
