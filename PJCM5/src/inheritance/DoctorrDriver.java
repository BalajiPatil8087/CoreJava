//Upcasting and Downcasting
package inheritance;

public class DoctorrDriver
{
	public static void main(String[] args) 
	{
		Doctor d1=new Dentist("Govind","MBBS",123456l,500,"10-5","Govind smile care",4,"MD","teeth");
				d1.displayDoctor();//upcasting
				
		       
				
		         
		         Dentist d3=(Dentist)d1;
		         d3.displayDentist();
		         d3.displayDoctor();
		         
		         Doctor o1=new Orthopedic("Govind","MBBS",123456l,500,"10-5","Govind smile care",4,"MD","organ");
		         o1.displayDoctor();//upcasting
		         
		         Orthopedic o4=(Orthopedic)o1;
		         o4.displayDoctor();//downcasting
		         o4.displayOrthopedic();
	}
	

}
