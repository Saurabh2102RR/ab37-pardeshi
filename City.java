//Manish Sir
package saurabh;
interface Country
{
	void countrycollection();//abstract method

}
abstract class State implements Country
{
	abstract void state_roads();//abstract method
	void statecollection()//concrete method
	{
		System.out.println("state collection for this month is 90");
	}
	static void statecollection1()
	{
		System.out.println("state collection for this month is 190");
	}
}

public class City extends State
{

	public static void main(String[] args) 
	{
		City c1=new City();
		c1.state_roads();
		c1.countrycollection();
		c1.statecollection();
		statecollection1();

	}

	
	public void countrycollection() 
	{
		System.out.println("logic 1");
		
	}
	void state_roads() 
	{
		System.out.println("logic 2");
		
		
	}

}
