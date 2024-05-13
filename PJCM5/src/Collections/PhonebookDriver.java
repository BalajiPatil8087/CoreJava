package Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class PhonebookDriver
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		
		a1.add (new Contacts("Guldu",80872348l,"Deccan","Guldu@gmail.com"));
		
		a1.add (new Contacts("dinga",123456l,"pune","dinga@gmail.com"));
		
		a1.add (new Contacts("paru",7709003448l,"Mumbai","paru@gmail.com"));
		
		//System.out.println(a1);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a contact details");
		String input=s.next();
		
		int i;
		for ( i = 0; i < a1.size(); i++) 
	{
			Object o=a1.get(i);
			Contacts c=(Contacts) o;
			
		
		if (c.Name.equals(input)) 
		{
		   System.out.println("Contact found");	
		   System.out.println(c);
		   
		   System.out.println("1. call");
		   System.out.println("2. Message");
		   break;
		}
	}
		if (i==a1.size()) 
		{
			System.out.println("Contact Not Found");
			
		}
		
	}

}
