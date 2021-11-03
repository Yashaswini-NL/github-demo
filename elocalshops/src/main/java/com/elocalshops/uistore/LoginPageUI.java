package com.elocalshops.uistore;

import org.openqa.selenium.By;

public class LoginPageUI {

	
	public static By email = By.cssSelector("#customer_email");
	public static By password = By.cssSelector("#customer_password");
	public static By submit = By.xpath("//button[@class='button-primary form-action--submit mdc-ripple-surface mdc-ripple-upgraded']");
	
}
