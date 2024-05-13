package inheritance;

public class MobileDriver 
{
	public static void main(String[] args)
	{
		
	
	    Mobile m1=new Mobile("xyz",15000.00,8,2.5,4);
	    m1.displayMobile();
	    
	    System.out.println("==============");
	    
	    Nokia n1=new Nokia("Nokia",15000.00,8,2.5,4,"GSM","IPS");
	    n1.displayNokia();
	    
	    System.out.println("===============");
	    
	    
	    Samsung s1=new Samsung("Samsung",25000.00,16,3.5,8,"GSM","IPS");
	    s1.displaySamsung();
	}

}
