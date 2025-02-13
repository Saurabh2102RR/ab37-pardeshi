//multiple level inheritance from interface
package saurabh;
interface State_tax
{
	void state_ittax();
	void state_gsttax();
}
interface Country_tax
{
	void country_ittax();
	void country_gsttax();
}

public class City_Class implements State_tax,Country_tax
{
	public static void main(String[] args) 
	{
		City_Class c1=new City_Class();
		c1.country_gsttax();
		c1.country_ittax();
		c1.state_gsttax();
		c1.state_ittax();
	}
	public void state_ittax() 
	{
		System.out.println("State it tax collection");
		
	}
	public void state_gsttax() 
	{
		System.out.println("State GST tax collection");
		
	}	
	public void country_ittax() 
	{
		System.out.println("Country IT tax collection");
		
	}	
	public void country_gsttax() 
	{
		System.out.println("Country GST tax collection");
		
	}

}
