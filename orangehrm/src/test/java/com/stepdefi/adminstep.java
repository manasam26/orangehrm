package com.stepdefi;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.library;
import com.pages.admin;
import com.pages.login;
import com.selutil.selutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class adminstep extends library {
	final static Logger lOG = LogManager.getLogger(adminstep.class.getName());

	
	@Given("^i  will launch orangehrm page$")
	public void i_will_launch_orangehrm_page() throws IOException {
		launchapp();
		login  org=new login(driver);
		org.username("Admin");
		org.password("admin123");
		org.loginbtn();
		System.out.println("page is launched and user is logged in");
		lOG.info("page is launched and user is logged in" );
	}

	@Then("^i will select admin block$")
	public void i_will_select_admin_block()throws IOException {
admin adm=new admin(driver);
		adm.search_admin();
		
		lOG.info("admin is clicked" );
	
	}

	@Then("^i will enter usenname,role ,employee name and status$")
	public void i_will_enter_usenname_role_employee_name_and_status()throws IOException {
		admin adm=new admin(driver);
	adm.search_username("Admin");
	adm.search_userrole();
	adm.search_employeerole("john smith");
	adm.serach_status();
	lOG.info("username,role,employeename and status are entered" );
	
	}

	@Then("^i will click search bar$")
	public void i_will_click_search_bar()  throws IOException {
		admin adm=new admin(driver);
		adm.search_search();
		lOG.info("search button is clicked" );
		selutil util=new selutil(driver);
		util.takeSnapShot("C:/Users/hp/eclipse-manasa/cucumberhybrid/src/test/resources/screenshot//admin.png");
		lOG.info("screenshot is taken" );
		driver.quit();
	}


}

