package encapsulation;

public class Mobile 
{
	String Brand;
	double price;
	String color;
	int ram;
	int hd;
	int cam;
	String processer;
	int sim;
	int Battery;
	
	Sim s1=null;
	
	Mobile(){}
	
	Mobile(String Brand,double price,String color,int ram,int hd,int cam,String processer,int sim,int Battery)
	{
		this.Brand=Brand;
		this.price=price;
		this.color=color;
		this.ram=ram;
		this.hd=hd;
		this.cam=cam;
		this.processer=processer;
		this.sim=sim;
		this.Battery=Battery;
		
	}
	public void insertSim(String Service,String Type,String size,double no) 
	{
		s1=new Sim("jio","4g","nano",8087213448l);
		System.out.println("Sim inserted Successfully");
		
	}
	public void displaymobile()
	{
		
		System.out.println("Brand :"+Brand);
		System.out.println("Price :"+price);
		System.out.println("color :"+color);
		System.out.println("Ram :"+ram);
		System.out.println("Harddisk :"+hd);
		System.out.println("Camera :"+cam);
		System.out.println("Processer :"+processer);
		System.out.println("Sim :"+sim);
		System.out.println("Batery :"+Battery);
		System.out.println("==========================");
		
	}

}
