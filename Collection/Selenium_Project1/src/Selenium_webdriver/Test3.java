package Selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test3 {
public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ajay anjana\\Desktop\\Selenium Integration\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new EdgeDriver();
		try {
			driver.manage().window().minimize();
			driver.get("https://www.youtube.com/");
			
			String title=driver.getTitle();
			System.out.println("page Title: "+title);
			if(title.contains("YouTube"))
			{
				System.out.println("Test pass ");
			}
			else
			{
				System.out.println("Test fail ");
			}
		}
		catch(Exception e){
			
				System.out.println("Exception occured :" +e.getMessage());	
		}
		finally {
			driver.quit();
		}
	 
       }
}
