package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.pom.FillDetails;
import com.adactin.property.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class FdStepDefinition extends Base_Class {
	
	public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@When("^User enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
		sendKeys(pom.getInstanceSearch().getFirst(), "Manikandan");
	   
	}

	@When("^User enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
		sendKeys(pom.getInstanceSearch().getLast(), "Shanmugam");
	   
	}

	@When("^user enter the billing address$")
	public void user_enter_the_billing_address() throws Throwable {
		sendKeys(pom.getInstanceSearch().getAddress(), "1583 Arockiya Nagar");
	    
	}

	@When("^user enter the credit card number$")
	public void user_enter_the_credit_card_number() throws Throwable {
		sendKeys(pom.getInstanceSearch().getCredit(), "1234567890123456");
	    
	}

	@When("^user select the credit card type$")
	public void user_select_the_credit_card_type() throws Throwable {
		dropDown(pom.getInstanceSearch().getType(), "byvalue", "VISA");
	    
	}

	@When("^user select the expiry month$")
	public void user_select_the_expiry_month() throws Throwable {
		dropDown(pom.getInstanceSearch().getCcexpiry(), "byvalue", "1");
	    
	}

	@When("^user select the year$")
	public void user_select_the_year() throws Throwable {
		dropDown(pom.getInstanceSearch().getCcyear(), "byvalue", "2015");
	   
	}

	@When("^user enter the cvv number$")
	public void user_enter_the_cvv_number() throws Throwable {
		sendKeys(pom.getInstanceSearch().getCcv(), "599");
	    
	}

	@Then("^user validate the book now$")
	public void user_validate_the_book_now() throws Throwable {
		checkBox(pom.getInstanceSearch().getBook());
	    
	}

}
