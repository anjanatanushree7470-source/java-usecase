package Selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ajay anjana\\Desktop\\Selenium Integration\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			String title=driver.getTitle();
			System.out.println("page Title: "+title);
			if(title.contains("Google"))
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
