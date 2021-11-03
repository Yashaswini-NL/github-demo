package com.elocalshops.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.elocalshops.uistore.ItemsPageUI;

public class ItemsPage {

	
	
	WebDriver driver;
	public ItemsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	public String searchBoxValue() {
		return searchBox().getAttribute("value");
	}
	
	private WebElement searchBox() {
		return driver.findElement(ItemsPageUI.searchbox);
	}
}
