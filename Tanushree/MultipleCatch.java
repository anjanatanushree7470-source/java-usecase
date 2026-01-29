package Tanushree;

public class MultipleCatch {
	
	public static void main(String[] args) {
		try {
			int[] a= {12,23,23};
			System.out.println(a[5]);
		  }
		catch(ArithmeticException e){
			
			System.out.println("Arithmetic Exception occured");
		}
catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Array index out of bound");
		}
catch(Exception e){
			
			System.out.println("generic Exception occured");
		}
		
	}

}
