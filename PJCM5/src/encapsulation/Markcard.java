package encapsulation;

public class Markcard 
{
	 private String University;
       private String Collegename;
	 String name;
	 int Rollno;
	  private int Schoolno;
	 int Centerno;
	int Chemmarks;
	int Phymarks;
	int mathsmarks;
	
	Markcard(){}
	Markcard(String University,String Collegename,String name,int Rollno,int Schoolno,int Centerno,int Chemmarks,int Phymarks,int mathsmarks)
	{
		this.University=University;
		this.Collegename=Collegename;
		this.name=name;
		this.Rollno=Rollno;
		this.Schoolno=Schoolno;
		this.Centerno=Centerno;
		this.Chemmarks=Chemmarks;
		this.Phymarks=Phymarks;
		this.mathsmarks=mathsmarks;
		
	}
	public String getUniversity()
	{
		return University;
	}
	public String getCollegename()
	{
		return Collegename;
	}
	public int getSchoolno()
	{
		return Schoolno;
	}
	public int getCenterno()
	{
		return Centerno;
	}
	public String setname(String name)
	{
		return name;
				

	}
	
	public void displaymarkcard()
	{
		
		
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+Rollno);
		System.out.println("Chemmarks :"+Chemmarks);
		System.out.println("phymarks: "+Chemmarks);
		System.out.println("mathsmarks :"+mathsmarks);
	}
	
	
	
}
	
	
	

	
	
	
	


