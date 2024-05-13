package encapsulation;

public class Pen 
{
	Float width;
	String Style;
	String color;
	String pattern;
	int price;
	Rifile r1=new Rifile("Cello","pointpen",5.51f,"gel","Pen ink","Blue");
	
	Pen(){}
	
	Pen(Float width,String Style,String color,String pattern,int price)
	{
		this.width=width;
		this.Style=Style;
		this.color=color;
		this.pattern=pattern;
		this.price=price;
		
	}
	public void displayPen()
	{
		System.out.println("width :"+width);
		System.out.println("Style :"+Style);
		System.out.println("color :"+color);
		System.out.println("pattern :"+pattern);
		System.out.println("price :"+price +"RS");
	}
		
}


