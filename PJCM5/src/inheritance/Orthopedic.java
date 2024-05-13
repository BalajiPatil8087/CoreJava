package inheritance;

public class Orthopedic extends Doctor
{
	String spe;
	String organ;
	
	Orthopedic(){}
	
	Orthopedic(String name,String degree,long lic,double fee,String time,String hospital,double exp,String spe,String organ)
	{
		super(name,degree,lic,fee,time,hospital,exp);
		this.spe=spe;
		this.organ=organ;
		
	}
	public void displayOrthopedic()
	{
		displayDoctor();
		System.out.println("Specilization :"+spe);
		System.out.println("Organ :"+organ);
	}
	

}
