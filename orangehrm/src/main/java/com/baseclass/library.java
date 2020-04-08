package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class library {
protected WebDriver driver;
public void launchapp() throws IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\hp\\eclipse-manas\\orangehrm\\src\\test\\resources\\configurationpro\\config.pro");
Properties prop=new Properties();
prop.load(fis);
String browser =prop.getProperty("browser");
String url=prop.getProperty("url");
try {if(browser.equalsIgnoreCase("firefox"))
{
System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
driver =new FirefoxDriver();


}
else if(browser.equalsIgnoreCase("chrome"))
{
System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
driver=new ChromeDriver();

}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get(url);
}
catch(WebDriverException e) {
System.out.println("browser could not be launched");
}
}
}