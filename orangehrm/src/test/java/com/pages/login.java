package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class login {
WebDriver driver;
	

	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement username1;
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password1;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;

	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void username(String username) {
		username1.sendKeys(username);
	}

	public void password(String password) {

		password1.sendKeys(password);
	}

	public void loginbtn() {

		loginbtn.click();
		
	}

}
