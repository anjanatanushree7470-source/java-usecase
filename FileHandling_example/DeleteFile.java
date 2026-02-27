package FileHandling_example;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("Tech.txt");
		
		if(f.delete())
	{
		System.out.println("File deleted Successfully");
	}
	else
	{
		System.out.println("File not found");
	 
	}

	}

}
