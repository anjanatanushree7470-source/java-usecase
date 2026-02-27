package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Website {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
    driver.findElement(By.id("a-truncate-cut")).click();
    
   
    Thread.sleep(10000);
    driver.quit();
}
}
