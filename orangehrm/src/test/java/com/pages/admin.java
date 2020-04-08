package com.pages;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class admin {
	WebDriver driver;
	@FindBy(id="menu_admin_viewAdminModule") WebElement admin;
	@FindBy(id="searchSystemUser_userName")WebElement username;
	@FindBy(id="searchSystemUser_userType")WebElement userrole;
	@FindBy(xpath=("//*[@id=\"searchSystemUser_userType\"]/option[2]"))WebElement Admin;
	@FindBy(id="searchSystemUser_employeeName_empName")WebElement employeename;
	@FindBy(id="searchSystemUser_status")WebElement status;
	@FindBy(xpath="//*[@id=\"searchSystemUser_status\"]/option[1]")WebElement all;
	@FindBy(id="searchBtn")WebElement search;
	public admin(WebDriver driver)  throws IOException{
		PageFactory.initElements(driver, this);
}

public void search_admin() {
admin.click();
}

public void search_username(String name) {
	username.sendKeys(name);
}
public void search_userrole() {
userrole.click();
Admin.click();
}
public void search_employeerole(String empname) {
employeename.sendKeys(empname);
}
public void serach_status() {
status.click();
all.click();
}
public void search_search() {
search.click();
}
}
