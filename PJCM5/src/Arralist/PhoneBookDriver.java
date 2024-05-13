package Arralist;
import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBookDriver 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add(new Contact("zattu",7744091042l,"satara","zattu@gmail.com"));
		a1.add(new Contact("fokya",8698221812l,"pune","fokya@gmail.com"));
		a1.add(new Contact("chotya",7744091048l,"kolhapur","chotya@gmail.com"));
		
		System.out.println(a1);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a contact detils");
		String intput=s.next();
		
		int i;
		
		for ( i = 0; i < a1.size(); i++) 
		{
			Object o=a1.get(i);
			Contact c=(Contact)o;
			if (c.Name.equals(intput)) 
			{
				System.out.println("Contact found");
				System.out.println(c);
				
				
				System.out.println("1.call");
				System.out.println("2.Message");
				break;
				
			}
			
			
		}
		if(i==a1.size())
		{
			System.out.println("contact not found");
		}
	}

}
