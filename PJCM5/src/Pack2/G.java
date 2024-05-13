
// Protected keyword access package to another package
package Pack2;
import Pack1.E;

public class G extends E 
{
	public static void main(String[] args) 
	{
		 System.out.println(s);
		G g1=new G();
		g1.a();
		
		System.out.println(g1.c);
	}

}
