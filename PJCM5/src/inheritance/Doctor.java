package inheritance;

public class Doctor
{
	String name;
	String Degree;
	long lic;
	double fee;
	String time;
	String hospital;
	double exp;
	
	Doctor(){}
	
	Doctor(String name,String Degree,long lic,double fee,String time,String hospital,double exp)
	{
		super();
		this.name=name;
		this.Degree=Degree;
		this.lic=lic;
		this.fee=fee;
		this.time=time;
		this.hospital=hospital;
		this.exp=exp;
		
	}
	public void displayDoctor()
	{
		System.out.println("Name :"+name);
		System.out.println("Degree :"+Degree);
		System.out.println("Llicence :"+lic);
		System.out.println("Fee :"+fee);
		System.out.println("Time :"+time);
		System.out.println("Hospital :"+hospital);
		System.out.println("Exp :"+exp);
	}

}
