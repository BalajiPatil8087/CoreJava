package inheritance;

public class Developer extends SoftwareEngineering
{
	String Language;
	double salary;
	
	Developer(){}
	
	Developer(String Degree,String Branch,String University,double aggrigate,int yop,String skill,String Company,int exp,String langauge,double salary)

	{
		this.Degree=Degree;
		this.Branch=Branch;
		this.University=University;
		this.aggrigate=aggrigate;
		this.yop=yop;
		this.Skill=skill;
		this.Company=Company;
		this.exp=exp;
		this.Language=langauge;
		this.salary=salary;
		
		
		
	}
	public void displayDeveloper()
	{
		displaySoftwareEngineering();
		System.out.println("Language :"+Language);
		System.out.println("Salary :"+salary);
	}
}
