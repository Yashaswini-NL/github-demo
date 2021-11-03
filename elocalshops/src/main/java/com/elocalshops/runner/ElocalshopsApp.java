package com.elocalshops.runner;

import org.testng.annotations.Test;

import com.elocalshops.reusablecomponents.BaseClass;
import com.elocalshops.utilities.Screenshot;
import com.relevantcodes.extentreports.LogStatus;

public class ElocalshopsApp extends BaseClass{

	@Test(priority=1)
	public void loginTest() {
		//Clicks on the Login which is available on homepage
		homepage.login();  
		log.debug("Successfully clicked on Login");
		//On successful clicking... System redirects to login page
		// System enters username and password and clicks on submit
		login.login("username","password");  
		log.debug("Successfully entered the login details");
		test.log(LogStatus.INFO, "System entered the login details");
	
	}
	
	@Test(priority=2)
	public void searchItemTest() {
		
		homepage.searchItem(config.getConfig("searchItem"));
		String testOut = items.searchBoxValue();
		
		if(testOut.equals(config.getConfig("searchItem"))) {
			log.info("System searched for desired item");
			test.log(LogStatus.PASS, "System searched for desired item");
		}
		else {
			log.error("System failed to search for desired item");
//			Screenshot.takeScreenshot();
			test.log(LogStatus.FAIL, "System failed to search for desired item");
		}
	}
	
	
}
