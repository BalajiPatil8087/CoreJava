package practice;
import java.util.Scanner;
public class power {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Base: ");
		int base=s.nextInt();
		System.out.println("Enter A Power");
		int power=s.nextInt();
		int pow=1;
		for(int i=1;i<power;i++) {
			pow=pow*i;
			System.out.println(pow);
		}
		
	}

}
