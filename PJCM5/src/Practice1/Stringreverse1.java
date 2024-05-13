package Practice1;

import java.util.Scanner;

public class Stringreverse1 
{
   public static void main(String[] args) 
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter a string");
	   String sen=s.nextLine();
	   String rev= Reverse (sen);
	   System.out.println(rev);
	  
	
   }
   public static String Reverse(String sen)
   {
	   if (sen.isEmpty()) 
	   {
		 return sen;
	   }
	   else
	   {
		   return Reverse(sen.substring(1))+sen.charAt(0);
		  
	   }
	   
   }

}
