package shree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_website {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	//driver.get("https://spcentral.amazon.in/");
	driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.findElement(By.className("nav-line-2 ")).click();
    //driver.findElement(By.id("ap_email")).sendKeys("anjanatanushree7470@gmail.com");
    //driver.findElement(By.className("a-button-input")).click();
    //driver.findElement(By.id("ap_password")).sendKeys("Chikiiii@444");
    //driver.findElement(By.className("a-button-input")).click();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
   // driver.findElement(By.id("a-truncate-cut")).click();
    
   
    Thread.sleep(10000);
    driver.quit();
}
}
