package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class GUIPage {

WebDriver driver;

public GUIPage(WebDriver driver){

this.driver = driver;

}

By name = By.id("name");
By email = By.id("email");
By phone = By.id("phone");
By address = By.id("textarea");
By male = By.id("male");
By monday = By.id("monday");
By country = By.id("country");

public void enterName(String n){

driver.findElement(name).sendKeys(n);


}

public void enterEmail(String e){

driver.findElement(email).sendKeys(e);

}

public void enterPhone(String p){

driver.findElement(phone).sendKeys(p);

}

public void enterAddress(String a){

driver.findElement(address).sendKeys(a);

}

public void selectGender(){

driver.findElement(male).click();

}

public void selectDay(){

driver.findElement(monday).click();

}

public void selectCountry(){

Select dropdown =
new Select(driver.findElement(country));

dropdown.selectByVisibleText("India");

}

}
