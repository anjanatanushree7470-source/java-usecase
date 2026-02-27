package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_wesite {
	
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("official website of selenium");
    
    driver.findElement(By.name("q")).submit();
    driver.quit();
}
}


