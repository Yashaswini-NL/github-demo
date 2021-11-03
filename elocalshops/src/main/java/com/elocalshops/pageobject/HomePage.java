package com.elocalshops.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.elocalshops.uistore.HomePageUI;

public class HomePage {

	
	WebDriver driver;
	public HomePage(WebDriver driver) {   //Mapping driver to the driver which is currently working on using constructor 
		this.driver = driver;
	}
	
	public void searchItem(String itemName) {  //Used to search an item in search field
		searchBox().sendKeys(itemName);
		searchButton().click();
		
	}
	
	public void login() {   // Used to click on Login and to get into login page
		loginText().click();
	}
	
	
	// Returns various WebElements for the defined locators
	private WebElement searchBox() {
		return driver.findElement(HomePageUI.searchBox);
	}
	private WebElement searchButton() {
		return driver.findElement(HomePageUI.searchButton);
	}
	private WebElement loginText() {
		return driver.findElement(HomePageUI.loginText);
	}
	
}
