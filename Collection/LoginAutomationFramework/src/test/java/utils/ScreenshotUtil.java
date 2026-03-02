package utils;

import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

import base.BaseTest;

public class ScreenshotUtil {

    public static void capture(String testName) throws Exception {
        TakesScreenshot ts = (TakesScreenshot) BaseTest.driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshots/" + testName + ".png");
        FileHandler.copy(src, dest);
    }
}