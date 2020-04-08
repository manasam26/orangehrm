package com.stepdefi;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.library;
import com.pages.directory;
import com.pages.login;
import com.selutil.selutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class directorystep extends library {
	
	final static Logger lOG = LogManager.getLogger(directorystep.class.getName());

	@Given("^i will launch orangehrm webpage$")
	public void i_will_launch_orangehrm_webpage() throws IOException {
	launchapp();	
	login log=new login(driver);
	log.username("Admin");
	log.password("admin123");
	log.loginbtn();
	lOG.info("page is launched and user is logged in" );
	}
	@Then("^i will go the directory menu$")
	public void i_will_go_the_directory_menu() {
		directory dir= new directory(driver);
		dir.fdirect();
		lOG.info("directory is clicked" );
	}

	@Then("^i will give name and jobtitle$")
	public void i_will_give_name_and_jobtitle() {
		directory dir= new directory(driver);
		dir.fname("Steven Edwards");
		dir.ftitle("HR Manager");
		lOG.info("name and title are entered" );
	}

	@Then("^i will click on reset button$")
	public void i_will_click_on_reset_button() {
		directory dir= new directory(driver);
		dir.freset();
		lOG.info("rest button is clicked" );
		selutil util=new selutil(driver);
	
		util.takeSnapShot("C:/Users/hp/eclipse-manasa/cucumberhybrid/src/test/resources/screenshot//.png");
		lOG.info("screenshot is taken" );
	}


}
