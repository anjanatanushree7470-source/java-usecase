package FileHandling_example;
import java.io.File;
//import java.io.FileReader;
import java.io.IOException;
//import java.io.FileWriter;
//import java.io.BufferedReader;
public class FileCreation {
	
	
	public static void main(String[] args)
	{
	try {
		File file=new File("Tech.txt");
		
		if(file.createNewFile())
	{
		System.out.println("File created Successfully");
	}
	else
	{
		System.out.println("File alredy exists");
	 
	}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}
	}
	 
	
	 


