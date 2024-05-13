package Object;

public class Studentt 
{
	String name;
	String college;
	int id;
	String branch;
	String gender;
	
	Studentt(){}
	
	Studentt(String name,String college,int id,String branch,String gender)
	{
		this.name=name;
		this.college=college;
		this.id=id;
		this.branch=branch;
		this.gender=gender;
		
		
	}
	public void displayStudentt()
	{
		System.out.println(name);
		System.out.println(college);
		System.out.println(id);
		System.out.println(branch);
		System.out.println(gender);
	}
	public boolean equals(Studentt o)
	{
		Studentt ip=(Studentt)o;
		if (this.name==ip.name && this.college==ip.college && this.branch==ip.branch && this.id==ip.id && this.gender==ip.gender ) 
		{
			return true;
			
		}
		return false;
		
		
		
	}

}
