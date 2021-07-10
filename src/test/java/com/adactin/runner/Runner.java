package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.property.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature" , glue = "com\\adactin\\stepdefinition" ,
	monochrome = true, tags = "@mani"  ,plugin = {
			"pretty",
			"html:Report/HTML_Report" , 
			"json:Report/CucumberJSON_Report.json" , 
			"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"})


public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws Throwable {
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		
		driver = Base_Class.browserLauch(browser);
	}
	
	
	@AfterClass
	public static void tearDown() {
		driver.quit();

	}
	

}
