package Tanushree;

public class ThrowExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   try {
		int bal=1000;
		if(bal <5000)
		{
			throw new Exception("Insufficient bal");
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
	}
	 
