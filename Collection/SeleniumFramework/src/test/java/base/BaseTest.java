package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

public class BaseTest {

	

	    public static WebDriver driver;

	    @BeforeMethod
	    public void setup() {

	        driver = new ChromeDriver();   // 🔥 Driver initialized here
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");
	    }

	    @AfterMethod
	    public void tearDown() {

	        driver.quit();   // 🔥 Now driver is not null
	    }

}
