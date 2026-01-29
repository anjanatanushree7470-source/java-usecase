package Collection;

import java.util.ArrayList;
import java.util.List;

	import java.util.*;

	public class LinkedList
	{
	public static void main(String[] args)
		{
	List<String> patients=new ArrayList<>();
	
			patients.add("Teaasa");
			patients.add("Tanushree");
			patients.add("Asur");
			patients.addFirst(" Emergency Kanha");
			patients.addLast("Himanshu");
			
			
			System.out.println("Patient List:"+patients);
			System.out.println("First Patient :" +patients.getFirst());
			System.out.println("last Patient :" +patients.getLast());
			System.out.println("Is Asur present? " +patients.contains("Asur"));
			System.out.println("Treated patient"+patients.removeFirst());
			patients.remove("Asur");
			System.out.println("Total Remaining Patients: " + patients.size());
			
			System.out.println("updated List: ");
			for(String patient:patients) {
				System.out.println(patients);
			}
		}
	 
	

}
