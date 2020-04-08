package com.pages;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class directory {

WebDriver driver;

@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[8]/a/b")WebElement directory ;
@FindBy(id="searchDirectory_emp_name_empName")WebElement name;
@FindBy(id="searchDirectory_job_title")WebElement title;

@FindBy (id="resetBtn")WebElement reset;

public directory(WebDriver driver) {
	PageFactory.initElements(driver, this);
}



public void fdirect () {
directory.click();

}

//to enter name
public void fname(String username) {
name.sendKeys(username);

}
// to enter Title
public void ftitle(String Title) {
Select position = new Select(title);
position.selectByVisibleText(Title);

}
/* // to enter location
public void flocation (String Location) {
Select place = new Select(driver.findElement(location));
place.selectByVisibleText(Location);
LOG.info("location entered");
} */
// to click search button
public void freset() {
reset.click();

}


}