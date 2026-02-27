package Selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest_Script {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajay anjana\\Desktop\\Selenium Integration\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.google.com/");
        System.out.println("Title: "+ driver.getTitle());
        driver.quit();
        }

}
