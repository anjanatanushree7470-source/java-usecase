package Tanushree;
import java.util.Scanner;
public class ATMCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int orgPin = 1234;
		
			
		try {		
			System.out.println("Enter your Pin :");
			int pin = sc.nextInt();
		  if(pin == orgPin) {		  
			  System.out.println("not matched ");
			
		  }
		}catch(Exception e) {
			System.out.println("Wrong Input  Please try Again" + e);
			sc.next();
		}
		finally{
			System.out.println("Logged Completed");
			
		}
		}
	
	}