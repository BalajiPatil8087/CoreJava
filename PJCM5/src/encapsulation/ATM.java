package encapsulation;

public class ATM {
	private String name;
	private String location;
	private double money;
	private int id;
	
	ATM(){}
	
	ATM(String name,String location,double money,int id)
	{
		this.name=name;
		this.location=location;
		this.money=money;
		this.id=id;
				
	}
	public String getname()
	{
		return name;
	}
	public String getlocation()
	{
		return location;
	}
	public String getBalance(long accno,int pin)
	{
		long acno=12345678l;
		int pin1=1234;
		
		String bal="5000.00";
		if (accno==acno && pin==pin1) 
		{
			return bal;
			
		}
		return "Invalid credential...retry";
	}
	public void setmoney(long accno,int pin,double amount)
	{
		long acno=12345678l;
		int pin1=1234;
		if (accno==acno && pin==pin1) 
		{
			


			System.out.println("Login succesful");
			if (amount<=money) 
			{
				money=(money-amount);
				System.out.println("Withdraw suceesful");
				
			}
			else
			{
				System.out.println("No cash");
			}
		}
	else
	{
		System.out.println("Invalid credential");
	}
}
}
	
		
			
			
			
		
		
	
	
	


