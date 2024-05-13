package inheritance;

public class SoftwareEngineering extends Engineering
{
	String Skill;
	String Company;
	int exp;
	
	
	SoftwareEngineering(){}
	
	SoftwareEngineering(String Degree,String Branch,String University,double aggrigate,int yop,String skill,String company,int exp)
	{
		this.Degree= Degree;
		this.Branch=Branch;
		this.University=University;
		this.aggrigate=aggrigate;
		this.yop=yop;
		this.Skill=skill;
		this.Company=company;
		this.exp=exp;
		
		
		
	}
	public void displaySoftwareEngineering()
	{
		displayEngineering();
		System.out.println("Skill :"+Skill);
		System.out.println("Company :"+Company);
		System.out.println("Exp :"+exp);
	}

}
