package encapsulation;

public class Projector 
{
	String brand;
	float size;
	double price;
	String Projection_method;
	
	Projector(){}
	
	Projector(String brand,float size,double price,String Projection_method)
	{
		this.brand=brand;
		this.size=size;
		this.price=price;
		this.Projection_method=Projection_method;
	}
	public void displayProjector()
	{
		System.out.println("brand :"+brand);
		System.out.println("size :"+size);
		System.out.println("price :"+price);
		System.out.println("Projection_method :"+Projection_method);
		System.out.println("=======================");
	}
	

}
