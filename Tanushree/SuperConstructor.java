package Tanushree;


class Parent
{
	Parent()
	{
		System.out.println("Parent Class Constructor");
	}
}
public class SuperConstructor extends Parent
{
	 SuperConstructor()
	{
	super();
	System.out.println("Child class constructor");
	}
	
public static void main(String[] args)
{
	 SuperConstructor a1 = new  SuperConstructor();
}
}
 
 



