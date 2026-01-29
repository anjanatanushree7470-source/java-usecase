package Collection;
import java.util.HashSet;
class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Patient patient = (Patient) obj;
        return id == patient.id;
    }

    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "patient id: " + id + ", name: " + name;
    }
}
public class HospitalSystem {
	public static void main(String[] args) {

        HashSet<Patient> patients = new HashSet<>();

        patients.add(new Patient(101, "ravi"));
        patients.add(new Patient(102, "anita"));
        patients.add(new Patient(103, "ravi")); 

        System.out.println("registered patients:");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
}
