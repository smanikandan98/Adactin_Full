package com.adactin.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.FillDetails;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private LoginPage login;
	private FillDetails fill;
	private SearchHotel hotel;
	private SelectHotel select;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	public LoginPage getInstanceLogin() {
		LoginPage Login = new LoginPage(driver);
		return Login;
		
	}
	
	public FillDetails getInstanceSearch() {
		FillDetails fill = new FillDetails(driver);
		return fill;
	}
	
	public SearchHotel getInstanceHotel() {
		SearchHotel hotel = new SearchHotel(driver);
		return hotel;
	
	}
	
	public SelectHotel getInstanceSelect() {
		SelectHotel select = new SelectHotel(driver);
		return select;
	}

}
