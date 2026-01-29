package Collection;

import java.util.HashSet;
import java.util.Set;
 
public class HospitalSystem1
{
	private int patientId;
	private String name;
	private int age;

 
	public HospitalSystem1(int patientId, String name, int age)
	{
		this.patientId=patientId;
		this.name=name;
		this.age=age;
	}
public static void registraionPatient(HospitalSystem1 patient)
{
	Set<HospitalSystem1> patients=new HashSet<>();
 
	if(patients.contains(patient))
	{
		System.out.println("Patient ID" + patient.patientId + " is already registered");
	}
	else {
		patients.add(patient);
		System.out.println("Patient added to the System : " + patient);
	}
}
public static void displayPatient()
{
	System.out.println("List of Uniquie Registered Patients:");
	for(HospitalSystem1 p : patients) 
	{
		System.out.println(p);
	}
}
@Override
public boolean equals(Object obj)
{
	if(this==obj) return true;
	if(obj==null || getClass() != obj.getClass())return false;
HospitalSystem1 patient=(HospitalSystem1) obj;
return this.patientId==patient.patientId;
}
// 
public int hashCode() 
{
	return Integer.hashCode(patientId);
}
public String toString()
{
	return "Patient [ID=" + patientId + "Name=" + name + " Age=" + age + "]";
}
public static void main(String[] args) 
{
HospitalSystem1 p1= new HospitalSystem1(101, "Ravi", 30);
HospitalSystem1 p2= new HospitalSystem1(102, "Ram", 30);
HospitalSystem1 p3= new HospitalSystem1(103, "Ramesh", 30);
HospitalSystem1 p4= new HospitalSystem1(104, "Ramesh", 30);
 
registraionPatient(p1);
registraionPatient(p2);
registraionPatient(p3);
registraionPatient(p4);
 
}
}