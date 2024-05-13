package encapsulation;

public class PenDriver
{
	public static void main(String[] args) 
	{
		Pen p1=new Pen(1.1f,"Pointpen","white","ButterFlow",10);
		p1.displayPen();
		
		System.out.println("================");
		p1.r1.displayRifile();
		
		Pen p2=new Pen(1.1f,"Pointpen","Black","ButterFlow",15);
		System.out.println("=================");
		p2.displayPen();
		
		System.out.println("================");
		p2.r1.displayRifile();
		
		
	}

}
