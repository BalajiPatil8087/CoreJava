package inheritance;

public class Mobile 
{
	String Brand;
	double price;
	int ram;
	double processer;
	int camera;
	
	Mobile(){}
	
	Mobile(String Brand,double price,int ram,double processor,int camera)
	
	{
		super();
		this.Brand=Brand;
		this.price=price;
		this.ram=ram;
		this.processer=processor;
		this.camera=camera;
		
	}
	public void displayMobile()
	{
		System.out.println("Brand :"+Brand);
		System.out.println("Price :"+price);
		System.out.println("Ram :"+ram);
		System.out.println("camera :"+camera);
	}

}
