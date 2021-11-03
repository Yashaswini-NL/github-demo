package com.elocalshops.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.elocalshops.uistore.LoginPageUI;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	// To login into the page using provided email and passwords as arguements
	public void login(String email, String password) {
		email().sendKeys(email);
		password().sendKeys(password);
		submit().click();
		
	}
	
	// returns WebElements of the Particular locator
	private WebElement password() {
		return driver.findElement(LoginPageUI.password);
	}
	private WebElement email() {
		return driver.findElement(LoginPageUI.email);
	}
	private WebElement submit() {
		return driver.findElement(LoginPageUI.submit);
	}
}
