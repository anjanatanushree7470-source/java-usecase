package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIPage;
import utilities.DataProviderClass;

public class GUITest extends BaseTest {

@Test(dataProvider="formData",dataProviderClass=DataProviderClass.class)

public void testForm(String name,String email,String phone,
String address,String gender,String day,
String country,String color){

GUIPage page=new GUIPage(driver);

page.enterName(name);
page.enterEmail(email);
page.enterPhone(phone);
page.enterAddress(address);

page.selectGender(gender);

page.selectDay(day);

page.selectCountry(country);

page.selectDate("04/10/2026");
String path=System.getProperty("user.dir")+"/src/test/resources/test.txt";
page.uploadFile(path);

page.moveSlider();

page.handleAlert();

page.doubleClick();

page.dragAndDrop();

}

}
