package FileHandling_example;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter write = new FileWriter("demo.txt", true);
			write.write("\nNew line added");
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
