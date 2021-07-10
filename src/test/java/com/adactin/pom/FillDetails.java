package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillDetails {
	

	private WebDriver driver;

	public FillDetails(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getCcexpiry() {
		return ccexpiry;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}

	@FindBy (id = "first_name")
	private WebElement first;
	
	@FindBy (id = "last_name")
	private WebElement last;
	
	@FindBy (id = "address")
	private WebElement address;
	
	@FindBy (id = "cc_num")
	private WebElement credit;
	
	@FindBy (id = "cc_type")
	private WebElement type;
	
	@FindBy (id = "cc_exp_month")
	private WebElement ccexpiry;
	
	@FindBy (id = "cc_exp_year")
	private WebElement ccyear;
	
	@FindBy (id = "cc_cvv")
	private WebElement ccv;
	
	@FindBy (id = "book_now")
	private WebElement book;
	

}
