package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	@FindBy (id = "radiobutton_0")
	private WebElement radio;
	private WebDriver driver;
	
	public SelectHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getProceed() {
		return proceed;
	}

	@FindBy (id = "continue")
	private WebElement proceed;

}
