package FileHandling_example;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("Tech.txt"));
		    String line=br.readLine();
		  
		    	System.out.println(line);
		    }
		catch(Exception e){
			e.printStackTrace();

	}
	}
}
