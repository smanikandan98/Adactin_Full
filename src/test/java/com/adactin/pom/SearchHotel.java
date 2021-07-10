package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	@FindBy (id = "location")
	private WebElement location;

	public WebDriver driver;
	
	public SearchHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getNos() {
		return nos;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy (id = "hotels")
	private WebElement hotels;
	
	@FindBy (id = "room_type")
	private WebElement rooms;
	
	@FindBy (id = "room_nos")
	private WebElement nos;
	
	@FindBy (id = "datepick_in")
	private WebElement date1;
	
	@FindBy (id = "datepick_out")
	private WebElement date2;
	
	@FindBy (id = "adult_room")
	private WebElement adult;
	
	@FindBy (id = "child_room")
	private WebElement child;
	
	@FindBy (id = "Submit")
	private WebElement search;

}
