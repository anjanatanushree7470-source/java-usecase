package shree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummywebsite_using_maven {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("user-name")).sendKeys("standard_user");
	    
	    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	    driver.findElement(By.name("login-button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("shopping_cart_link")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("checkout")).click();
	    Thread.sleep(2000);
        driver.findElement(By.name("firstName")).sendKeys("Tanushree"); 
	    driver.findElement(By.name("lastName")).sendKeys("Anjana"); 
	    driver.findElement(By.name("postalCode")).sendKeys("453551");
	    driver.findElement(By.name("continue")).click();
	    driver.findElement(By.name("finish")).click();
	    driver.findElement(By.name("back-to-products")).click();
	    Thread.sleep(10000);
	    System.out.println("successfully login");
	    driver.quit();
	}
}
