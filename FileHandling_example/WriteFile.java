package FileHandling_example;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer=new FileWriter("tech.txt");
			writer.write("welcome everyone");
			writer.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
