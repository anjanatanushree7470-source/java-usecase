package Collection;
import java.util.*;
import java.util.Map;

public class MapExample {
public static void main(String[] args) {
Map<Integer,String>Employee=new HashMap<>();
//HashMap<Integer,String>Employee=new HashMap<>();
//HashMap<Integer,String>Employee=new HashMap();
	Employee.put(101, "Sawan");
	Employee.put(102, "Tanushree");
	//System.out.println(Employee);
	Employee.put(103, "Anjali");
	System.out.println(Employee);

	
	String EmployeeName=Employee.get(102);
	System.out.println("Value of key 102:"+EmployeeName);
	System.out.println("Contains key 101?"+Employee.containsKey(101));
	System.out.println("Contains value Sawan?"+Employee.containsValue("Sawan"));
	
	Set<Integer>Keys=Employee.keySet();
	System.out.println("All keys:"+Keys);
}
}
