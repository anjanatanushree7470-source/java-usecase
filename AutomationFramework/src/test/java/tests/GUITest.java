package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIPage;

public class GUITest extends BaseTest {

@Test

public void fillForm(){

GUIPage page = new GUIPage(driver);

page.enterName("Tanushree");
page.enterEmail("tanushree@gmail.com");
page.enterPhone("9876543210");
page.enterAddress("New York");

page.selectGender();
page.selectDay();
page.selectCountry();

}

}
