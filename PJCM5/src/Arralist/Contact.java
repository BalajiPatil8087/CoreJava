package Arralist;

public class Contact 
{
	    String Name;
		long Phno;
		String Location;
		String Email;
		
		Contact(){}
		
		Contact(String Name,long phno,String Location,String Email)
		{
			this.Name=Name;
			this.Phno=phno;
			this.Location=Location;
			this.Email=Email;
		}
		public String toString()
		{
			return "("+Name+ "---> +Phno)";
		
		}
		
		
}


