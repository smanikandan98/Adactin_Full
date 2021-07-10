package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.pom.SearchHotel;
import com.adactin.property.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class ShstepDefinition extends Base_Class {
	
	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	@When("^User select the location$")
	public void user_select_the_location() throws Throwable {
		dropDown(pom.getInstanceHotel().getLocation(), "byvalue", "New York");
	   
	}

	@When("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		dropDown(pom.getInstanceHotel().getHotels(), "byvalue", "Hotel Sunshine");
	    
	}

	@When("^user select the room type$")
	public void user_select_the_room_type() throws Throwable {
		dropDown(pom.getInstanceHotel().getRooms(), "byvalue", "Super Deluxe");
	   
	}

	@When("^user select the number of rooms$")
	public void user_select_the_number_of_rooms() throws Throwable {
		dropDown(pom.getInstanceHotel().getNos(), "byvalue", "1");
	   
	}

	@When("^user clears the check in date$")
	public void user_clears_the_check_in_date() throws Throwable {
		erase(pom.getInstanceHotel().getDate1());
	}

	@When("^user enters the check in date$")
	public void user_enters_the_check_in_date() throws Throwable {
		sendKeys(pom.getInstanceHotel().getDate1(), "10/01/2022");
	  
	}

	@When("^user clears the check out date$")
	public void user_clears_the_check_out_date() throws Throwable {
		erase(pom.getInstanceHotel().getDate2());
	}

	@When("^user enters the check out date$")
	public void user_enters_the_check_out_date() throws Throwable {
		sendKeys(pom.getInstanceHotel().getDate2(), "14/01/2022");
	    
	}

	@When("^user select the adult room$")
	public void user_select_the_adult_room() throws Throwable {
		dropDown(pom.getInstanceHotel().getAdult(), "byvalue", "1");
	   
	}

	@When("^user select the child room$")
	public void user_select_the_child_room() throws Throwable {
		dropDown(pom.getInstanceHotel().getChild(), "byvalue", "0");
	    
	}

	@Then("^user clicks the submit button$")
	public void user_clicks_the_submit_button() throws Throwable {
		checkBox(pom.getInstanceHotel().getSearch());
	   
	}

}
