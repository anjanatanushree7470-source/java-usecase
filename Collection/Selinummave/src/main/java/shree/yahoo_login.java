package shree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo_login {public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.yahoo.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("login-username")).sendKeys("anjanashree7470");
    driver.findElement(By.name("signin")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.name("password")).sendKeys("sawantanu@1234");
    Thread.sleep(2000);
    driver.findElement(By.id("login-signin")).click();
    Thread.sleep(2000);
    
    System.out.println("successfully login");
    driver.quit();
}

}
