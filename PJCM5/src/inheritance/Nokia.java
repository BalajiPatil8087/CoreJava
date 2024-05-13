package inheritance;

public class Nokia extends Mobile
{
	String display_type;
	String Technology;
	
	Nokia(){}
	
	Nokia(String Brand,double price ,int ram,double processor,int camera,String display_type,String Technology)
	{
		super(Brand,price,ram,processor,camera);
		
		this.display_type=display_type;
		this.Technology=Technology;
		
	}
	public void displayNokia()
	{
		displayMobile();
		System.out.println("Display_Type :"+display_type);
		System.out.println("Technology :"+Technology);
	}

}
