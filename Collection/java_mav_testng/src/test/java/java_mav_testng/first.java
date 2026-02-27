package java_mav_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class first {
	@Test
	public void openGoogle(){
		  WebDriver driver  = new ChromeDriver();
		    driver.get("https://www.google.com/");
		    driver.getTitle();
		   
		    driver.quit();
		  }
		
	}
	


