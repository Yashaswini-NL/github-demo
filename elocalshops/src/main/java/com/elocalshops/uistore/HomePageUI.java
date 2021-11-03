package com.elocalshops.uistore;

import org.openqa.selenium.By;

public class HomePageUI {

	//Locator to to locate the SearchBox in the HomePage
	public static By searchBox = By.xpath("//input[@class='form-field-input live-search-form-field']");
	
	//Locator to to locate the searchButton in the HomePage
	public static By searchButton = By.xpath("//button[@class='live-search-button mdc-ripple-surface mdc-ripple-upgraded']");
	
	//Locator to to locate the Login  in the HomePage
	public static By loginText = By.linkText("Login");
}
