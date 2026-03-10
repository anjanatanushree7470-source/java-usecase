package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class GUIPage {

WebDriver driver;

public GUIPage(WebDriver driver){
this.driver=driver;
}

By name=By.id("name");
By email=By.id("email");
By phone=By.id("phone");
By address=By.id("textarea");

By male=By.id("male");
By female=By.id("female");

By monday=By.id("monday");
By tuesday=By.id("tuesday");

By country=By.id("country");

By date=By.id("datepicker");

By upload=By.id("singleFileInput");

By slider=By.id("start-date");

By alertBtn=By.xpath("//button[contains(text(),'Alert')]");

By doubleClick=By.xpath("//button[contains(text(),'Copy')]");

By drag=By.id("draggable");
By drop=By.id("droppable");


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

public void selectGender(String gender){

if(gender.equalsIgnoreCase("Male"))
driver.findElement(male).click();

else
driver.findElement(female).click();
}

public void selectDay(String day){

if(day.equalsIgnoreCase("Monday"))
driver.findElement(monday).click();

if(day.equalsIgnoreCase("Tuesday"))
driver.findElement(tuesday).click();

}

public void selectCountry(String value){

Select select=new Select(driver.findElement(country));

select.selectByVisibleText(value);
}

public void selectDate(String d){

driver.findElement(date).sendKeys(d);
}

public void uploadFile(String path){

driver.findElement(upload).sendKeys(path);
}

public void moveSlider(){

WebElement s=driver.findElement(slider);

Actions act=new Actions(driver);

act.dragAndDropBy(s,50,0).perform();
}

public void handleAlert(){

driver.findElement(alertBtn).click();

Alert alert=driver.switchTo().alert();

alert.accept();
}

public void doubleClick(){

Actions act=new Actions(driver);

act.doubleClick(driver.findElement(doubleClick)).perform();
}

public void dragAndDrop(){

Actions act=new Actions(driver);

WebElement src=driver.findElement(drag);

WebElement dst=driver.findElement(drop);

act.dragAndDrop(src,dst).perform();
}

}
