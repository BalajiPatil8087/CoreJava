package encapsulation;

public class Email 
{
	String name;
	String password;
	int userid;
	
	Email(){}
	
	Email(String name,String password,int userid)
	{
		this.name=name;
		this.password=password;
		this.userid=userid;
		
	}
	public String getname()
	{
		return name;
	}
	public String getpassword()
	{
		return password;
		
	}
	public String getlogin(String name,int pin)
	{
		String namee="sagarpatil";
		int pin1=8087;
		if (namee==name && pin==pin1) 
		{
			return "welcome to email..please log in to your account"
					+ "";
			
		}
		return "Please Enter valid password";
		
		
	}
	public void setlog(String name,int pin)
	{
		String namee="Sagarpatil";
		int pin1=8088;
		if (name==namee && pin==pin1) 
		{
			System.out.println("logged in");
			
		}
		else
		{
			System.out.println("invalid deatil");
		}
		
	}
	
}
