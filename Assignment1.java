//Assignmnet
package saurabh;

interface Chennai
{
	void login();
}
interface Delhi
{
	void login1();
}
abstract class Mumbai implements Delhi,Chennai
{
	abstract void signin();
	abstract void signout();
}
public class Assignment1 extends Mumbai
{
public static void main(String[] args)
{
	Assignment1 a1=new Assignment1();
	a1.signin();
	a1.signout();
	a1.login();
	a1.login1();
}
void signin() 
{
	System.out.println("Logic1");
	
}
void signout() 
{
	System.out.println("Logic2");
}
public void login1() 
{
	System.out.println("Logic3");
}
public void login() 
{
	System.out.println("Logic4");
	
}
}
