package Collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String>cities=new TreeSet<>();
		cities.add("delhi");
		cities.add("mumbai");
		cities.add("chennai");
		cities.add("mumbai");
		//cities.add(null);
		
		System.out.println(cities);
	}
	

}
