package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.pom.SelectHotel;
import com.adactin.property.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class SestepDefinition extends Base_Class{
	
	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	
	@When("^user select the radio button$")
	public void user_select_the_radio_button() throws Throwable {
		checkBox(pom.getInstanceSelect().getRadio());
	    
	}

	@Then("^user clicks the continue button$")
	public void user_clicks_the_continue_button() throws Throwable {
		checkBox(pom.getInstanceSelect().getProceed());
	    
	}

}
