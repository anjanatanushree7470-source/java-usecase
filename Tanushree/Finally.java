package Tanushree;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100/10;
			
			
			System.out.println(a);
		}
		 catch(Exception e)
		{
			System.out.println("exception occured");
		}
		finally
		{
			System.out.println("finally blocks always executes");
		}

	}

}
