package TA;
	 
	import java.sql.*;
	 
	public class JDBC_Example {
	 
	public static void main(String[] args)
	{
		
	try {
		
	Class.forName("com.mysql.cj.jdbc.Driver"); // is a static method of the Class class used to load a class dynamically at runtime.
	
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeeees_db", "root", "Ajay@123");
	 
	Statement stmt=con.createStatement();
	 
	ResultSet rs=stmt.executeQuery(" select * from employee");
	System.out.printf("Employee_ID","First_Name","Last_Name","Gender", "Age", "Address", "Mobile_Number","Dept","Salary"); 
	
	while (rs.next())
	{
		System.out.println(rs.getInt("Employee_ID") + " " + rs.getString("First_Name")+" "+rs.getString("Last_Name") + " " +rs.getString("Gender") + " " +rs.getInt("Age") + " " +rs.getString("Address") + " " +rs.getInt("Mobile_Number") + " " +rs.getString("Dept") + " " +rs.getInt("Salary"));
	}
	con.close();
	}
		catch (Exception e)
	   {
			System.out.println(e);
	   }
	}
	 
	
}
