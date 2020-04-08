package com.stepdefi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import com.baseclass.library;
import com.pages.login;
import com.selutil.selutil;

@RunWith(Cucumber.class)
public class loginstep  extends library {
	login log;
	final static Logger lOG = LogManager.getLogger(loginstep.class.getName());

    @Given("^i will the  launch browser and open orangehrm webpage$")
    public void i_will_the_launch_browser_and_open_orangehrm_webpage() throws IOException {
    	launchapp();
    	lOG.info("browser is launched");
    	
    }

    @When("^login page appears  i will give \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_page_appears_i_will_give_something_and_something(String username, String password) {
    	log = new login(driver);
    	log.username(username);
    	log.password(password);
    	lOG.info("username and password are given");
    	
    }

    @And("^i will click on login button$")
    public void i_will_click_on_login_button() {
    	log = new login(driver);
    	log.loginbtn();
    	lOG.info("login button is clicked");
    	selutil util=new selutil(driver);
		util.takeSnapShot("C:/Users/hp/eclipse-manasa/cucumberhybrid/src/test/resources/screenshot//admin.png");
		lOG.info("screenshot is taken");
    	driver.quit();
    	
    }

}