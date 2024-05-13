package encapsulation;

public class Rifile 
{
	String Brand;
	String Type;
	Float size;
	String Style;
	String ink;
	String color;
	
	Rifile(){}
	
	Rifile(String Brand,String type,Float size,String Style,String ink,String color)
	{
		this.Brand=Brand;
		this.Type=type;
		this.size=size;
		this.Style=Style;
		this.ink=ink;
		this.color=color;
		
	}
	public void displayRifile()
	{
		System.out.println("Brand :"+Brand);
		System.out.println("Type :"+Type);
		System.out.println("size :"+size);
		System.out.println("Style :"+Style);
		System.out.println("ink :"+ink);
		System.out.println("color :"+color);
	}
	
	

}
