package Object;

public class Student 
{
	String name;
	String college;
	int id;
	String branch;
	String gender;
	
	Student(){}
	
	Student(String name,String college,int id,String branch,String gender)
	{
		this.name=name;
		this.branch=branch;
		this.college=college;
		this.id=id;
		this.gender=gender;
		
	}
	public void displayStudent()
	{
		System.out.println(name);
		System.out.println(branch);
		System.out.println(college);
		System.out.println(id);
		System.out.println(gender);
	}
	public String toString()
	{
		return "[Name : "+name+" College : "+college+"  Branch : "+branch+" ID : "+id+" Gender : "+gender+"]";
		
	}

}
