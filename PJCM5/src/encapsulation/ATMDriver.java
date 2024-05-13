package encapsulation;

public class ATMDriver 
{
	public static void main(String[] args)
	{
		ATM a1=new ATM("SBI","Deccan",50000.00,1234);
		System.out.println(a1.getname());
		System.out.println(a1.getlocation());
	
		System.out.println(a1.getBalance(1234567l, 1234));
		a1.setmoney(12345678l, 1234, 10000.00);
	}
	
	

}

