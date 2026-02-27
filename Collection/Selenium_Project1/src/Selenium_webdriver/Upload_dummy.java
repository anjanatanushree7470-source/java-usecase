package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_dummy {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
	    driver.manage().window().maximize();
	    //driver.findElement(By.name("q")).sendKeys("official website of selenium");
	    driver.findElement(By.id("file-upload")).sendKeys("");
	    driver.findElement(By.id("file-submit")).submit();
	    driver.quit();
	}
}
