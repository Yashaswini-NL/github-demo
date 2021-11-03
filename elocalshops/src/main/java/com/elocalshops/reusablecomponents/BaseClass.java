package com.elocalshops.reusablecomponents;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.elocalshops.pageobject.HomePage;
import com.elocalshops.pageobject.ItemsPage;
import com.elocalshops.pageobject.Login;
import com.elocalshops.utilities.ConfigsProvider;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class BaseClass {
	
	public static WebDriver driver;
	public static Logger log;
	public static ConfigsProvider config;
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static HomePage homepage;
	public static Login login;
	public static ItemsPage items;
	
	@BeforeSuite
	public void startup() {
		
		log = Logger.getLogger(getClass());
		config = new ConfigsProvider();
		report = new ExtentReports(config.getConfig("extentReportPath"));
		test = report.startTest("BaseClass");
	}
	@BeforeClass
	public void beforeClass() {
		driver = WebDriverHelper.driverInitializer(driver, config.getConfig("browser"),  Integer.parseInt(config.getConfig("implicitWait")));
		log.info("Driver Initialised");
		
		homepage = new HomePage(driver);
		login = new Login(driver);
		items = new ItemsPage(driver);
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.get(config.getConfig("url"));
		log.info("Successfully opened the URL");
	}
	
	
	@AfterClass
	public void classTeardown() {
		WebDriverHelper.quitDriver(driver);
		log.info("Driver Closed");
	}
	@AfterSuite
	public void suiteTeardown() {
		report.endTest(test);
		report.flush();
	}
}
