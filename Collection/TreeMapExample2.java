package Collection;

import java.util.*;
import java.util.TreeMap;


public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer,String>patient=new TreeMap<>();
		//HashMap<Integer,String>Employee=new HashMap<>();
		//HashMap<Integer,String>Employee=new HashMap();
			
	
		    patient.put(101, "Sawan");
			patient.put(102, "Tanushree");
			patient.put(103, "Anjali");
			
			
			System.out.println("all patients:"+patient);
			System.out.println("patient updated :" +patient.put(102,"Tanushree Anjana"));
			System.out.println("patient found :" +patient.get(102));
		    System.out.println("patient removed :"+patient.remove(103));
			Map<Integer,String>Keys=patient;
			System.out.println("All Patients:"+Keys);
			System.out.println("patient exist?"+patient.containsKey(101));
			System.out.println("patient count :"+patient.size());
			patient.clear();
			System.out.println("after patient clearing :"+patient);
			
			
			
			
	}

}
