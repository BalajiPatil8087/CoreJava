package inheritance;

public class Engineering 
{
	String Degree;
	String Branch;
	String University;
	double aggrigate;
	int yop;
	
	Engineering(){}
	
	Engineering(String Degree,String Branch,String University,double Aggrigate,int yop)
	{
		this.Degree=Degree;
		this.Branch=Branch;
		this.University=University;
		this.aggrigate=Aggrigate;
		this.yop=yop;
		
	}
	public void displayEngineering()
	{
		System.out.println("Degree :"+Degree);
		System.out.println("Branch :"+Branch);
		System.out.println("University :"+University);
		System.out.println("Aggrigate :"+aggrigate);
		System.out.println("Yop :"+yop);
	}

}
