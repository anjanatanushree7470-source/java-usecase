package Tanushree;

public class TryCatchExamople {

	public static void main(String[] args)
	{
	 
	try {
			int a=10;
			int b=0;
			int result=a/b;
			System.out.println(result);
		}
		 catch(ArithmeticException tanu)
		{
			System.out.println("Cannot divide by zero");
		}
	System.out.println("Program continue...");
	}
	}
