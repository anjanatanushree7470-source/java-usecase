package Tanushree;
import java.util.*;
public class BnakLoanEligibilitySystemApp {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 //autoboxing
		 Integer age;
		 Integer CIBIL;
		 Double income;
		 
		 ArrayList<Double>incomelist=new ArrayList();
		 System.out.println("Enter ur age:");
		 age=sc.nextInt();	
		 System.out.println("Enter ur CIBIL Score:");
		 CIBIL=sc.nextInt();
		 System.out.println("Enter ur income:");
		 income=sc.nextDouble();
		 incomelist.add(income);
		 //unboxing
		 int age1=age;
		 int CIBILScore=CIBIL;
		double income1=incomelist.get(0);
		  if(age>=21 && CIBIL >=700&& income>=20000) {
			  System.out.println("you can apply for loan");
					 }
		  else {
			  System.out.println("you are not eligible");
				 	
		  }

	}

}
