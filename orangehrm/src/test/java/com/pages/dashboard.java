package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {
	
	WebDriver driver;
	@FindBy(linkText = "Dashboard")
			WebElement dashboard;
	@FindBy(xpath = "//span[contains(text(),'Timesheets')]")
	WebElement timesheet;
	@FindBy(xpath = "//input[@id=\"employee\" and @type=\"text\" ]")
	WebElement employeenam;
	@FindBy(xpath = "//input[@type=\"button\" and @id=\"btnView\" ]")
	WebElement viewbtn;
	public dashboard(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver =driver;
	}
		public void dashboardmenu() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dashboard.click();
		}
		public void timesheet() {
			
			timesheet.click();
		}
		public void employeenam( String nam) {
			
			employeenam.sendKeys(nam);
		}
		public void viewbtn() {
			
			viewbtn.click();
		}
	

}
