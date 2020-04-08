package com.stepdefi;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.library;
import com.pages.dashboard;
import com.pages.login;
import com.selutil.selutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class dashboardstep extends library {
	final static Logger lOG = LogManager.getLogger(dashboardstep.class.getName());
	@Given("^i will open orangehrm webpage$")
	public void i_will_open_orangehrm_webpage() throws IOException {
		launchapp();
		login log=new login(driver);
		log.username("Admin");
		log.password("admin123");
		log.loginbtn();
		lOG.info("page is launched and user is logged in" );
	}

	@Then("^i will go to dashboard$")
	public void i_will_go_to_dashboard() {
		dashboard dash=new dashboard(driver);
		dash.dashboardmenu();
		lOG.info("dashboard is clicked" );
	}

	@Then("^i will click on timesheets$")
	public void i_will_click_on_timesheets() {
		dashboard dash=new dashboard(driver);
		dash.timesheet();
		lOG.info("timesheet is clicked" );
	}

	@Then("^i will enter the name$")
	public void i_will_enter_the_name() {
		dashboard dash=new dashboard(driver);
		dash.employeenam("Hannah Flores");
		lOG.info("employee name is entered" );
	}

	@Then("^click on view button$")
	public void click_on_view_button() {
		dashboard dash=new dashboard(driver);
		dash.viewbtn();
		lOG.info("view button is pressed" );
		selutil util=new selutil(driver);
		util.takeSnapShot("C:/Users/hp/eclipse-manasa/cucumberhybrid/src/test/resources/screenshot//admin.png");
		lOG.info("screenshot is taken" );
		driver.quit();
	}



}
