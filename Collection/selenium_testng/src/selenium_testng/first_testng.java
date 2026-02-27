package selenium_testng;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_testng {
	@Test
	public void openGoogle(){
	
		  WebDriver driver  = new ChromeDriver();
		    driver.get("https://www.google.com/");
		    driver.getTitle();
		   
		    driver.quit();
		
	}

}

