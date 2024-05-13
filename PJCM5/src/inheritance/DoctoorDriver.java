//class cast exception
package inheritance;

public class DoctoorDriver 
{
	public static void main(String[] args) 
	{
		Doctor d1=new Doctor();
		Orthopedic o1=(Orthopedic)d1;
		o1.displayOrthopedic();
		o1.displayDoctor();
		
	}

}
