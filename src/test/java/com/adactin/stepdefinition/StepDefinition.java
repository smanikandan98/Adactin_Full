package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.pom.LoginPage;
import com.adactin.property.FileReaderManager;
import com.adactin.property.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class StepDefinition extends Base_Class {
	
	public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	@Before
	public void beforeHooks(Scenario scenario) {
		String status = scenario.getStatus();
		System.out.println("Scenario status: " +status);
		}
	@After
	public void afterHooks(Scenario scenario) throws Throwable {
		if (scenario.isFailed()) {
			
			takeScreenShot("C:\\Users\\MANIKANDAN\\eclipse-workspace\\AdactinProject\\screenshot\\img.png");
		}
		System.out.println("Exit from the page");
	}
	
	@Given("^user launches the url of adactin application$")
	public void user_launches_the_url_of_adactin_application() throws Throwable {
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		get(url);;
		
	}

	@When("^User enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
		sendKeys(pom.getInstanceLogin().getUsername(), arg1);
	    
	}

	@When("^User enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
		sendKeys(pom.getInstanceLogin().getPassword(), arg1);
	   
	}

	@When("^User clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		checkBox(pom.getInstanceLogin().getLogin());
	   
	}

	@Then("^User validate the login page$")
	public void user_validate_the_login_page() throws Throwable {
	   
	}

}
