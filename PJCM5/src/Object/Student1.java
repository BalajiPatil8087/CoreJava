package Object;

public class Student1 
{
	String name;
	String College;
	int id;
	String Branch;
	String gender;
	
	
	Student1(){}
	
	
	Student1(String name,String College,int id,String Branch,String gender)
	{
		this.name=name;
		this.College=College;
		this.id=id;
		this.Branch=Branch;
		this.gender=gender;
		
	}
	public void display()
	{
		System.out.println(Branch);
		System.out.println(College);
		System.out.println(id);
		System.out.println(Branch);
		System.out.println(gender);
	}
	public boolean equal(Object o)
	{
		Student1 ip=(Student1)o;
		if (this.name==ip.name && this.College==ip.College && this.id==ip.id && this.Branch==ip.Branch && this.gender==ip.gender)
		{
			return true;
			
			
		}
		return false;
		
	}
	public int hashcode()
	{
		int hc=0;
		hc=hc+id;
		hc=hc+name.hashCode()+College.hashCode()+Branch.hashCode()+gender.hashCode();
		return hc;
	}

}
