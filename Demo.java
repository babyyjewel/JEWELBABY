import java.util.*;
class Demo
{
	public static void main(String args[])
	{
	try
	{	int a=42;
		int b=42/0;
		System.out.println(b);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Division by zero");
	}
	finally
	{	System.out.println("End");
		
	}
	}
}
	
