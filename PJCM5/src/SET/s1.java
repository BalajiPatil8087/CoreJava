package SET;
import java.util.HashSet;


public class s1 
{
    public static void main(String[] args) 
    {
    	HashSet<Integer> a=new HashSet<>();
    	a.add(1);
    	a.add(2);
    	a.add(3);
    	a.add(34);
    	a.add(1);
    	System.out.println(a);
    	
    	a.size();
    	System.out.println(a);
    	
    	a.addAll(a);
    	System.out.println(a);
    	
    	a.add(5);
    	System.out.println(a);
    
    	a.contains(6);
    	System.out.println(a);
    	
    	
    	
    	a.clear();
    	System.out.println(a);
    	
    	
	}
}
