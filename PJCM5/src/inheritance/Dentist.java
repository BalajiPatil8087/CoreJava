package inheritance;

public class Dentist extends Doctor
{
	String spe;
	String organ;
	
	Dentist(){}
	
	Dentist(String name,String Degree,long lic,double fee,String time,String hospital,double exp,String spe,String organ)
	{
		super(name,Degree,lic,fee,time,hospital,exp);
		this.spe=spe;
		this.organ=organ;
		
	}
	public void displayDentist()
	{
		displayDoctor();
		System.out.println("Specilization :"+spe);
		System.out.println("Organ :"+organ);
	}

}
