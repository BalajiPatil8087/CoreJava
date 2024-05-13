package Collections;
import java.util.ArrayList;
import java.util.*;
import java.util.Collection;


public class GC2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<>();
		a1.add("India");
		a1.add("Pakistan");
		a1.add("China");
		a1.add("Russia");
		a1.add("Singapore");
		System.out.println(a1);
		
		 
		
	        
	     Collections.shuffle(a1);
		System.out.println(a1);
		
		Collections.reverse(a1);
		System.out.println(a1);
		
		
	
		
		
	}

}
