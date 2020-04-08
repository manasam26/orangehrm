package com.testrunner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class testrunner {

@RunWith(Cucumber.class)
@CucumberOptions(
   features="src/test/resources/features/",
	// tags= {"@tc_05_loginusingxl"},
glue= "com.stepdefi",
plugin = {"pretty", "html:target/cucumber-html-report",
            "json:target/cucumber-json-report",
            "junit:target/cucumber-junit-report",
            "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"}
   //tags = {"@tc_01_Login", "@tc_02_Admin", "@tc_03_Leave"},
   //monochrome = true    
)
public static class automationtestingLoginRunner
{
@AfterClass
public static void extentreport()
{
Reporter.loadXMLConfig("C:\\Users\\hp\\eclipse-manas\\linkedin\\src\\test\\resources\\testdata\\configpro.xml");
Reporter.setSystemInfo("user",System.getProperty("user.name"));
Reporter.setSystemInfo("os","Windows");
Reporter.setTestRunnerOutput("sample test runner output message");
}

}
}