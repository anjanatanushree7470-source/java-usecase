package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;

import org.openqa.selenium.WebDriver;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = DriverFactory.initDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}