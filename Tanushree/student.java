package Tanushree;


	import java.util.Scanner;

	public class student {   
	    public static void main(String[] args) {

	    	
	        String name = args[0];
            int english = Integer.parseInt(args[1]);
            int maths = Integer.parseInt(args[2]);
	        
            System.out.println("Enter student name:"+name);
	        System.out.println("Enter marks in English:" +english);
	        System.out.println("Enter marks in Maths: "+maths);
	        int total = english + maths;
	        System.out.println("Total: "+total);
	        float percentage = total / 2.0f;
	        System.out.println("percentage: "+percentage);

	        char grade;
	        if (percentage >= 90) {
	            grade = 'A';
	        } else if (percentage >= 75) {
	            grade = 'B';
	        } else if (percentage >= 50) {
	            grade = 'C';
	        } else {
	            grade = 'F';
	        }
	        System.out.println("grade: "+grade);
	    }
	}
	
	/*package Sinha;
 
public class StudentScore {
 
	public static void main(String[] args) {
	String name=args[0];
        int Eng=Integer.parseInt(args[1]);
        int Maths=Integer.parseInt(args[2]);
 
        int Total=Eng+Maths;
        float Per=Total/2.0f;
 
        char grade;
 
        if(Per>=90)
            grade='A';
        else if(Per>=75)
            grade='B';
        else if(Per>=50)
            grade='C';
        else
            grade='F';
 
        System.out.println("Student: "+name);
        System.out.println("English: "+Eng);
        System.out.println("Maths: "+Maths);
        System.out.println("Total: "+Total);
        System.out.println("Percentage: "+Per+ "%");
        System.out.println("Grade: "+grade);
 
        Student S=new Student();
        S=null;
    }
}*/
 
	        

	        


